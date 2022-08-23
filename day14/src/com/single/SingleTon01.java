package com.single;
/*
单例模式应用实例
1 构造器私有化  -->  不能new对象
2 内的内部创建对象
3 向外提供一个公共的访问对象
4 代码实现
 */

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

    }
}

class GirlFriend {
    private String name;
    private static GirlFriend gf = new GirlFriend("小张");

    //只有静态方法访问静态对象
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;

    }
}