package com.puhui.yst.decrator;

/**
 * 具体的装饰角色，增加过滤掉html标签的功能
 */
public class HtmlFilter extends MessageBoardDecrator {
    public HtmlFilter(MessageBoardHandler handler) {
        super(handler);
    }

    public String filter(String content) {
        String temp = super.filter(content);
        temp += "^^过滤掉HTML标签!^^";
        return temp;
    }
}
