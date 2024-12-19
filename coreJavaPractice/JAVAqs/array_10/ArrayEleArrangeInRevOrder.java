import java.util.Arrays;

public class ArrayEleArrangeInRevOrder {
    public static void main(String[] args) {
        int[] a={11,22,33,44,55,66,77};
        int temp;
        System.out.println(Arrays.toString(a));

        for (int i = 0,j=(a.length-1); i <=j; i++,j--) {
            
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;

        }
        System.out.println(Arrays.toString(a));

    }
    
}
