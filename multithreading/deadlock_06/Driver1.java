// package deadlock_06;

public class Driver1 {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        t1.start();
        MyThread2 t2=new MyThread2();
        t2.start();

        System.out.println("active threads :"+Thread.activeCount());
    }
    
}
class  MyThread1 extends Thread {
    @Override
    public synchronized void run() {
        try {
            wait();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int i = 0; i <=10; i++) {
            System.out.println("I am thread 1");
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public synchronized void run() {
        try {
            wait();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int i = 0; i <=10; i++) {
            System.out.println("I am thread 2");
        }
    }
}