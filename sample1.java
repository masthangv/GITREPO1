// Main.java
public class Main {
    public static void main {
        // System.out.println() prints text to the console
        System.out.println("Hello, World!");
    }
}

################

public class Variables {
    public static void main(String[] args) {
        int speed = 100;
        double price = 19.99;
        char grade = 'A';
        boolean isJavaFun = true;
        String message = "Welcome to Java";

        System.out.println("Speed: " + speed);
        System.out.println("Message: " + message);
    }
}
########################

public class ControlFlow {
    public static void main(String[] args) {
        int number = 15;

        // Condition
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // For loop to print 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}

