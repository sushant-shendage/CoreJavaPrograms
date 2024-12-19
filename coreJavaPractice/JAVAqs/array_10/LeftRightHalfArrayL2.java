import java.util.Arrays;

public class LeftRightHalfArrayL2 {
    public static void main(String[] args) {

         int[] a = { 4, 1, 2, 3,100, 6, 7, 8, 5 };
        int[] b = new int[a.length];

        int first = a[0], last = a[a.length - 1],mid=a[a.length/2];

        for (int i = 0,j = a.length - 1; i < a.length / 2 - 1||j > a.length / 2; i++,j--) {
            b[i] = a[i + 1];
            b[j] = a[j - 1];
        }
        b[a.length / 2 - 1] = first;
        b[a.length / 2 + 1] = last;
        b[b.length/2]=mid;

        
       
        System.out.println(Arrays.toString(b));
        
    }
    
}
