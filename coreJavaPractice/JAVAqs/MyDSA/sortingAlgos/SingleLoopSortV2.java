import java.util.Arrays;

public class SingleLoopSortV2 {
    public static void main(String[] args) {
        int a[] = { 7,7,0,0,9,6,9,3};
        sortSl(a);
    }

    static void sortSl(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

        int a[]=new int[max+1];
          for (int i = 0; i < arr.length; i++) {
            a[arr[i]]=arr[i];
          }
        System.out.println(Arrays.toString(a));

        int b[]=new int[arr.length];
        for (int j = 0,i=0; j < b.length; i++) {
            if (a[i]==0) {
                continue;
            }else{

                b[j]=a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
