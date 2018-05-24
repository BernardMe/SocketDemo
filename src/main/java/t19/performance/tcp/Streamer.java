package t19.performance.tcp;

import Com.FirstSolver.Splash.ISecurity;
import Com.FirstSolver.Splash.NetworkStreamPlus;
import com.hanwang.common.Constants;
import com.hanwang.common.util.StringUtil;
import t19.performance.RandTimeUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

class Streamer implements Runnable {

    // 定义发送数据报的目的port
    public static final int DEST_PORT = 9988;
    // 定义发送数据报的目的IP
    public static String DEST_IP = null;
    //定义NetworkStreamPlus
    public NetworkStreamPlus stream = null;
    //定义人员Id
    private int empId = 0;
    //定义每人天记录条数
    private int count = 0;
    //开始时间am
    private String strTAM = null;
    //结束时间am
    private String endTAM = null;
    //开始时间pm
    private String strTpm = null;
    //结束时间pm
    private String endTpm = null;
    //empId数组
    private String[] empIdArr = null;
    //empName数组
    private String[] empNameArr = null;
    //days数组
    private String[] daysArr = null;
    // 定义发送考勤记录的数据内容
    public static String fakeRecord = null;

    //定义Client序列号
    private String sn = "";
    //定义IP末三位
    private String num;

    // 有参数构造函数
    public Streamer(String sn, String num, String[] daysArr, String[] empNameArr, String destIp, int count, String strTAM, String endTAM, String strTpm, String endTpm, String fakeRecord) {
        this.sn = sn;
        this.num = num;
        this.daysArr = daysArr;
        this.empNameArr = empNameArr;
        this.DEST_IP = destIp;
        this.count = count;
        this.strTAM = strTAM;
        this.endTAM = endTAM;
        this.strTpm = strTpm;
        this.endTpm = endTpm;
        //外部传入考勤记录模板
        this.fakeRecord = fakeRecord;
    }

    public static String getFakeRecord() {
        return fakeRecord;
    }

    public static void setFakeRecord(String fakeRecord) {
        Streamer.fakeRecord = fakeRecord;
    }

