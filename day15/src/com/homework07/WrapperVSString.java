package com.homework07;

public class WrapperVSString {
    public static void main(String[] args) {
        Integer i = 100;
        //包装类（Integer）-> String
        String str1 = i + "";
        String str2 = i.toString();
        String str3 = i + "";

        //String -> 包装类（Integer）
        String str4 = "123456";
        Integer i2 = Integer.parseInt(str4);
        Integer i3 = new Integer(str4);

    }
}
