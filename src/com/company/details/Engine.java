package com.company.details;

public class Engine {
    private double power;
    private double performance;

    public Engine(double power, double performance) {
        this.power = power;
        this.performance = performance;
    }

    public double getPower() {
        return power;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

    public String toString() {
        return "Engine: power = " + power + ", performance = " + performance;
    }
}
