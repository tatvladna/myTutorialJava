package students;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    double averageMark;


    public Student(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public int getScholarship() {
        int scholarship = 0;
        if (averageMark == 5) {
            scholarship = 5000;
        } else if (averageMark == 4) {
            scholarship = 3000;
        }
        return scholarship;
    }
}
