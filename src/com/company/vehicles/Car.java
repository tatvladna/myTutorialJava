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
}
