// package implementingAbstractClassAndInterface;

/**
 * The Driver2InterfaceImp class demonstrates two ways to implement and use an interface in Java.
 * 1. Using a separate implementing class (DemoInterfaceImp1).
 * 2. Using an anonymous inner class.
 */
public class Driver2InterfaceImp {
    
    /**
     * Main method to demonstrate interface implementation.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        
        // Using a named class that implements the interface
        DemoInterfaceImp1 imp1 = new DemoInterfaceImp1();
        imp1.message1(); // Output message1 from DemoInterfaceImp1
        imp1.message2(); // Output message2 from DemoInterfaceImp1

        /**
         * Using an anonymous inner class to implement the interface directly.
         */
        DemoInterface imp2 = new DemoInterface() {
            /**
             * Implementation of message1() for the anonymous class.
             */
            @Override
            public void message1() {
                System.out.println("m1 from i2");
            }

            /**
             * Implementation of message2() for the anonymous class.
             */
            @Override
            public void message2() {
                System.out.println("m2 from i2");
            }
        };

        // Calling interface methods via the anonymous class
        imp2.message1();
        imp2.message2();
    }
}

/**
 * DemoInterface defines two abstract methods to be implemented by any class.
 */
interface DemoInterface {
    void message1();
    void message2();
}

/**
 * DemoInterfaceImp1 is a concrete implementation of DemoInterface.
 */
class DemoInterfaceImp1 implements DemoInterface {

    /**
     * Prints a message indicating message1 from DemoInterfaceImp1.
     */
    @Override
    public void message1() {
        System.out.println("Message 1 from DemoInterfaceImp1");
    }

    /**
     * Prints a message indicating message2 from DemoInterfaceImp1.
     */
    @Override
    public void message2() {
        System.out.println("Message 2 from DemoInterfaceImp1");
    }
}
