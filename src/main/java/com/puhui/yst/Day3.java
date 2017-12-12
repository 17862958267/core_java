package com.puhui.yst;

/**
 * 不能直接将父类的对象强制转换为子类类型，
 * 只能将向上转型后的子类对象再次转换为子类类型。
 * 也就是说，子类对象必须向上转型后，才能再向下转型
 */
public class Day3 {
    public static void main(String[] args) {
        SuperClass superObj = new SuperClass();
        SonClass sonObj = new SonClass();
        //superObj不是sonClass类的实例
        if (superObj instanceof SonClass) {
            SonClass sonObj1 = (SonClass) superObj;
        } else {
            System.out.println("①不能转换");
        }

        superObj = sonObj;
        // superObj 是 SonClass 类的实例
        if (superObj instanceof SonClass) {
            SonClass sonObj2 = (SonClass) superObj;
        } else {
            System.out.println("②不能转换");
        }
    }


}

class SuperClass {

}

class SonClass extends SuperClass {

}
