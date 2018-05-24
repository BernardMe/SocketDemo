package t19.performance.tcp;

import java.io.IOException;

/**
 * Socket多线程编程实现
 * 考勤机性能测试TCPClient_
 * 端口9988
 *
 * 名词统一：
 * 考勤机
 * server
 *
 * @Author: wangzhuo
 * @Date: 5/10/2018 17:03
 */
public class TestTCPer {

    public static final String MONTH_31DAY = "01,03,05,07,08,10,12";
    public static final String MONTH_30DAY = "04,06,09,11";
    public static final String MONTH_28DAY = "02";
    //SN号前13位
    public static String PRE_SN = "5000000000000";
    public static String PRE_IP = "192.168.155.";
    //定义启动线程数量
    private int volume = 0;
    //定义目标IP
    private String destIp = null;
    //定义每人天记录条数
    private int count = 0;
    //定义fd
    private String fd = null;
    //月份
    private String mm = null;
    //开始时间am
    private String strTAM = null;
    //结束时间am
    private String endTAM = null;
    //开始时间pm
    private String strTpm = null;
    //结束时间pm
    private String endTpm = null;
    //days数组
    private String[] daysArr = null;
    //empId数组
    //private String[] empIdArr = null;
    //empName数组
    private String[] empNameArr = null;
    //声明考勤记录
    public String fakeRecord = null;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getDestIp() {
        return destIp;
    }

    public void setDestIp(String destIp) {
        this.destIp = destIp;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getFd() {
        return fd;
    }

    public void setFd(String fd) {
        this.fd = fd;
    }

    //使用String的split 方法
    public String[] convertStrToArray(String str){
        String[] strArray = null;
        strArray = str.split(","); //拆分字符为"," ,然后把结果交给数组strArray
        return strArray;
    }

    public void init()throws IOException {

        //开启10个线程
        for(int i=1; i<volume+1; i++){
            String sn = PRE_SN + (i<100 ? (i<10 ? "00"+ i : "0"+ i) : i);
            String ip = PRE_IP + i;
//            String sn = "8230000000000003";
//            String ip = "192.168.155.3";

            //TODO 开始发送TCP请求

            //100人
            empNameArr = new String[100];
            daysArr = new String[MONTH_31DAY.contains(mm) ? 31 : (MONTH_30DAY.contains(mm) ? 30 : 28)];

            //构建人员编号数据
            for (int j=0; j<empNameArr.length; j++) {
                empNameArr[j] = "1" + (j<1000 ? (j<100 ? (j<10 ? "000"+ j : "00"+ j): "0"+ j) : j);
            }

            //构建days数组
            for (int j=0; j<daysArr.length; j++) {
                daysArr[j] = "2018-"+ mm +"-" + (j<9 ? "0"+ (j+1) : (j+1));
            }

            fakeRecord = "Record(id=\"" + empNameArr[0] + "\" name=\"测试人员" + empNameArr[0] + "\" time=\"" + daysArr[0]+" 07:30:00\" type=\"face\" \r\n" +
                    "photo=\"/9j/4AAQSkZJRgABAQEAOABkAAD/2wBDAA0JCgsKCA0LCgsODg0PEyAVExISEyccHhcgLikx\n" +
                    "etJRQAdqaaWkNAhKBRSgUhhSU4im0wCnLTe1OFADxRmkHFIaAF6ml70mKWkIcKQmg000DP/Z\n" +
                    "\")";



            //用线程模拟循环
            new Thread(new Streamer(sn, ip.substring(ip.length()-3), daysArr, empNameArr, destIp, count, strTAM, endTAM, strTpm, endTpm, fakeRecord)).start();// 启动发送端线程


        }

    }


    public static void main(String[] args) throws Exception {

        TestTCPer cl = new TestTCPer();
        cl.setVolume(Integer.valueOf(args[0]));
        cl.setDestIp(args[1]);
        cl.setCount(Integer.valueOf(args[2]));
        cl.setFd(args[3]);
        cl.mm = args[4];
        cl.strTAM = args[5];
        cl.endTAM = args[6];
        cl.strTpm = args[7];
        cl.endTpm = args[8];

        cl.init();
    }
}

