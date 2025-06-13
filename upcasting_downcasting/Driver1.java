/**
 * Main class to demonstrate upcasting and downcasting in Java.
 */
public class Driver1 {
    public static void main(String[] args) {

        // Upcasting Car to Vehicle
        Vehicle upcastedVar = new Car();
        System.out.println("Accessing properties using upcasted variable...");

        // Accessing parent class properties through upcasted variable
        System.out.println(upcastedVar.wheels);
        System.out.println(upcastedVar.brakes);

        // The following line would cause a compilation error because 'steering' is not in Vehicle
        // System.out.println(upcastedVar.steering);

        /*
         * Error while executing previous line of code:
         * 
         * error: cannot find symbol
         * System.out.println(upcastedVar.steering);
         *                                 ^
         * symbol:   variable steering
         * location: variable upcastedVar of type Vehicle
         * 
         * Reason for error:
         * Cannot access child class properties through an upcasted variable.
         * Solution:
         * Downcast the variable to the child type to access child class properties.
         */

        System.out.println("Accessing properties using downcasted variable...");

        // Downcasting
        Car downcastedVar = (Car) upcastedVar;

        // Accessing parent class properties through child class using downcasted variable
        System.out.println(downcastedVar.wheels);
        System.out.println(downcastedVar.brakes);

        // Accessing child class property through downcasted variable
        System.out.println(downcastedVar.steering);
    }
}

/**
 * Parent class representing a generic vehicle.
 */
class Vehicle {
    String wheels = "Parent property: has wheels";
    String brakes = "Parent property: has brakes";
}

/**
 * Child class representing a specific type of vehicle - Car.
 */
class Car extends Vehicle {
    String steering = "Child property: has steering";
}
