package com.puhui.yst;

import org.junit.Test;

public class Day2 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 42;
        if ((z++ == z) && (y = true)) {
            z++;
        }
        if ((x = false) || (++z == 46)) {
            z++;
        }
        //46
        System.out.println("z=" + z);
    }

    @Test
    public void test() {
        short a, b, c;
        a = 1;
        b = 2;
        //c=a+b;编译报错
        a += 2;
    }

    @Test
    public void test1() {
        int a = 10;
        int b = 10;

        int x = 10;
        int y = 21;
        int z = 10;
        //10
        System.out.println("后自加 a=" + (a++));
        //11
        System.out.println("a的值 a=" + a);
        //11
        System.out.println("前自加 b=" + (++b));
        System.out.println("---------------------");
        //false
        System.out.println("说 x>y,对吗？" + (x > y));
        System.out.println("认为 x>y 并且 x<y,对吗？" + ((x > y) && (x < y)));
        System.out.println("认为 x>=y 或者 x==y,对吗？" + ((x >= y) || (x == y)));
        System.out.println("认为 x<y 或者 x=z,对吗？" + ((x < y) || (x == z)));
        System.out.println("---------------------");
        System.out.println("a&x 的结果是：" + (a & x));
        System.out.println("a|x 的结果是：" + (a | x));
        System.out.println("y^z 的结果是：" + (y ^ z));
        System.out.println("---------------------");
        System.out.println("a 左移2位的结果是：" + (a << 2));
        System.out.println("y 右移3位的结果是：" + (y >> 3));
    }

    @Test
    public void test2() {
        int[] a = new int[5];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        for (int x : a) {
            System.out.print(x);
        }
    }

    @Test
    public void test3() {
        String str = "we_xue_yuan_is_not_good";
        String[] array = str.split("_");
        for (String a : array) {
            System.out.println(a);
        }
    }

    @Test
    public void test4() {
        String str = "abcdefghijklmnop";
        long times = 1000;
        long currentTime = System.currentTimeMillis();
        String str1 = "";
        //采用string方法
        for (int i = 0; i < times; i++) {
            str1 += str;
        }
        long currentTime2 = System.currentTimeMillis();
        System.out.println("time:" + (currentTime2 - currentTime));

        //采用stringbuilder 因为这里是单线程，如果是多线程，采用stringbuffer保证线程安全
        long currentTime3 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        long currentTime4 = System.currentTimeMillis();
        System.out.println(currentTime4 - currentTime3);
        StringBuffer buffer;
    }


}
