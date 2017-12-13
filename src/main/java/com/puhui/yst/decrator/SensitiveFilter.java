package com.puhui.yst.decrator;

/**
 * 具体的装饰角色，增加过滤掉政治敏感字眼功能
 */
public class SensitiveFilter extends MessageBoardDecrator {
    public SensitiveFilter(MessageBoardHandler messageBoardHandler) {
        super(messageBoardHandler);
    }
    public String filter(String content) {
        String temp = super.filter(content);
        temp += "^^过滤掉政治敏感的字眼!^^";
        return temp;
    }
}
