package com.puhui.yst.socket;

import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * tcp发送数据协议
 */
public class TcpSend {
     @Test
     public void test()throws IOException{
         Socket s = new Socket("127.0.0.1",11123);
         OutputStream os = s.getOutputStream();
         os.write("hi,tcp".getBytes());
         os.close();
     }
}
