package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private double carrying;
    public Lorry(String brand, double weight, Driver driver, Engine engine, double carrying) {
        super(brand, weight, driver, engine);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "--------- Lorry -----------" + super.toString() + "\nCarrying: " + carrying;
    }

    static public void main(String[] args) {
        Driver driver = new Driver("John", "Doe", 35, 12.2);
        Engine engine = new Engine(9000, 1200);
        Lorry lorry = new Lorry("Ford", 1000, driver, engine, 500);
        System.out.println(lorry.toString());
    }
}
