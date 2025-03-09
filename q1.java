package oops.Practice;

public class q1 {
    String name;
    int age;
    String city;
    int pincode;
    
    q1(String n, int a, String c, int pc){
    	name = n;
    	age = a;
    	city = c;
    	pincode = pc;
    }
    void display() {
    	System.out.println(name+ " " + age+ " " + city+ " " + pincode);
    }
    
    public static void main(String[] a) {
    	q1 x = new q1("lawrence",21,"pakistan",000011);
    	x.display();
    }
}
