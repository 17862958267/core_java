package com.puhui.yst.set;

import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetComparator {

    @Test
    public void test() {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
                int num4 = num3 == 0 ? s1.getEnglish() - s2.getEnglish() : num3;
                int num5 = num4 == 0 ? s1.getName().compareTo(s2.getName()) : num4;
                return num5;
            }
        });
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            String chineseString = sc.nextLine();
            String mathString = sc.nextLine();
            String englishString = sc.nextLine();
            Student s = new Student();
            s.setName(name);
            s.setChinese(Integer.parseInt(chineseString));
            s.setEnglish(Integer.parseInt(englishString));
            s.setMath(Integer.parseInt(mathString));
            ts.add(s);
        }
    }
}
