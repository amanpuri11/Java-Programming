package oops.Practice;
import java.util.Scanner;

public class calculator {
    double num1;
    double num2;

    public calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add() {
        return num1 + num2;
    }
    public double sub() {
        return num1 - num2;
    }
    public double mult() {
        return num1 * num2;
    }
    public double div() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero.");
            return Double.NaN; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        calculator cal = new calculator(num1, num2);
        
        double r1 = cal.add();
        double r2 = cal.sub();
        double r3 = cal.mult();
        double r4 = cal.div();

        System.out.println("The sum is: " + r1);
        System.out.println("The difference is: " + r2);
        System.out.println("The product is: " + r3);
        System.out.println("The division result is: " + r4);

        sc.close();
    }
}