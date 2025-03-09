package oops;

public class constructor2 {
	
    constructor2() {
    	System.out.println("This is default constructor");
    }
    constructor2(int a) {
    	System.out.println("This is one parameterized constructor");
    }
    constructor2(int a, int b){
    	System.out.println("This is two parameterized constructor");
    }
    void logic() {
    	System.out.println("This is logic");
    }
    
    public static void main(String[] a) {
		constructor2 c1 = new constructor2();
		constructor2 c2 = new constructor2(21);
		constructor2 c3 = new constructor2(3,8);
    }
}