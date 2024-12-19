import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = { 4,3,2};
        int swapcount=0;
        System.out.println(Arrays.toString(a));
       
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[i+1]<a[i]) {
                    System.out.printf("swaping of %d and %d\n",a[i],a[i+1]);
                    a[i]=a[i]+a[i+1];
                    a[i+1]=a[i]-a[i+1];
                    a[i]=a[i]-a[i+1];
                    
                    swapcount++;
                    //PROGRAM FAILED....!;()
                }
            }
        }
        System.out.println(swapcount);
        System.out.println(Arrays.toString(a));
    }

     
}
