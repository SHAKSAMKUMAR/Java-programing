package Inncls;

public class Test {
    public static void main(String[] args) {
      
        InnerClass i = new InnerClass();

       
        InnerClass.Inner in = i.new Inner();

      
        in.m1();
    }
}
