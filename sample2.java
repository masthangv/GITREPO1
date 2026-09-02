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

###################################333

// Define the class template
class Car {
    String brand;
    int year;

    // Constructor to initialize attributes
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Class method
    public void displayDetails() {
        System.out.println("Car: " + year + " " + brand);
    }
}

// Main class to run the program
public class MainApp {
    public static void main(String[] args) {
        // Create an object of the Car class

// Main class to run the program
public class MainApp {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Toyota", 2024);
        myCar.displayDetails();
    }
}

