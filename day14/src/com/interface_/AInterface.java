package com.interface_;

public interface AInterface {
    public int n1 = 10;

    public void hi();

    default public void ok() {//接口中的默认方法用关键字default修饰，也可用静态
    }

    ;
}
