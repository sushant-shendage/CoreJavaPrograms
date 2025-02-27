// package javapgms.innerclasstypes.AllTypes;

/**
 * The Driver class to demonstrate the concept of Local Inner Class in Java.
 */
public class Driver4_LocalInnerClass {
    public static void main(String[] args) {
        // Creating an instance of the Outer class and invoking its method
        new Outer().nonStaticMethod();
    }
}

/**
 * The Outer class which contains a non-static method defining a Local Inner Class.
 */
class Outer {

    /**
     * A non-static method which defines a Local Inner Class inside it.
     * Local Inner Classes are always non-static and can only be accessed within the method where they are declared.
     */
    void nonStaticMethod() {

        /**
         * Local Inner Class: 
         * - Defined within a method.
         * - Always non-static.
         * - Cannot have static methods.
         * - Can have only non-static methods.
         * - Can have `static final` constants (compile-time constants).
         */
        class InnerClass {

            /**
             * A non-static method inside the Local Inner Class.
             * Since Local Inner Classes are non-static by nature, all their members are also non-static.
             */
            void innerLocalClassMethod() {
                System.out.println("Local non-static inner class - non-static method..!");
            }

        }

        // Creating an instance of the Local Inner Class and invoking its method
        new InnerClass().innerLocalClassMethod();
    }
}

/**
 * 🚀 Final Verdict:
 * 
 * 1️⃣ A **local inner class** is **always non-static**.
 * 2️⃣ It can **only have non-static methods**.
 * 3️⃣ It **cannot have static methods**.
 * 4️⃣ It **can have static final constants** (compile-time constants).
 * 5️⃣ It can only be accessed **inside the method where it is defined**.
 * 
 * ✅ This is the correct and complete conclusion for Local Inner Classes in Java! 🎯
 */
