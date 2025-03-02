import java.lang.reflect.Constructor;
import java.util.Arrays;

public class SixWaysToCreatObject {

    /*
     * 3]newInstance() method of class 
     * 2]newInstance() method of constructor
     * 1]new and class constructor
     * 4]clone
     * 5]Deserialization
     * 6]Anonymous class
     * 
    */
    public static void main(String[] args) throws Exception{
        Demo1 obj = new Demo1(); // Object created normally
        System.out.println("way1-------------------------");

        
            Demo1 obj2 = Demo1.class.newInstance(); // Object using Class.newInstance()
        

        System.out.println("way2-------------------------");
        
            Constructor <Demo1> constructorObj = Demo1.class.getConstructor();
            Demo1 obj3 = constructorObj.newInstance(); // Object using Reflection API
            Demo1 obj10 = Demo1.class.getConstructor().newInstance();
            
            
            
            

        

        System.out.println("way3-------------------------");
       Demo1 obj4=(Demo1)obj.clone();
       obj4.nonStaticMethod();
       
        System.out.println("way4-------------------------");
        System.out.println("way4-------------------------");

        System.out.println("program to print pyramid...!");

        int arr[]={77,9,67,48,57,94,21,7,22,20};
                System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length-1; j++)
        for (int i = 0; i < arr.length-j-1; i++) 
        if (arr[i]>arr[i+1]) {
            arr[i]=arr[i]*arr[i+1];
            arr[i+1]=arr[i]/arr[i+1];
            arr[i]=arr[i]/arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
        
       
    }

    }
   
      


class Demo1 implements Cloneable {
     void nonStaticMethod(){
        System.out.println("non static method 1");
     }
    { 
        System.out.println("Demo1 class non-static block"); 
    }
    
    // ✅ Add this explicit no-argument constructor
    public Demo1() {
        System.out.println("Demo1 constructor executed");
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}
