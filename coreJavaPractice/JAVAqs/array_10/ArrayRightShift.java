import java.util.Arrays;

public class ArrayRightShift {
    public static void main(String[] args) {
        
        int[] a={1,2,3,4};

        for (int j = 1; j <= 2; j++) {
            int  last=a[a.length-1];
        for (int i = a.length-1; i >0; i--) {
            a[i]=a[i-1];
        }
        a[0]=last;
            
        }

        System.out.println(Arrays.toString(a));
    }
    
}
