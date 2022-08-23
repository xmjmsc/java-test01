package com.abstract_;

abstract public class Template {
    public abstract void job();// 抽象方法

    public void calculateTime() {// 普通方法
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }
}
