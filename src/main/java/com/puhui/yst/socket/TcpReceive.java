package com.puhui.yst.socket;

import org.junit.Test;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpReceive {

    @Test
    public void test() throws Exception {
        //创建服务端对象并监听端口号
        ServerSocket ss = new ServerSocket(11123);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int length = is.read(bys);
        String str = new String(bys, 0, length);
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "---" + str);
        s.close();
    }
}
