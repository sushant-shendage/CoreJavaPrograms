package basics_01;
 


public class Driver2ThreadCreationUsingRunableInterface {
    public static void main(String[] args) {
        
        MyThread1 t1=new MyThread1();
        Thread ob1= new Thread(t1);


        MyThread2 t2=new MyThread2();
        Thread ob2= new Thread(t2);


        ob1.start();
        ob2.start();

    }
}
class MyThread1 implements Runnable {
    @Override
    public void run(){
System.out.println("thread 1 execution completed..!");
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run(){
        System.out.println("thread 2 execution completed..!");
    }
}
