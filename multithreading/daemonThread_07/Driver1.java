// package daemonThread;

public class Driver1 {
    public static void main(String[] args) {
      
        System.out.println((Thread.currentThread().isDaemon())?"daemon thread":"non-daemon thread" );
        Thread.currentThread().setDaemon(true);

        // Mythread t1=new Mythread();
        // // t1.setDaemon(true);
        // t1.start();
        // System.out.println((t1.isDaemon())?"daemon thread":"non-daemon thread" );

    }
}

class Mythread extends Thread{
     
   
}
/*
 * -->non-static method
 * -->by default main method is non-daemon thread
 * -->can we change nature of main thread (No why beacuse we can change nature 
 *    before execution of corresponding thread as,main thread execution statr by jvm we can't change nature of main thread)
*/