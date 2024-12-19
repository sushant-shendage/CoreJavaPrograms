import java.util.Arrays;

public class HalfArrayRev {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7,8,88,77,66,55,44,33,22,11};
        int temp;

         for (int i = a.length/2,j=a.length-1; i <= ((3*a.length)/4)-1; i++,j--) {
             temp=a[i];
            a[i]=a[j];
            a[j]=temp;
         }
        System.out.println(Arrays.toString(a));
    }
    
}
