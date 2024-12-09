// package staticSynchronizedMethod_04;
// package javapgms.multithreading.staticSynchronizedMethod;

public class Driver1 {
    public static void main(String[] args) {

        MyThread t1=new MyThread();
        t1.start();
        
        // MyThread t2=new MyThread();
        // t2.start();
        
        while (BookMyShow.totalSeat!=0) {
            try {
                Thread.sleep(1000);
                Thread.interrupted();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("exception occured..!");
            }
            t1.seat=(int)(Math.random()*100%10);
            t1.run();
            // t2.seat=(int)(Math.random()*100%10);
            // t2.run();
        }

       
    }
    
}

class BookMyShow{
    static int totalSeat=50;
    public static  synchronized void BookSeat(int seat){
        if (totalSeat>=seat) {
            System.out.println("thread name :"+Thread.currentThread().getName());
            System.out.printf("\nbooked seats:: %d",seat);
            totalSeat-=seat;
            System.out.printf("\n seats left:: %d",totalSeat);
            System.out.println();
            for (int i = 1; i <=50; i++) {
                if (i%10==0) {
                    System.out.println();
                }
                if (i>=totalSeat) {
                    System.out.print(" *");
                } else {
                    System.out.print(" -");
                    
                }
            }
            System.out.println("\n============================================");
        } else {
            System.out.println("thread name :"+Thread.currentThread().getName());

            System.out.printf("\n%d seats are not avilabe..!",seat);
            System.out.printf("\n seats left:: %d",totalSeat);
            System.out.printf("\n============================================");

        }
    }
}

class MyThread extends Thread{
    BookMyShow bms=new BookMyShow();
    int seat;
    @Override
    public void run(){
        if(seat==0)
        seat++;
bms.BookSeat(seat);
    }
}
