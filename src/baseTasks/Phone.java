package baseTasks;

public class Phone {
    private String number;
    private String model;
    private double weight;


    public Phone () {
        this("Unknown", "Unknown", 0);
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // геттеры и сеттеры (JavaBean)
    public String getNumber(){
        return number;
    }


    // метод  main для проверки
    public static void main(String[] args) {
        Phone phone1 = new Phone("9393", "samsung", 45.3);
        Phone phone2 = new Phone("323223", "iphone", 55.9);

        System.out.println("Number: " + phone1.getNumber());

    }
}
