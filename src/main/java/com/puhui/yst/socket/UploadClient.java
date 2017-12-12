package com.puhui.yst.socket;

import java.io.*;
import java.net.Socket;

public class UploadClient {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket s = new Socket("127.0.0.1", 8083);
        //封装文本文件
        BufferedReader br = new BufferedReader(new FileReader("f:\\c.txt"));
        //封装通道内流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //通知服务器别等我了，没有数据了
        s.shutdownOutput();
        //接收反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String client = brClient.readLine();
        System.out.println(client);
        br.close();
        s.close();
    }
}
