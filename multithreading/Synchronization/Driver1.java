// package Synchronization;

import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) {
        BookMyShow ob1=new BookMyShow();

        Mythread person1=new Mythread();
        person1.seat=7;
        person1.start();
        Mythread person2=new Mythread();
        person2.seat=9;
        person2.start();
    }
}
class BookMyShow{
      int totalSeats=10;
    public synchronized void BookSeat(int seat){
        System.out.println("enter number of seats you want to book..!");
         seat=new Scanner(System.in).nextInt();


        if (seat<= totalSeats) {
            System.out.printf("\nseats booked :: %d",seat);
            totalSeats-=seat;
            System.out.printf("\nseats left :: %d",totalSeats);
            System.out.println("----------------------------------------------");

        } else {
            System.out.printf("\nseats booked are not avilable..!");
            System.out.printf("\nseats left :: %d",totalSeats);

            System.out.println("----------------------------------------------");
        }
    }
}
class Mythread extends Thread{
    static BookMyShow bms;
    int seat;
    @Override
    public void run(){
        bms.BookSeat(seat);
    }
}
//book my show example


