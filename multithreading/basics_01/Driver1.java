// package basics_01;

public class Driver1 {
    public static void main(String[] args) {
        
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        MyThread3 t3=new MyThread3();


        t1.start();
        t2.start();
        t3.start();


    }
}
class MyThread1 extends Thread {
    @Override
    public void run(){
        for (int i = 0; i <10; i++) {
            
            System.out.println("thread 1 execution completed..!");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run(){
        for (int i = 0; i <10; i++) {
            
            System.out.println("thread 2 execution completed..!");
        }
    }
}

class MyThread3 extends Thread {
    @Override
    public void run(){
        for (int i = 0; i <10; i++) {
            
            System.out.println("thread 3 execution completed..!");
        }
    }
}
 