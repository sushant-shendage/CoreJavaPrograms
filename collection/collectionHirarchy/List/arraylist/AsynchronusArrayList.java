import java.util.ArrayList;

public class AsynchronusArrayList {
     
    public static void main(String[] args) {

        ArrayList arrayListVar1=new ArrayList<>();

        Runnable r1=()->{
            for (int i = 1; i <= 100; i++)
            arrayListVar1.add(i);
        };
        r1.run();
        r1.run();
 

        

        System.out.println("Size of ArrayList variable : "+arrayListVar1.size());
        
    }
}
