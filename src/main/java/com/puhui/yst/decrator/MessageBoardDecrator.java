package com.puhui.yst.decrator;

/**
 * 装饰角色
 */
public class MessageBoardDecrator implements MessageBoardHandler {
    private MessageBoardHandler messageBoardHandler;

    public MessageBoardDecrator(MessageBoardHandler messageBoardHandler) {
        super();
        this.messageBoardHandler = messageBoardHandler;
    }

    public String filter(String msg) {
        return messageBoardHandler.filter(msg);
    }
}
