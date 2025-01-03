package com.company.professions;

public class Driver extends Person{

    private double drivingExperience;

    public Driver(String firstName, String lastName, double age, double drivingExperience) {
        super(firstName, lastName, age);
        this.drivingExperience = drivingExperience;
    }

    public Driver(Person person, double drivingExperience) {
        super(person.getFirstName(), person.getLastName(), person.getAge());
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver: " + super.toString() + ", drivingExperience=" + drivingExperience;
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", "Smith", 25.5);

        System.out.println(p1.getAge());

//        System.out.println(p1.showInfo());

        Driver d1 = new Driver(p1, 10.5);

        System.out.println(d1.toString());

    }
}
