import java.util.Arrays;

public class PrintArrEleInRevOrder {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};

        for (int i = 0; i < a.length/2; i++) {
            a[i]=a[i]+a[a.length-1-i];
            a[a.length-1-i]=a[i]-a[a.length-1-i];
            a[i]=a[i]-a[a.length-1-i];
        }
        System.out.println("array in reverce order");
          System.out.println(Arrays.toString(a));
    }
    
}
