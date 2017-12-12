package com.puhui.yst.map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo {

    @Test
    public void test() {
        List<Student> list = new ArrayList<Student>();
        Student s = new Student("hrt", 12);
        Student s1 = new Student("tfb", 11);
        Student s2 = new Student("cvc", 18);
        Student s3 = new Student("ond", 45);
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //将字符转换为ascii值
        char c = 'a';
        System.out.println((byte) c);


        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                int num = s2.getAge() - s1.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        System.out.println(s1.getName().compareTo(s2.getName()));


        for (Student student : list) {
            System.out.println(student.getName() + "=====" + student.getAge());
        }

    }
}
