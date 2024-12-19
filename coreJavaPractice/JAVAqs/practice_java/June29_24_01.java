import java.util.Arrays;
import java.util.Scanner;

public class June29_24_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // printing elements of array in reverce order without using function

        int[] a = { 77, 0, 9, 67, 48, 57, 94, 21 };
        int[] b = { 77, 92, 67, 485, 7, 9, 4, 218 };

        int[] c = new int[5];

        int[] d = { 11, 22, 33, 44 };
        int[] e = new int[4];
        int[] f = new int[8];
        int[] g = new int[12];

        int[] h = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] i = { 11, 22, 33, 44, 55 };
        int[] j = new int[14];

        int[] k = { 1, 2, 3, 3, 8, 1 };

        int[] l = { 1, 2, 3, 4, 5 };

        int[] m = { 1, 2, 3, 4 ,3, 2, 1 };

        int[] n={5,1,2,3,4,6,8,9,10,11,7};

        int[] p={5,1,2,3,4,6,8,9,10,11,7};

        // for (int i = a.length - 1; i > -1; i--) {
        //
        // System.out.print(a[i] + ",");
        // }
        // System.out.println();
        //
        // System.out.println(Arrays.toString(a));
        //
        // arrPrint(b);
        // arrRevPrint(b);
        // arrLen(b);
        // arrPosiEle(b);
        // arrTotalPosiEle(b);
        // arrNegeEle(b);
        // arrTotalNegeEle(b);
        // arrEvenEle(b);
        // arrTotalEvenEle(b);
        // arrOddEle(b);
        // arrTotalOddEle(b);
        // arrayPrimeEle(b);
        //
        // decInArr(c);// initilize elements of array
        // arrPrint(c);
        // arrEleSum(c);
        // arrEleProd(c);
        // arrStartEndEle(c);
        //
        // arr1CToarr2(d,e);
        // arrPrint(e);
        // arrMergeEven(e,e,f);
        // arrPrint(f);
        // arrMergeUneven(e,f,g);
        // arrPrint(g);
        //
        // arrMergeUnevenAlt(h, i, j);
        // arrPrint(j);
        // arrRev(j);
        // arrPrint(j);
        // arrPalindrom(k);

        // arrPrint(l);
        // arrLRotate(l, 3);
        // arrRRotate(l, 3);
        // arrUPEleRev(m);

        // arrPrint(m);
        // arrPartRev(m, m.length/2+1);

        // arrPrint(n);
        // arrHalfLShift(n);
        // arrHalfRShift(n);

        arrHalfLRShift(p);
