package baseTasks;

public class Person {
    private String fullName;
    private double age;

    public Person () {
        this("Unknown", 0);
    }

    public Person(String fullName, double age) {
        this.fullName = fullName;
        this.age = age;
    }


    public void move() {
        System.out.println(fullName + " is moving");
    }

    public void talk() {
        System.out.println(fullName + " is talking");
    }

    public static void main (String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Tanya", 23);

        person1.move();
        person2.talk();
        person2.talk();
    }
}
