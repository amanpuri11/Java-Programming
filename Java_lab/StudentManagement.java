package lab;

public class StudentManagement {

    static class Student {
        int studentId;
        String name;

        public Student(int studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        public void display() {
            System.out.println("ID: " + studentId);
            System.out.println("Name: " + name);
        }
    }

    static class Course {
        String courseName;

        public Course(String courseName) {
            this.courseName = courseName;
        }

        void display() {
            System.out.println("Course: " + courseName);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Parth");
        Course course1 = new Course("Maths");

        student1.display();
        course1.display();

    }
}
