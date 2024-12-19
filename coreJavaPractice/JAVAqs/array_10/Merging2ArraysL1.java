import java.util.Arrays;

public class Merging2ArraysL1 {
    public static void main(String[] args) {

        int[] a={77,9,67,48,57,94,21,44,55};
        int[] b={555,666};

        int[] c=new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            c[i]=a[i]; 
        }

        for (int i = a.length,j=0; i < c.length; i++,j++) {
            c[i]=b[j]; 
        }
        
        System.out.println(Arrays.toString(c));
       

    }

}
