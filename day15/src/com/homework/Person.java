package com.homework;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
//        Boat boat = VehiclesFactory.getBoat();
//        boat.work();
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void common() {
//        Horse horse = VehiclesFactory.getHorse();
//        horse.work();
        if (!(vehicles == null)) {
            vehicles = VehiclesFactory.getHorse();
        }
        //向上转型
        //接口调用
        vehicles.work();
    }
}
