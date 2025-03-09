package Inheritance;

public class A {
    void funA() {
        System.out.println("A class method");
    }

    public static void main(String[] arg) {
        B obj = new B();
        obj.funB();
        obj.funA();
    }
}

class B extends A {
    void funB() {
        System.out.println("B class method");
    }
}