
public class NthRoot {
    public static void main(String[] args) {
         
         nthRoot(22,3);


    }
    static void nthRoot(int num,int root)
    {
        double b=Math.sqrt(16);
        System.out.println(b);
        
        for (int i = 0; i <= 11; i++) {
            b=Math.sqrt(b);
        System.out.println(b);
        }
         System.out.println(b-1);
        
    }
}//PROGRAM FAILED TO EXICUTE LINE::18
