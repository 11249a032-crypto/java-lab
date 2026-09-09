package mypackage;

public class Test {

    void display() {
        System.out.println("Hello from User Defined Package");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}
