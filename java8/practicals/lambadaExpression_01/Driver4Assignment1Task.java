public class Driver4Assignment1Task {
    public static void main(String[] args) {
        Runnable thread1= ()-> {
            for (int i = 0; i < 3; i++) {
            System.out.println("thread 1..!");
            }
        };
        Thread t1=new Thread(thread1);
        t1.start();

        Runnable thread2=()-> {
            for (int i = 0; i < 2; i++) {
            System.out.println("thread 2..!");
            }
        };
        Thread t2=new Thread(thread2);
        t2.start();
    }
}
