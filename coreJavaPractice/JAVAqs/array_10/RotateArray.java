import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] a={1,2,3,4,5,6,7};

        //right shift
        int last=a[a.length-1];

        for (int i = 0; i < a.length-1; i++) 
        {
            a[i+1]=a[i];
        }
        a[0]=last;


        System.out.println(Arrays.toString(a));
    }
    
}
