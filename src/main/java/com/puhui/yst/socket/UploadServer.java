package com.puhui.yst.socket;

import org.junit.Test;

import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
    @Test
    public void test() throws Exception{
        while (true){
            // 创建服务器Socket对象
            ServerSocket ss = new ServerSocket(8083);
            Socket s = ss.accept();
            new Thread(new UserThread(s)).start();
        }
    }
}
