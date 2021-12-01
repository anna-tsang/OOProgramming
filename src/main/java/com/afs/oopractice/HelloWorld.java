package com.afs.oopractice;

public class HelloWorld {
    public static void main(String[] args) {
        Car car = new Car("Car",30);
        car.speedup();

        Truck truck = new Truck("Truck", 10);
        truck.speedup();

        Driver carDriver = new Driver(new Car("Car", 30));
        carDriver.speedup();
        Driver truckDriver = new Driver(new Car("Truck", 10));
        truckDriver.speedup();

        //GasolineEngine gasolineEngine = new GasolineEngine();
    }
}
