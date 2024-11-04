package oops;

// Final class
final class Vehicle {
    final int maxSpeed; // A final variable that must be initialized once
    // Constructor to initialize the final variable
    Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    // Final method in the final class
    final void displayMaxSpeed() {
        System.out.println("The maximum speed is: " + maxSpeed + " km/h");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(180);
        myVehicle.displayMaxSpeed();
        // Trying to change the value of maxSpeed would cause a compilation error
        // myVehicle.maxSpeed = 200;
        // This line would cause a compilation error
    }
}
