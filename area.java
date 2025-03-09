package oops.Practice;
import java.util.Scanner;

public class area {
    int length, breadth;

    void setDimensions(int l, int b) {
        length = l;
        breadth = b;
    }

    int calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        area rect = new area();

        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        rect.setDimensions(length, breadth);
        
        System.out.println("The area of the rectangle is: " + rect.calculateArea());
        sc.close();
    }
}
