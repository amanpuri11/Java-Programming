package oops.Practice;
import java.util.Scanner;

public class rectArea {
     double length;
     double breadth;

    public rectArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        rectArea rectangle = new rectArea(length, breadth);
        double area = rectangle.calculateArea();
        System.out.println("The area of the rectangle is: " + area);
        sc.close();
    }
}
