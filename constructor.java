package oops;

public class constructor {
	int id;
	String name;
	
	constructor() {
		id = 101;
		name = "sasuke";
	}
	void logic() {
		System.out.println(id+ " " + name);
	}
	
	public static void main(String[] a) {
		constructor c1 = new constructor();
		c1.logic();
	}
}
