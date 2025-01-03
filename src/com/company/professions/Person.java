package com.company.professions;

public class Person {
    private String firstName;
    private String lastName;
    private double age;

    public Person(String firstName, String lastName, double age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public void setAge(double age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String toString() {
        return "fullName='" + firstName + " " + lastName + "', age=" + age;
    }

}
