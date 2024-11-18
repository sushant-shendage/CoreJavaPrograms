
public class Driver1 {
    public static void main(String[] args) {
        
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();

        t1.start();
        t2.start();

    }
}
class MyThread1 extends Thread {
    @Override
    public void run(){
System.out.println("thread 1 execution completed..!");
    }
}

class MyThread2 extends Thread {
    @Override
    public void run(){
        System.out.println("thread 2 execution completed..!");
    }
}
