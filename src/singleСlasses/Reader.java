/*
    задача с https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
 */

package singleСlasses;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String firstName;
    private String lastName;
    private int libraryCardNumber;
    private String birthday;
    private String phoneNumber;
    private List<String> books = new ArrayList<>();

    public Reader(String firstName, String lastName, int libraryCardNumber, String birthday, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.libraryCardNumber = libraryCardNumber;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(String book) {
        System.out.println(firstName  + " " + lastName + " взял книгу: " + book);
        books.add(book);
    }

    public void returnBook(String book) {
        System.out.println(lastName + " " + firstName.charAt(0)  + ". вернул(а) книгу: " + book);
        books.remove(book);
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("У читателя " + firstName + " " + lastName + " нет книг.");
            return;
        }
        System.out.println("Книги у читателя " + firstName + " " + lastName + ":");
        for (String book : books) {
            System.out.println("\t" + book);
        }
    }

    static public void main(String[] args) {
        Reader reader1 = new Reader("Татьяна", "Пустовалова", 339, "01.09.2001", "8299383833333");

        reader1.takeBook("Книга 1");
        reader1.takeBook("Книга 2");
        reader1.takeBook("Книга 3");
        reader1.showBooks();

        reader1.returnBook("Книга 2");
        reader1.showBooks();

    }
}
