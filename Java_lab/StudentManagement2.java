package lab;

public class StudentManagement2 {

    static class Student {
        private int studentId; 
        private String name;    

        // Parameterized constructor to initialize student details
        public Student(int studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        // Method to display student details
        public void display() {
            System.out.println("ID: " + studentId);
            System.out.println("Name: " + name);
        }
    }

    static class Course {
        private String courseName; 

        // Parameterized constructor to initialize course details
        public Course(String courseName) {
            this.courseName = courseName;
        }

        // Method to display course details
        public void display() {
            System.out.println("Course: " + courseName);
        }
    }

    public static void main(String[] args) {
        // Creating Student object using parameterized constructor
        Student student1 = new Student(1, "Rohit");

        // Creating Course object using parameterized constructor
        Course course1 = new Course("Maths");

        // Displaying student and course details
        student1.display();
        course1.display();
    }
}