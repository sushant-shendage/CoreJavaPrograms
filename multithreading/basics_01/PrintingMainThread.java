package basics_01;
public class PrintingMainThread{
    public static void main(String[] args) {
        Thread MyThread= new Thread();
        //printing thread
        System.out.println("language generated name :: "+MyThread.getName());
        
        //renaming thread
        MyThread.setName("MyFirstThread");

         //printing thread
        System.out.println("Renamed                 :: "+MyThread.getName());
    }
}