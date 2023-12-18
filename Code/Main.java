import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> enrolledStudents;

    // Constructor
    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.enrolledStudents = new ArrayList<>();
    }

    // Methods
    public void enroll(Student student) {
        enrolledStudents.add(student);
    }

    public void enroll(List<Student> students) {
        enrolledStudents.addAll(students);
    }

    public void unEnroll(Student student) {
        enrolledStudents.removeIf(s -> s.registration == student.registration);
    }

    public int countStudents() {
        return enrolledStudents.size();
    }

    public int bestGrade() {
        int maxGrade = 0;
        for (Student student : enrolledStudents) {
            maxGrade = Math.max(maxGrade, student.grade);
        }
        return maxGrade;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage

        // Create students
        Student stud1 = new Student("Klaus", "Mikaelson", 1, 85, 1);
        Student stud2 = new Student("Stefan", "Salvatore", 2, 66, 1);
        Student stud3 = new Student("Caroline", "Forbes", 3, 55, 1);
        Student stud4 = new Student("Hayley", "Marshall", 4, 70, 1);
        Student stud5 = new Student("Atlas", "Corrigan", 5, 90, 1);
        Student stud6 = new Student("Tom", "Hiddleston", 6, 98, 1);


        // Create course
        Course course = new Course("Junior FullStack Developer (JSD)", "Prof. Annamalai and Prof. Chetan", 2023);

        // Enroll individual students
        course.enroll(stud1);
        course.enroll(stud2);
        course.enroll(stud4);
        course.enroll(stud5);
        course.enroll(stud6);

        // Print student count and best grade
        System.out.println("Number of students: " + course.countStudents());
        System.out.println("Best grade in the course: " + course.bestGrade());

        // Enroll a list of students
        List<Student> studentList = Arrays.asList(stud2, stud3, stud4);
        course.enroll(studentList);

        // Print updated student count and best grade
        System.out.println("Number of students after enrolling a list: " + course.countStudents());
        System.out.println("Best grade in the course after enrolling a list: " + course.bestGrade());
    }
}