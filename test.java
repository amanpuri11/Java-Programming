package abstract_modifier;

abstract class A{
	abstract void logic();
	abstract void logic2();
	void fun() {
		System.out.println("Fun method!");
	}
}

public class test extends A {
	void logic() {
		System.out.println("Logic method!!");
	}
	void logic2() {
		System.out.println("Logic 2 method");
	} 

	public static void main(String[] args) {
		
        test obj = new test();
       
        obj.logic();    
        obj.logic2();   
        obj.fun();  
	}
}