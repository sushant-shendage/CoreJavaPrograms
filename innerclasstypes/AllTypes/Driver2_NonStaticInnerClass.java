// package javapgms.innerclasstypes.AllTypes;

/**
 * Demonstrates the concept of Non-Static Inner Class in Java.
 * A non-static inner class is associated with an instance of the outer class.
 * It can access all members of the outer class, including private members.
 * 
 * @author [Your GitHub ID]
 */
public class Driver2_NonStaticInnerClass {
    public static void main(String[] args) {
        // Creating an instance of Outer class and accessing the non-static inner class
        new Outer().new InnerNonStaticClass().nonStaticMethod();
    }
}

/**
 * The Outer class which contains a Non-Static Inner Class.
 */
class Outer {

    /**
     * Non-Static Inner Class:
     * - It is associated with an instance of the outer class.
     * - It cannot have static members unless they are static final constants.
     * - It can access all members (including private) of the outer class.
     * - Requires an instance of the outer class to be instantiated.
     */
    class InnerNonStaticClass {

        /**
         * A non-static method inside the Non-Static Inner Class.
         * This method demonstrates accessing an inner class method.
         */
        void nonStaticMethod() {
            System.out.println("Non-static method from non-static inner class..!");
        }
    }
}

/**
 * 🚀 Final Verdict:
 * 
 * 1️⃣ A **Non-Static Inner Class** is always tied to an instance of its outer class.
 * 2️⃣ It **cannot have static methods** (except static final constants).
 * 3️⃣ It can **access all members of the outer class**, including private ones.
 * 4️⃣ It requires an **instance of the outer class** to be instantiated.
 * 
 * ✅ This is the correct and complete conclusion for Non-Static Inner Classes in Java! 🎯
 */
