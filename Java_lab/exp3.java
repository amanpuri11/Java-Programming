package lab;

public class exp3 {

    static class Student {
        int studentId;
        String name;

        Student(int studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        void display() {
            System.out.println("ID: " + studentId);
            System.out.println("Name: " + name);
        }

        void updateDetails(int studentId, String name) {
            this.studentId = studentId;
            this.name = name;
          
        }

        void deleteStudent() {
            this.studentId = -1;
            this.name = null;
           
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Parth");

        s1.display();

        s1.updateDetails(5, "Ajay");

        s1.display();

        s1.deleteStudent();

        s1.display();
    }
}
