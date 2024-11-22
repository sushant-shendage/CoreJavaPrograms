// package javapgms.multithreading.staticSynchronizedMethod;

public class Driver1 {
    public static void main(String[] args) {

        MyThread t1=new MyThread();
        t1.seat=(int)(Math.random()*100%10);
        t1.start();

        MyThread t2=new MyThread();
        t2.seat=(int)(Math.random()*100%10);
        t2.start();
    }
    
}

class BookMyShow{
    static int totalSeat=10;
    public static  synchronized void BookSeat(int seat){
        if (totalSeat>=seat) {
            System.out.printf("\nbooked seats:: %d",seat);
            totalSeat-=seat;
            System.out.printf("\n seats left:: %d",totalSeat);
            System.out.println("\n============================================");
        } else {
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
