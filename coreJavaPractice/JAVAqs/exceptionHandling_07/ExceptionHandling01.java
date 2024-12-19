import java.util.Scanner;



public class ExceptionHandling01 {
    public static void main(String[] args) {
       
Scanner sc=new Scanner(System.in);
       System.out.println("program started");
        try {
             int num=sc.nextInt();
            
            //System.out.println(8/0);
           
        }  
        catch (Exception e) {
            System.out.println(e);
            System.out.println("An exception occured ");
             
           
        }

        System.out.println("program exicution completed");
        
    }
    
}
