package Hashing;

// File Name: Main.java
public class Main {
    public static void main(String[] args) {
        // System.out.println("This is the main class.");
        Helper h = new Helper();
        h.printMessage();

        
    }
}
class Helper {
    void printMessage() {
        System.out.println("This is the helper class.");
    }
}
class AnotherHelper {
    void showMessage() {
        System.out.println("This is another helper class.");
    }
}