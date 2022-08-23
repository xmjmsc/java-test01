package com.single;

/*
 * 懒汉式单例模式
 * */
public class SingleTon02 {
}

class Cat {
    private String name;
    private static Cat cat;

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("小猫猫");
        }
        return cat;
    }
}


