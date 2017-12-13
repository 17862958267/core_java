package com.puhui.yst.staticproxy;

/**
 * 静态代理，代理的思想：不改变目标对象的前提下，通过代理类实现对目标对象的功能的增强
 */
public interface IuserDao {
    public void save();
}
