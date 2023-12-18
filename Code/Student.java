public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    // Constructors
    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public Student(String firstName, String lastName, int registration) {
        this(firstName, lastName, registration, 0, 1);
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0, 0, 1);
    }

    // Methods
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public boolean isApproved() {
        return grade >= 60;
    }

    public int changeYearIfApproved() {
        if (isApproved()) {
            year++;
            System.out.println("Congratulations!");
        }
        return year;
    }
}
