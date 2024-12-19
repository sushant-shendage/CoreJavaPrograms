import java.util.Arrays;
import java.util.Scanner;

public class InsertElementsatnthIndex {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 9, 10 };
        System.out.println(Arrays.toString(arr1));
        arr1=addEleInArr(arr1, 3, 5);
        System.out.println(Arrays.toString(arr1));

    }

    static int[] addEleInArr(int arr[], int indexPosition, int totalEle) {
        int arr2[] = new int[arr.length + totalEle];
        for (int i = 0, j = 0; i < arr2.length; i++) {
            if (i < indexPosition) {
                arr2[i] = arr[j];
                j++;
            } 
             if (i >= indexPosition + totalEle) {
                arr2[i] = arr[j];
                j++;
            }
            if (i>=indexPosition && i<indexPosition+totalEle) {
                Scanner sc=new Scanner(System.in);

                arr2[i]=sc.nextInt();
            }
        }
        // System.out.println(Arrays.toString(arr2));
       return arr2;
    }
}
