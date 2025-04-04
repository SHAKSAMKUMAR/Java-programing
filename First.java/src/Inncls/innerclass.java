package Inncls;

public class InnerClass {  // Outer class with the correct name
    int a = 10;  // Instance variable
    static int b = 20;  // Static variable

    class Inner {  // Non-static inner class
        void m1() {
            System.out.println(10);  // Accessing non-static variable a from the outer class
        }
    }

    public static void main(String[] args) {
        InnerClass i = new InnerClass();  // Create an instance of the outer class
        InnerClass.Inner in = i.new Inner();  // Create an instance of the inner class
        in.m1();  // Call the m1() method from the inner class
    }
}
