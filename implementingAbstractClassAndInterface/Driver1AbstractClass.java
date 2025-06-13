// package implementingAbstractClassAndInterface;

/**
 * This is the driver class that demonstrates two common ways of implementing an abstract class:
 * 
 * <p><b>Summary:</b></p>
 * <ul>
 *   <li>✅ <b>Main goal</b>: Demonstrate two common ways to implement an abstract class.</li>
 *   <li>✅ <b>Good practices used</b>: Abstraction, overriding, anonymous inner class.</li>
 *   <li>✅ <b>Javadoc-style comments</b> help explain what each part does — essential for real-world collaboration and documentation.</li>
 * </ul>
 * 
 * <p>Ways demonstrated:</p>
 * <ol>
 *   <li>By creating a separate subclass (MessagesImplementation1).</li>
 *   <li>By using an anonymous inner class.</li>
 * </ol>
 */
public class Driver1AbstractClass {
    public static void main(String[] args) {
        
        // Way 1: Using a separate class to implement the abstract class
        new MessagesImplimentation1().message1();
        new MessagesImplimentation1().message2();

        // Way 2: Implementing the abstract class using an anonymous inner class
        Messages imp2 = new Messages() {
            /**
             * Overridden implementation of message1 in anonymous inner class.
             */
            @Override
            void message1() {
                System.out.println("m1 from i2");
            }

            /**
             * Overridden implementation of message2 in anonymous inner class.
             */
            @Override
            void message2() {
                System.out.println("m2 from i2");
            }
        };

        imp2.message1();
        imp2.message2();
    }
}

/**
 * Abstract class defining two abstract methods: message1 and message2.
 * 
 * <p>Any class that extends this abstract class must provide implementations for both methods.</p>
 */
abstract class Messages {
    /**
     * Abstract method to be implemented by subclasses to provide message1 functionality.
     */
    abstract void message1();

    /**
     * Abstract method to be implemented by subclasses to provide message2 functionality.
     */
    abstract void message2();
}

/**
 * Concrete class that extends the abstract class Messages.
 * 
 * <p>This class provides specific implementations for the abstract methods message1 and message2.</p>
 */
class MessagesImplimentation1 extends Messages {
    /**
     * Implementation of message1 which prints a message from implementation 1.
     */
    @Override
    void message1() {
        System.out.println("m1 from i1");
    }

    /**
     * Implementation of message2 which prints a message from implementation 1.
     */
    @Override
    void message2() {
        System.out.println("m2 from i1");
    }
}
