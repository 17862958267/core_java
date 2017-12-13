package com.puhui.yst.staticproxy;

/**
 * 目标对象，实现接口
 */
public class UserDao implements IuserDao {
    public void save() {
        System.out.println("数据已经保存了！");
    }
}
