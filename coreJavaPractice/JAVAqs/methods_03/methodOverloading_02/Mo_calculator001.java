
public class Mo_calculator001 {
    
    public static void main(String[] args) {
        mO(2, 3); // i,i
        mO(2, 3.5f);// i,f
         mO(2.6f, 3.5f);// f,f
         mO(2.6f, 3);// f,i
    }

    public static void mO(int i,int i2) {
        System.out.println("from method mO i,i");
        
        System.out.println("----------------------------------------------");
    }

    public static void mO(int i,float i2) {
        System.out.println("from method mO i,f");
        System.out.println("----------------------------------------------");
    }

    public static void mO(float i,float i2) {
        System.out.println("from method mO f,f");
        System.out.println("----------------------------------------------");
    }

    public static void mO(float i,int i2) {
        System.out.println("from method mO f,i");
        System.out.println("----------------------------------------------");
    }

}
