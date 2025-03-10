// package Synchronization_03;

  class   StockOrder {
    static int stockAvilable = 100;

    synchronized void  orderStock(int stockQuantityOrdered) {
      if(stockQuantityOrdered>stockAvilable){
        System.out.println("if-insuff");
System.out.println("stock avilable :"+stockAvilable);
System.out.println("stock ordered :"+stockQuantityOrdered);
System.out.println("Insufficient stock ..!");
System.out.println("----------------------------");
      }else{
        System.out.println("-else-suff");

        System.out.println("stock avilable :"+stockAvilable);
        System.out.println("stock ordered :"+stockQuantityOrdered);
        System.out.println("Remaining stock : "+stockAvilable);
        System.out.println("----------------------------");
      }
    }

    
}

class MyThread extends Thread{

  int quantity;
  @Override
  public void run(){
    StockOrder ob=new StockOrder();
    if (ob.stockAvilable >= 0 && ob.stockAvilable >= quantity) {
      ob.orderStock(quantity);
      ob.stockAvilable-=ob.stockQuantityOrdered;
     
      System.out.println("quantity ordered :: "+quantity);
   
      System.out.println("-------------------");
    } else {
   
      System.out.println("insufficient stock..!");
      System.out.println("-------------------");
    }
   
  }
}


public class Driver {
      public static void main(String[] args) {

        

        

        MyThread t1;
      for ( int i = 0 ; i <= 4 ; i++ ){
         t1 = new MyThread();
        t1.quantity = (int) (Math.random() * 100 % 100);
        t1.start();
      }


      System.out.println("program execution completed..!"); 
    }
}
