// package javapgms.innerclasstypes.AllTypes;

/**
 * The Driver class to demonstrate the concept of Anonymous Inner Class in Java.
 * An anonymous inner class is a class without a name that implements an interface or extends a class.
 * It is instantiated in a single expression.
 * 
 * @author YourName
 */
public class Driver3_Anony {
    public static void main(String[] args) {
        /**
         * Creating an Anonymous Inner Class that implements the Design1 interface.
         * This allows us to provide an implementation for the feature1() method without creating a separate class.
         */
        new Design1() {
            /**
             * Overriding the feature1() method of the Design1 interface.
             * This method prints a message indicating the execution of feature1.
             */
            @Override
            public void feature1() {
                System.out.println("This is feature 1 ...!");
            }
        }.feature1(); // Invoking the method of the anonymous inner class
    }
}

/**
 * Interface representing a design structure with a single abstract method.
 */
interface Design1 {
    /**
     * Abstract method to be implemented by classes (or anonymous inner classes).
     */
    void feature1();
}

/**
 * 🚀 Final Verdict:
 * 
 * 1️⃣ **Anonymous Inner Classes** are unnamed classes that either **extend a class** or **implement an interface**.
 * 2️⃣ They allow for **inline implementation** of an interface or class.
 * 3️⃣ They **cannot have explicit constructors** because they lack a name.
 * 4️⃣ Typically used for **event handling**, **short-lived implementations**, or **one-time use cases**.
 * 5️⃣ Helps **reduce boilerplate code** when a separate implementation class is unnecessary.
 * 
 * ✅ This is the correct and complete conclusion for Anonymous Inner Classes in Java! 🎯
 */
