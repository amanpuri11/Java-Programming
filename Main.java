package oops;

class Add{
	int a,b,c;
	
	void input(int x, int y) {
		a = x;
		b = y;
	}
	void cal() {
		c = a + b;
	}
	void display() {
		System.out.println("a + b = "+c);
	}
}

public class Main {
	public static void main(String[] args) {
		
		Add obj = new Add();
		obj.input(6, 4);
		obj.cal();
		obj.display();
	}
}