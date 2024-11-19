 class MyThread1 extends Thread {
    @Override
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("cutom thread "+i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("custom thread is inturupted by inturupted method..!");
        }
    }
}
public class Driver{
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        t1.start();
        t1.interrupt();
    }
}
