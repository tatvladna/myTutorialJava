/*
    решение задачи с сайта https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
*/

package com.company.vehicles;
import com.company.professions.Driver;
import com.company.details.Engine;

public class Car {
    private String brand;
    private double weight;
    private Driver driver; // водитель
    private Engine engine; // двигеатель



    public Car(String brand, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println(brand + " вместе с " + driver.getFirstName() + " " + driver.getLastName() + " поехала.");
    }

    public void stop() {
        System.out.println(brand + " остановилась.");
    }

    public void turnRight () {
        System.out.println(brand + " повернулась направо.");
    }
    public void turnLeft () {
        System.out.println(brand + " повернулась налево.");
    }

    public String toString() {
        return  "Brand: '" + brand + "' \nWeight: " + weight + "\n" +
                 driver.toString() + "\n" + engine.toString();
    }

    public static void main(String[] args) {
        Driver driver = new Driver("Jhon", "Smith", 35, 5.5);
        Engine engine = new Engine(200, 100);
        Car car = new Car("BMW", 1500, driver, engine);

        System.out.println(car.toString());
        car.start();
        car.turnRight();
        car.stop();
    }
}
