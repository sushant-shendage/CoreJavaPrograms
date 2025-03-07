// package methods;

/**
 * This class demonstrates method overloading of the main method.
 * Although multiple main methods exist with different parameters,
 * the JVM always starts execution from `main(String[] args)`.
 */
public class OverloadMainMethod {

    /**
     * Standard main method (entry point) for the Java application.
     * JVM starts execution from this method.
     *
     * @param args Command-line arguments passed as an array of Strings
     */
    public static void main(String[] args) {
        // Calling overloaded main method with an int parameter
        OverloadMainMethod.main(4);
    }

    /**
     * Overloaded main method with an integer parameter.
     * This method calls another overloaded main method with a char parameter.
     *
     * @param a An integer argument
     */
    public static void main(int a) {
        System.out.println("main method with int argument for CLI");

        // Calling another overloaded main method with a char argument
        new OverloadMainMethod().main('c');

       
    }

    /**
     * Overloaded main method with a character parameter.
     * This method simply prints a message.
     *
     * @param c A character argument
     */
    public static void main(char c) {
        System.out.println("main method with char argument for CLI");
    }
}
