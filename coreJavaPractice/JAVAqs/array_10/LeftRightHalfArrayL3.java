import java.util.Arrays;

public class LeftRightHalfArrayL3 {
    public static void main(String[] args) {
        int[] a = { 4, 1, 2, 3,100, 6, 7, 8, 5 };
        

        int first = a[0];
        int last = a[a.length - 1];

        for (int i = 0,j=a.length-1; i < a.length/2-1 || j>=a.length/2; i++,j--) {
            a[i]=a[i+1];
            a[j]=a[j-1];
        }
        a[a.length/2-1]=first;
        a[a.length/2+1]=last;
        System.out.println(Arrays.toString(a));
    }
    
}
