// package javapgms.innerclasstypes.staticAndNonstaticinnerclass;
 
/**
 * The Driver1 class contains the main method to demonstrate the usage of 
 * static and non-static inner classes in Java.
 */
public class Driver1 {
    /**
     * The main method is the entry point of the Java application.
     * It demonstrates how to access both static and non-static members
     * of inner classes (static and non-static).
     * 
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Accessing static method of static inner class directly using class name
        Computer.Pendrive.message();
        
        // Creating an instance of the static inner class to access its non-static method
        new Computer.Pendrive().message2();

        // Creating an instance of the non-static inner class and accessing its method
        new Computer().new Cd().CdMessage2();


        
    }
}

/**
 * The Computer class contains two inner classes:
 * 1. `Pendrive` (Static Inner Class)
 * 2. `Cd` (Non-Static Inner Class)
 */
class Computer {

    /**
     * The Pendrive class is a static inner class.
     * It demonstrates that a static inner class can have both static and non-static members.
     */
    static class Pendrive {
        /**
         * Static method inside the static inner class.
         * Can be accessed directly using the class name without an instance.
         */
        static void message() {
            System.out.println("This is static pendrive..!");
        }

        /**
         * Non-static method inside the static inner class.
         * Requires an instance of the `Pendrive` class to be accessed.
         */
        void message2() {
            System.out.println("This is non-static pendrive..!");
        }
    }

    /**
     * The Cd class is a non-static (inner) class.
     * It demonstrates that a non-static inner class can only have non-static members.
     */
    class Cd {
        /**
         * Non-static method inside the non-static inner class.
         * Requires an instance of the `Computer` class and an instance of the `Cd` class.
         */
        void CdMessage2() {
            System.out.println("This is non-static Cd..!");
        }
    }
}

/**
 * 🔥 **Conclusion:**
 * ✅ A **static inner class** can contain both static and non-static members.
 * ✅ A **non-static inner class** can only contain non-static members.
 * ✅ Static methods inside a **static inner class** can be accessed directly using the class name.
 * ✅ Non-static methods inside a **static inner class** require an instance of the inner class.
 * ✅ A **non-static inner class** requires an instance of the outer class to be instantiated.
 */
