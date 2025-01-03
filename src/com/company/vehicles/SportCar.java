package com.company.vehicles;

import com.company.professions.Driver;
import com.company.details.Engine;

public class SportCar extends Car{
    private double speed;

    public SportCar(String brand, double weight, Driver driver, Engine engine, double speed) {
        super(brand, weight, driver, engine);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "---------  SportCar ----------\n" + super.toString() + "\nSpeed: " + speed + " km/h";
    }
    static public void main(String[] args){

        Engine engine = new Engine(5000, 60000);
        Driver driver = new Driver("John",  "Doe", 55, 25);
        SportCar sportCar = new SportCar("Ferrari", 1500, driver, engine, 320);

        // Show info
        System.out.println(sportCar.toString());
    }
}
