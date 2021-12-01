package com.afs.oopractice;

public class HelloWorld {
    public static void main(String[] args) {
        Car car = new Car("Car",30);
        car.speedup();

        Truck truck = new Truck("Truck", 10);
        truck.speedup();
    }
}
