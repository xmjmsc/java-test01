package com.homework;

public class VehiclesFactory {
    private static Horse horse = new Horse();

    private VehiclesFactory() {
    }

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }
}
