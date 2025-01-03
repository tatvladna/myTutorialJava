/*
решение задачи с https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
*/

package shop;

public class User {
    private String name;
    private String login;
    private String password;
    private Basket basket = new Basket();

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User: " +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", basket=" + basket;
    }

    static public void main(String[] args){
        User user = new User("John Doe", "john_doe@mail.ru", "password123");
        System.out.println(user);
        Product p1 = new Product("яблоко", 150, 8);
        user.basket.addProduct(p1);
        System.out.println(user);
    }
}