    @Override
    public void run() {
        try {
            //TODO 考勤机主动发TCP连接上传考勤记录
            //days循环
            for (int d=0; d<daysArr.length; d++){

                //人员循环
                for (int i = 0; i<empNameArr.length; i++) {

                    //上班记录和下班记录count条
                    for (int j = 0; j < count; j++) {

                        //Socket socket = null;

                        /**
                         *  Client先写输出，再读输入
                         */

                        //如果读取的info为null，设备向server发出TCP请求
                        if (null == stream) {
                            //创建Socket对象，用于连接Server             Client需要确定Server的IP和port
                            Socket socket = new Socket(DEST_IP, DEST_PORT);

                            //构建stream
                            stream = new NetworkStreamPlus(socket, new ISecurity() {
                                @Override
                                public byte[] Encode(byte[] bytes, int i, int i1) throws Exception {
                                    return new byte[0];
                                }

                                @Override
                                public byte[] Decode(byte[] bytes, int i, int i1) throws Exception {
                                    return new byte[0];
                                }

                                @Override
                                public void ResetEncoder() {

                                }

                                @Override
                                public void ResetDecoder() {

                                }

                                @Override
                                public void setSecretKey(String s) throws Exception {

                                }

                                @Override
                                public String getSecretKey() {
                                    return null;
                                }

                                @Override
                                public void close() throws IOException {

                                }
                            }, false, true);

                            //向服务器端传递信息
                            OutputStream ots = socket.getOutputStream();
                            PrintWriter pw = new PrintWriter(ots);
                            pw.write("PostRecord(sn=\""+ sn +"\")");
                            pw.flush();

                            System.out.println("Thread-" + Thread.currentThread().getId() + "PostRecord(sn=\""+ sn +"\")" );
                        }

                        // 读取stream
                        String info = stream.Read(Constants.DEVICE_CHARSET);

                        if (!StringUtil.isEmptyString(info)) {
                            System.out.println("Thread-" + Thread.currentThread().getId() + "===" + this.num + "<- " + info + "<- info");

                            //服务器应答允许上传 && 要发考勤照片
                            if (info.startsWith("Return(result=\"success\" postphoto=\"true\")")) {
                                //模拟真实考勤机上传考勤数据
                                stream.Write(fakeRecord, Constants.DEVICE_CHARSET);
                                //控制台log
                                System.out.println("Thread-" + Thread.currentThread().getId() + "===" + this.num + "Record && photo --> Finish[" + DEST_IP + "] --> " + empNameArr[i]);

                                //stream值为null
                            /*stream = null;
                            if (null !=)
                            socket.close();*/

                            } else if (info.startsWith("Return(result=\"success\" postphoto=\"false\")")) {
                                //服务器应答允许上传 && 不需要发照片
                                // 先获取 适当的时间
                                String dateStr = j < (count / 2) ? getAttendanceTime(daysArr[d], strTAM, endTAM) : getAttendanceTime(daysArr[d], strTpm, endTpm);
                                //构造考勤记录
                                String fakeRecord = "Record(id=\""+empNameArr[i]+"\" name=\"测试人员"+empNameArr[i]+"\" time=\"" + dateStr + "\" type=\"face\")";
                                //模拟真实考勤机上传考勤数据
                                stream.Write(fakeRecord, Constants.DEVICE_CHARSET);
                                //控制台log
                                System.out.println("Thread-" + Thread.currentThread().getId() + "===" + this.num + "Record WITHOUT p --> Fin[" + DEST_IP + "]" );

                            } else if (info.equals("Return(result=\"success\")")) {
                                // 服务器应答 记录保存成功
                                //TODO 修改fakeRecord模板
                                // 先获取 适当的时间
                                String dateStr = j < (count / 2) ? getAttendanceTime(daysArr[d], strTAM, endTAM) : getAttendanceTime(daysArr[d], strTpm, endTpm);

                                //
                                fakeRecord = "Record(id=\"" + empNameArr[i] + "\" name=\"测试人员" + empNameArr[i] + "\" time=\"" + dateStr + "\" type=\"face\" \r\n" +
                                        "photo=\"/9j/4AAQSkZJRgABAQEAOABkAAD/2wBDAA0JCgsKCA0LCgsODg0PEyAVExISEyccHhcgLikx\n" +
                                        "MC4pLSwzOko+MzZGNywtQFdBRkxOUlNSMj5aYVpQYEpRUk//2wBDAQ4ODhMREyYVFSZPNS01\n" +
                                        "etJRQAdqaaWkNAhKBRSgUhhSU4im0wCnLTe1OFADxRmkHFIaAF6ml70mKWkIcKQmg000DP/Z\n" +
                                        "\")";
                                //模拟真实考勤机上传考勤数据
                                stream.Write(fakeRecord, Constants.DEVICE_CHARSET);
                                //控制台log
                                System.out.println("Thread-" + Thread.currentThread().getId() + "===" + this.num + "Record && photo --> Finish[" + DEST_IP + "] --> " + empNameArr[i]);

                                //继续发送下一条
                                if (i >= empNameArr.length) {
                                    //模拟真实考勤机发送Quit
                                    stream.Write("Quit()", Constants.DEVICE_CHARSET);
                                }
                            } else if (info.startsWith("SetEmployee")){
                                //下发人员模板
                                stream.Write("Return(result=\"success\" )", Constants.DEVICE_CHARSET);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("TCP连接异常");
        }
    }

    /**
     * 根据上班时间和下班时间产生打卡时间
     */
    public String getAttendanceTime(String day, String strT, String endT) {
        Date randomDate = RandTimeUtils.randomDate(day +" "+strT, day +" "+endT);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String resulttime = format.format(randomDate);//构造开始日期
        System.out.println("Thread-" + Thread.currentThread().getId() + "===" + resulttime);
        return resulttime;
    }

    /**
     * 修改fakeRecord模板构造上传考勤记录
     */
    public String generateRecord() {
        return  "";
    }

}