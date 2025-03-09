package oops.Practice;
import java.util.Scanner;

public class Circlearea {
	double radius;
	
	void setradius(double r) {
		radius = r;
	}
	double area() {
		return Math.PI * radius*radius;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Circlearea ca = new Circlearea();
		
		System.out.print("Enter radius of circle: ");
		double radius = sc.nextDouble();
		
		ca.setradius(radius);
		
		System.out.println("Area of circle is "+ca.area());
		sc.close();
	}
}