customPrintFx("hi_this_is_message");

    }

    // method to print elements of array
    static void arrPrint(int[] arr) {
        System.out.printf("\nelementf of array :---------\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

    }

    // method to print elements of array in reverce order
    static void arrRevPrint(int[] arr) {
        System.out.printf("\nelementf of array rev. order  :------\n");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",");
        }

    }

    // method to print length of array
    public static void arrLen(int[] arr) {
        int a, count = 0;

        try {
            while (true) {
                a = arr[count];
                count++;
            }
        } catch (Exception ex) {
            System.out.printf("\narray length fx-----------");
            System.out.printf("\nLength of array : " + count);

        }
    }

    // method to prints positive elements of array [_/]
    // method to prints negative elements of array [_/]
    // method to print total number positive elements of array [_/]
    // method to print total number negative elements of array [_/]

    // method to prints even elements of array
    // method to prints odd elements of array
    // method to print total number even elements of array
    // method to print total number odd elements of array

    // method to prints prime elements of array
    // method to print total number prime elements of array

    static void arrPosiEle(int[] arr) {
        System.out.println("\npositive elementf of array :---------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {

                System.out.print(arr[i] + ",");
            }
        }

    }

    static void arrTotalPosiEle(int[] arr) {
        int count = 0;
        System.out.println("\nTotal number of positive elements of array :---------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        System.out.printf("\nTotal positive elements :%d", count);

    }

    static void arrNegeEle(int[] arr) {
        System.out.println("\nNegetive elementf of array :---------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {

                System.out.print(arr[i] + ",");
            }
        }

    }

    static void arrTotalNegeEle(int[] arr) {
        int count = 0;
        System.out.println("\nTotal number of negative elements of array :---------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                count++;
            }
        }
        System.out.printf("\nTotal negetive elements :%d", count);

    }

    static void arrEvenEle(int[] arr) {
        int count = 0;
        System.out.println("\nTotal number of even elements of array :---------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + ",");

            }
        }

    }

    static void arrTotalEvenEle(int[] arr) {
        int count = 0;
        System.out.println("\nTotal number of even elements of array :---------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;

            }
        }
        System.out.printf("\n%d", count);

    }

    static void arrOddEle(int[] arr) {
        int count = 0;
        System.out.println("\nTotal number of odd elements of array :---------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + ",");

            }
        }

    }

    static void arrTotalOddEle(int[] arr) {
        int count = 0;
        System.out.println("\nTotal number of odd elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.printf("%d", count);
    }

    static boolean checkPrime(int n) {
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                break;
            }
        }
        return i == n;
    }

    static void arrayPrimeEle(int[] arr) {
        System.out.printf("\nprime element in array: ");
        for (int i = 0; i < arr.length; i++) {
            if (checkPrime(arr[i])) {
                System.out.print(+arr[i] + ",");
            }
        }
    }

    static void decInArr(int[] arr) {
        System.out.println("\ninitilize array :-------------");

        for (int i = 0; i < arr.length; i++) {
            Scanner sc2 = new Scanner(System.in);
            System.out.printf("\nEnter %d/%d element : ", i + 1, arr.length);
            arr[i] = sc2.nextInt();
        }
    }

    static void arrEleSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.printf("\nAddition : %d", sum);
    }

    static void arrEleProd(int[] arr) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            prod *= arr[i];
        }

        System.out.printf("\n Multiplication : %d", prod);
    }

    static void arrStartEndEle(int[] arr) {

        for (int i = 0; i <= arr.length / 2; i++) {
            System.out.printf("\n (%d,%d)", arr[i], arr[arr.length - 1 - i]);
        }

    }

    static void arr1CToarr2(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

    }

    static void arrMergeEven(int[] arr1, int[] arr2, int[] arr3) {
        for (int i = 0, j = arr1.length; i < arr2.length; i++, j++) {
            arr3[i] = arr1[i];
            arr3[j] = arr2[i];
        }

    }

    static void arrMergeUneven(int[] arr1, int[] arr2, int[] arr3) {
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            // arr3[j]=arr2[i];
        }
        for (int i = arr1.length, j = 0; i < arr3.length; i++, j++) {
            arr3[i] = arr2[j];

        }

    }

    static void arrMergeUnevenAlt(int[] arr1, int[] arr2, int[] arr3) {
        if (arr1.length > arr2.length) {

            for (int i = 0, j = 0; i <= arr3.length - 1; i += 2, j++) {
                if (i < 2 * arr2.length) {
                    arr3[i] = arr1[j];
                    arr3[i + 1] = arr2[j];
                } else {
                    arr3[i] = arr1[j];
                    i--;
                }

            }

        } else if (arr2.length > arr1.length) {
            for (int i = 0, j = 0; i <= arr3.length - 1; i += 2, j++) {
                if (i < 2 * arr1.length) {
                    arr3[i] = arr1[j];
                    arr3[i + 1] = arr2[j];
                } else {
                    arr3[i] = arr2[j];
                    i--;
                }

            }

        }

    }

    static void arrRev(int[] arr) {
        for (int i = 0; i <= arr.length / 2; i++) {
            arr[i] = arr[i] + arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i];
            arr[i] = arr[i] - arr[arr.length - 1 - i];
        }

    }

    static void arrPalindrom(int[] arr) {
        int i;
        for (i = 0; i <= arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                break;
            }
        }

        if (i == arr.length / 2 + 1) {

            System.out.printf("\npalindromic array");

        } else {
            System.out.printf("\nNOT palindromic array");
        }

    }

    static void arrLRotate(int[] arr, int rotation) {

        for (int i = 1; i <= rotation; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];

            }
            arr[arr.length - 1] = first;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void arrRRotate(int[] arr, int rotation) {
        for (int i = 1; i <= rotation; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void arrUPEleRev(int[] arr) {
        for (int i = 0; i <= arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                System.out.printf("%d ", arr[i]);
            }
        }
    }

    static void arrPartRev(int[] arr,int position)
    {
        for (int i = position,j=arr.length-1; i < j; i++,j--) {
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];        
        }
        arrPrint(arr);

    }

    static void arrHalfLShift(int[]arr)
    {
        int first=arr[0];
        for (int i = 0; i <= arr.length/2-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length/2-1]=first;
        System.out.printf("\nleft shift");
        arrPrint(arr);
    }

    static void arrHalfRShift(int[]arr)
    {
        int last=arr[arr.length-1];
        for ( int i=arr.length-1;i>=arr.length/2+1;i--) {
            arr[i]=arr[i-1];
        }
         arr[arr.length/2+1]=last;
        System.out.printf("\nright shift");
        arrPrint(arr);
    }

    static void arrHalfLRShift(int[]arr)
    {
        arrHalfLShift(arr);
        arrHalfRShift(arr);

    }

    public static void customPrintFx(String s1)
    {
System.out.println(s1);
    }
}
