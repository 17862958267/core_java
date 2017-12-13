package com.puhui.yst.decrator;

/**
 * 用户留言具体实现类
 */
public class MessageBoard implements MessageBoardHandler {
    public String filter(String msg) {
        return "留言板上的内容" + msg;
    }
}
