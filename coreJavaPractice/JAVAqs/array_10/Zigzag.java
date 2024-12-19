import java.util.Arrays;

public class Zigzag {
   public static void main(String[] args) {
    int[]a={1,2,3,4,5,6,7,8};
    int[]b={11,22,33,44,55};

    int[]c=new int[a.length+b.length];

    int small=(a.length<b.length):a.length?b.length;

    for (int i = 0,j=0; i < c.length; i+=2,j++) {

         if (i<small) {
            c[i]=a[j];
            c[i+1]=b[j];
         }
         else
         {
            
         }
       
    }
    System.out.println(Arrays.toString(c));
    
   }
}
