package com.puhui.yst.staticproxy;

/**
 * 代理对象，也需要实现接口
 */
public class UserDaoProxy implements IuserDao {
    private IuserDao target;

    public UserDaoProxy(IuserDao target) {
        this.target = target;
    }

    public void save() {
        System.out.println("开始事务！");
        //执行目标对象的方法
        target.save();
        System.out.println("结束事务！");
    }
}
