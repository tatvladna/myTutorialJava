package baseTasks;

public class Phone {
    private String number;
    private String model;
    private double weight;


    // конcтруктор без параметров
    public Phone () {
        this("Unknown", "Unknown", 0);
    }
    // конструктор с двумя параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    // конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall (String name) {
        System.out.println("Звонит " + name);
    }

    // перегруженный метод receiveCall
    public void receiveCall (String name, String number) {
        System.out.println("Звонит " + name + " с номера " + number);
    }

    // геттеры и сеттеры (JavaBean)
    public String getNumber(){
        return number;
    }

    public void sendMessage(String ...numbers) {
        int count = 1;
        System.out.println("Сообщение отправлено на номера: \n");
        for (String number: numbers) {
            System.out.println("\t" + count + ". " + number + "\n");
            count++;
        }
    }


    // метод  main для проверки
    public static void main(String[] args) {
        Phone phone1 = new Phone("9393", "samsung", 45.3);
        Phone phone2 = new Phone("323223", "iphone", 55.9);
        Phone phone3 = new Phone("232323", "iphone");

        System.out.println("Number: " + phone1.getNumber());
        phone2.receiveCall("Tanya", phone2.number);

        phone3.sendMessage("99999999", "3223233");

    }
}
