package Oops;
class Add {
	//data  + operation(function)
    int a, b, c;

    void input(int x, int y) {
        a = x;
        b = y;
    }

    void cal() {
        c = a + b;
    }

    void display() {
        System.out.println("a + b: " + c);
    }
}

public class Oops {
    public static void main(String[] args) {
        Add obj = new Add(); // Create object
        obj.input(12, 114);   // Input values
        obj.cal();           // calculation
        obj.display();       // Display result
    }
}
