package com.puhui.yst.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型通配符
 */
public class GenericDemo2 {
    public static void main(){
        Collection<Object> c1 = new ArrayList<Object>();

        Collection<?> c5 = new ArrayList<Object>();
        Collection<?> c6 = new ArrayList<Animal>();
        Collection<?> c7 = new ArrayList<Dog>();
        Collection<?> c8 = new ArrayList<Cat>();


        Collection<? extends Animal> c10 = new ArrayList<Animal>();
        Collection<? extends Animal> c11 = new ArrayList<Dog>();
        Collection<? extends Animal> c12 = new ArrayList<Cat>();


        //Collection<? super Animal> c13 = new ArrayList<Object>();
        Collection<? super Animal> c14 = new ArrayList<Animal>();
    }
}




class Animal{

}

class Dog extends Animal{

}

class Cat extends Animal{

}

