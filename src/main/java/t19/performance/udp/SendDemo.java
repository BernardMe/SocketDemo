package t19.performance.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Datagram发送线程类
 * 假考勤机性能测试_UDP心跳包发送工具
 * 目标端口9925
 *
 * 名词统一：
 * 考勤机
 * server
 *
 * @Author: wangzhuo
 * @Date: 5/4/2018 09:24
 */
class SendDemo implements Runnable {

    // 定义发送数据报的目的port
    public static final int DEST_PORT = 9925;
    // 定义发送数据报的目的IP
    public static String DEST_IP = null;
    // 定义发送UDP心跳数据报的数据报内容
    private String beatsPack = "";
    private DatagramSocket ds;
    //定义IP末三位
    private String num;
    private int count = 0;

    // 有参数构造函数
    public SendDemo(String num, String beatsPack, DatagramSocket ds, String destIp) {
        this.num = num;
        this.beatsPack = beatsPack;
        this.ds = ds;
        this.DEST_IP = destIp;
    }

    @Override
    public void run() {
        //TODO 考勤机主动发UDP心跳包
        try {
            BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

            //循环
            while (true) {
                byte[] buf = this.beatsPack.getBytes();

                //先创建数据包
                DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName(DEST_IP), DEST_PORT);
                //ds发送出去
                ds.send(dp);

                System.out.println("Thread-" + Thread.currentThread().getId() + "===" + this.num + "-->" + "Heart Beats[" + DEST_IP + "]-->"+ count++);

                //线程休眠30s
                Thread.sleep(30000);

            }
            //ds.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UDP连接异常");
        }
    }
}
