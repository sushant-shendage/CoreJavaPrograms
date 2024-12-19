import java.util.Arrays;

public class BubbleSortTry2 {
    
    public static void main(String[] args) {
        int[] a = { 4, 3, 2, 1 };
        System.out.println(Arrays.toString(a));
        a=arrSelectionSort(a);
        System.out.println(Arrays.toString(a));
        
    }
static int[] arrBubbleSort(int[]a)
{
    for (int i = 0; i < a.length-1; i++) {
        for (int j = 0; j < a.length - 1 - i; j++) {
            if (a[j]> a[j+1]) {
                a[j] = a[j] + a[j + 1];
                a[j + 1] = a[j] - a[j + 1];
                a[j] = a[j] - a[j + 1];
            }
            //System.out.println(Arrays.toString(a));
        }
        //System.out.println("------------------------------");
    }
    //System.out.println(Arrays.toString(a));
    return a;
}
static int[] arrSelectionSort(int[]a)
{
    int small,smallI=0,j;
    for (int i = 0; i < a.length-1; i++) {
        small=i;
        for (j = i+1; j < a.length ; j++) {
            if (a[small]> a[j]) {
                small=j;
                  
            }
            //System.out.println(Arrays.toString(a));
            a[i]=a[i]+a[small];
        a[small]=a[i]-a[small];
        a[i]=a[i]+a[small];
        }
        
        //System.out.println("------------------------------");
    }
    //System.out.println(Arrays.toString(a));
    return a;
}

}
