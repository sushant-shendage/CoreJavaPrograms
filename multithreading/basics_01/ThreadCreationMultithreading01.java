/**
 * This program demonstrates multiple ways of creating threads in Java.
 * 
 * 1. Using a class that extends Thread (`CustomThread`).
 * 2. Using a lambda expression to implement the Runnable interface.
 * 3. Demonstrating thread naming and execution.
 */

 public class ThreadCreationMultithreading01 {
    public static void main(String[] args) {
        
        // Creating and starting two threads using the CustomThread class (which extends Thread)
        new CustomThread().start();  // First thread instance
        new CustomThread().start();  // Second thread instance

        /** 
         * Creating a thread using Runnable (Lambda Expression) 
         * The run() method will print numbers from 0 to 10.
         */
        Runnable r1 = () -> {
            for (int i = 0; i <= 10; i++)
                System.out.println("Runnable r1-ob1 " + " : " + i);
        };

        // Creating a thread using Runnable and giving it a name "t1"
        Thread customThread2 = new Thread(r1, "t1");

        // Starting the thread
        customThread2.start();

        /**
         * 🚨 ERROR: Attempting to start the same thread again.
         * Calling start() on an already started thread will throw IllegalThreadStateException.
         * Uncommenting the next line will cause a runtime exception.
         */
        // customThread2.start();
    }
}

/**
 * CustomThread class extends Thread and overrides the run() method.
 * It prints numbers from 0 to 10 along with the thread name.
 */
class CustomThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++)
            System.out.println(currentThread().getName() + " : " + i);
    }
}
