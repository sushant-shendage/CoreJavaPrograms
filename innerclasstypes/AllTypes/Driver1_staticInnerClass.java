// package javapgms.innerclasstypes.AllTypes;

/**
 * Demonstrates the concept of Static Inner Class in Java.
 * A static inner class is nested inside another class and can be instantiated without creating an instance of the outer class.
 *
 *  
 */
public class Driver1_staticInnerClass {
    public static void main(String[] args) {
        // Accessing the static method of the Static Inner Class
        Outer.StaticInnerClass.staticMethod();

        // Creating an instance of the Static Inner Class and accessing its non-static method
        new Outer.StaticInnerClass().nonStaticMethod();
    }
}

/**
 * The Outer class which contains a Static Inner Class.
 */
class Outer {

    /**
     * Static Inner Class:
     * - It is declared as static inside another class.
     * - It can have both static and non-static members.
     * - Since it is static, it does not require an instance of the outer class for instantiation.
     */
    static class StaticInnerClass {

        /**
         * A static method inside the Static Inner Class.
         * This method can be accessed directly using the class name without an instance.
         */
        public static void staticMethod() {
            System.out.println("Static method from static inner class..!");
        }

        /**
         * A non-static method inside the Static Inner Class.
         * This method requires an instance of the static inner class to be called.
         */
        void nonStaticMethod() {
            System.out.println("Non-static method from static inner class..!");
        }
    }
}

/**
 * 🚀 Final Verdict:
 *
 * 1️⃣ A **Static Inner Class** can have both static and non-static members.
 * 2️⃣ It **does not require an instance of the outer class** to be instantiated.
 * 3️⃣ Static methods inside a Static Inner Class **can be accessed directly** using the class name.
 * 4️⃣ Non-static methods require an **instance of the Static Inner Class** to be accessed.
 * 
 * ✅ This is the correct and complete conclusion for Static Inner Classes in Java! 🎯
 */
