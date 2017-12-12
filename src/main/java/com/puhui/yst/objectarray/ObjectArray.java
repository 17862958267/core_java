package com.puhui.yst.objectarray;

public class ObjectArray {
    public static void main(String[] args) {
        Student[] student = new Student[4];
        Student s1 = new Student("绪鑫", 12);
        Student s2 = new Student("王鑫", 11);
        Student s3 = new Student("李鑫", 13);
        Student s4 = new Student("刘鑫", 14);
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
        student[3] = s4;
        for (int i = 0; i < student.length; i++) {
            Student s = student[i];
            System.out.println(s.getName());
        }
    }
}
