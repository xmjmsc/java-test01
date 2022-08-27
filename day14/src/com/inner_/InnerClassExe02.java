package com.inner_;

public class InnerClassExe02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });
    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClock(Bell bell) {//形参是接口类型
        bell.ring();
    }
}