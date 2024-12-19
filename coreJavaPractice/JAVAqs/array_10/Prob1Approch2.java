import java.util.Arrays;

public class Prob1Approch2 {
    public static void main(String[] args) {
        int[] a = { 1,6,3,4,2,6 };
        int[] ref = refArr(a);
        printArr(a);
        ref = refArr(a);
        int duplicate = arrDuplicate(a, ref), actual_sum = (a.length * (a.length + 1)) / 2,missingEle = actual_sum - (arrSum(a) - duplicate);
        System.out.println(duplicate + " " + missingEle);
    }
    

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.printf(+arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] refArr(int[] arr) {
        int count;
        int[] ref = new int[arr.length];

        for (int i = 0; i < ref.length; i++) {
            count = 0;
            for (int j = i + 1; j < ref.length; j++) {
                if (arr[i] == arr[j]) {

                    ref[j] = -1;
                    count++;
                }
            }
            if (ref[i] != -1) {
                ref[i] = count;
            }
        }
        return ref;
    }

    static int arrDuplicate(int[] arr, int[] refArr) {
        int duplicate = 0;
        for (int i = 0; i < refArr.length; i++) {
            if (refArr[i] == -1) {
                duplicate = arr[i];
                break;
            }
        }
        return duplicate;
    }

    static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
