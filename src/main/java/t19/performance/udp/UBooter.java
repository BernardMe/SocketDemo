package t19.performance.udp;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import t19.performance.RandTimeUtils;
import t19.performance.dao.BasicInfoDao;
import t19.performance.model.BasicInfo;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Date;

/**
 * UDP多线程booter
 *
 *
 * @Author: wangzhuo
 * @Date: 5/18/2018 11:35
 */
public class UBooter {

    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    private static final Logger logger = Logger.getLogger(UBooter.class);

    static{
        try{
            reader = Resources.getResourceAsReader("Configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public static void main(String[] args) throws IOException {
        UBooter.domainId = Integer.valueOf(args[0]);
        UBooter uBooter = new UBooter();
        uBooter.setVolume(Integer.valueOf(args[1]));
        uBooter.destIp = args[2];

        uBooter.addDevice();
    }

    //SN号前13位
    public static String PRE_SN = "5000000000000";
    public static String PRE_IP = "192.168.155.";
    public static BigDecimal oneTimeDecimal = new BigDecimal(0.10);
    //企业域id
    public static int domainId = -1;
    //定义启动线程数量
    private int volume = 0;
    //定义目标IP
    private String destIp = null;


    public void addDevice() throws SocketException {
        oneTimeDecimal.setScale(2, BigDecimal.ROUND_DOWN);
        SqlSession session = sqlSessionFactory.openSession();

        //获取basicInfoDao1
        BasicInfoDao basicInfoDao = session.getMapper(BasicInfoDao.class);

        //设备list

        for(int i=1; i<volume+1; i++){
            String sn = PRE_SN + (i<100 ? (i<10 ? "00"+ i : "0"+ i) : i);
            String ip = PRE_IP + i;

            String beginDate = String.format("%d-%2d-%2d %s:%s:%s", 2018,4,1,"07","00","00");
            String endDate = String.format("%d-%2d-%2d %s:%s:%s", 2018,4,1,"23","59","59");
            Date date = RandTimeUtils.randomDate(beginDate, endDate);
            //添加
            basicInfoDao.insert(getBasicInfo(domainId, sn, date,"wz_TestKQ"+(i<100 ? (i<10 ? "00"+ i : "0"+ i) : i), ip));

            //TODO 开始发送UDP数据报
            //构建线程发送的UDP报文
            String beatsPack = "DevStatus(sn=\"" + sn + "\" ip=\"" + ip + "\")";
            DatagramSocket send = new DatagramSocket();

            //用线程模拟循环
            new Thread(new SendDemo(ip.substring(ip.length()-3), beatsPack, send, destIp)).start();// 启动发送端线程
        }
        session.commit();
    }

    //获取carPassRecordInfo对象
    public static BasicInfo getBasicInfo(int domainId, String sn, Date dt, String name, String ip){
        BasicInfo basicInfo = new BasicInfo();

        basicInfo.setId(null);
        basicInfo.setLocationId(223);
        basicInfo.setName(name);
        basicInfo.setSnCode(sn);
        basicInfo.setUpdateTime(dt);
        basicInfo.setConnectionTime(dt);
        basicInfo.setIsUsed((byte) 1);
        basicInfo.setFirmware("2.340.260");
        basicInfo.setDeviceType((byte) 1);
        basicInfo.setConnectionState((byte) 1);
        basicInfo.setIpAddress(ip);
        basicInfo.setPort("");
        basicInfo.setPwd("");
        basicInfo.setUsedAmount(1);
        basicInfo.setTotalAmount(1000);
        basicInfo.setUsedRecordAmount(1);
        basicInfo.setTotalRecordAmount(150000);
        basicInfo.setIsUsedNormal(null);
        basicInfo.setIsRecordNormal(null);
        basicInfo.setMacAddress(null);
        basicInfo.setMemo(null);
        basicInfo.setDepartmentId(1002);
        basicInfo.setFactory("");
        basicInfo.setType("");
        basicInfo.setUseFor("11");
        basicInfo.setDomainId(domainId);
        basicInfo.setPosition("2A大会议室");

        return basicInfo;
    }
}
