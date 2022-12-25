package com.arraylist01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DogCollection {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("大黄", 3));
        list.add(new Dog("小黑", 9));
        list.add(new Dog("小白", 5));

        for (Object dog : list) {
            System.out.println("dog=" + dog);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println("dog=" + dog);
        }
    }
}

