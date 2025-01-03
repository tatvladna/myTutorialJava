/*
    решение задачи с сайта https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
*/

package students;

public class Aspirant extends Student {

    private String researchTopic;

    private Aspirant(String firstName, String lastName, String group, String researchTopic) {
        super(firstName, lastName, group);
        this.researchTopic = researchTopic;
    }

    @Override
    public int getScholarship() {
        int scholarship = 10000;
        return scholarship;
    }

    public static void main(String[] args) {
        Aspirant aspirant = new Aspirant("Иван", "Иванов", "ИУ5-12", "Исследование морского побережья");
        System.out.println("Стипендия аспиранта: " + aspirant.getScholarship());
        System.out.println("Тема исследования: " + aspirant.researchTopic);
    }
}
