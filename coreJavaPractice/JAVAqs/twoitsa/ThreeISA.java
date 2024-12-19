import java.util.Arrays;

public class ThreeISA {
    public static void main(String[] args) {
        int arr[] = { 77,9,67,88};
        sortIn3n(arr);
    }

    static void sortIn3n(int arr[]) {
        System.out.println(Arrays.toString(arr));

        int min = arr[0], max = arr[0], MIN, MAX;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        } // O(n)-->calculation of min and max
        MIN = min;
        MAX = max;
        System.out.println("min ::" + min + " max ::" + max);
        if (min < 0 && max > 0) {
            MIN--;
        }

        int ref2ArrRange = MAX - MIN;
        System.out.println("ref2ArrRange ::" + ref2ArrRange);

        int refArrEle[] = new int[ref2ArrRange];
        int refArrEleCount[] = new int[ref2ArrRange];
        System.out.println("refArrEle.length ::" + refArrEle.length);
        System.out.println(Arrays.toString(refArrEle));
        System.out.println(Arrays.toString(refArrEleCount));

        for (int i = 0, j = i - min; i < arr.length; i++) {
            refArrEle[arr[i] - min] = arr[i];
            refArrEleCount[arr[i] - min]++;
        }
        System.out.println(Arrays.toString(refArrEle));
        System.out.println(Arrays.toString(refArrEleCount));

        int sortedArr[] = new int[arr.length];
        for (int i = 0, j = 0;;) {
            if (refArrEleCount[i] != 0) {
                System.out.println("sortedArr[j]"+sortedArr[j]);
                System.out.println("refArrEle[i]"+refArrEle[i]);
                System.out.println("refArrEleCount[i]"+refArrEleCount[i]);

                sortedArr[j] = refArrEle[i];
                refArrEleCount[i]--;
                System.out.println("sortedArr[j]"+sortedArr[j]);
                System.out.println("refArrEle[i]"+refArrEle[i]);
                System.out.println("refArrEleCount[i]"+refArrEleCount[i]);
                System.out.println("----------------------------------------------");
                j++;
            }  
            else if (refArrEleCount[i] == 0){i++;}
             
        }
       

    }
}
