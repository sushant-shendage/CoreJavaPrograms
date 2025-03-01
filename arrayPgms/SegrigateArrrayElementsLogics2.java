// package javapgms.arrayPgms;

import java.util.Arrays;

public class SegrigateArrrayElementsLogics2 {
    public static void main(String[] args) {
        int arr[] = { -100, 77, 0, 9, -200, 67, 48, 57 };
        System.out.println(Arrays.toString(arr));
        // arr = sortA(arr);
        // arr = sortD(arr);
        // arr = evenOddSeg(arr);
        // arr = evenOddSeg2(arr);
        // arr = positiveNegative(arr);
        //  arr = positiveNegative2(arr);

        

        

        System.out.println(Arrays.toString(arr));

        char charArr[]={'&','^','f','g','I','&','T','7','b','i','*','&','8'};
        System.out.println(Arrays.toString(charArr));
        charArr=normalSpecialChars2(charArr);
        

        System.out.println(Arrays.toString(charArr));

    }

    static int[] evenOddSeg(int arr[]) {
        for (int i = 0, j = arr.length - 1; i < j;)
        if (arr[i]==0) 
        continue;
            else if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
                i++;
            } else if (arr[i] % 2 != 0 && arr[j] % 2 != 0) {
                j--;
            } else if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
                i++;
                j--;
            } else {
                i++;
                j--;
            }

        return arr;
    }
    static int[] evenOddSeg2(int arr[]) {
        for (int i = 0, j = arr.length - 1; i < arr.length;)
            if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
                i++;
            } else if (arr[i] % 2 != 0 && arr[j] % 2 != 0) {
                j--;
            } else if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
                i++;
                j--;
            } else {
                i++;
                j--;
            }

        return arr;
    }

    static int[] sortA(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }

        return arr;
    }

    static int[] sortD(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }

        return arr;
    }

    static int[] positiveNegative(int arr[]) {
        for (int i = 0,j=arr.length-1; i <j;)
             if (arr[i]<0 && arr[j]<0) j--;
             else if(arr[i]>=0 && arr[j]>0)i++;
            else if(arr[i]>=0 && arr[j]<0){i++;j--;}
            else{
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
                i++;j--;

            }
        return arr;
    }

    static int[] positiveNegative2(int arr[]) {
        for (int i = 0,j=arr.length-1; i <j;)
             if (arr[i]<0 && arr[j]<0) i++;
             else if(arr[i]>=0 && arr[j]>0)j--;
            else if(arr[i]<0 && arr[j]>=0){i++;j--;}
            else{
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
                i++;j--;
        System.out.println(Arrays.toString(arr));

            }
        return arr;
    }

    static boolean isLowerCaseAlpha(char c){
        return (c>='a' && c<='z' )?true:false;
    }
    static boolean isUpperCaseAlpha(char c){
        return (c>='A' && c<='Z' )?true:false;
    }
    static boolean isDigit(char c){
        return (c>='0' && c<='0' )?true:false;
    }

    static boolean isSpecialChar(char c){
        return (!isLowerCaseAlpha(c) && !isUpperCaseAlpha(c) && !isDigit(c) )?true:false;
    }

    static char[] normalSpecialChars(char arr[]){
        for (int i = 0, j=arr.length-1; i < j;) {
            if (isSpecialChar(arr[i]) && isSpecialChar(arr[j])) j--;
            else if(!isSpecialChar(arr[i]) && !isSpecialChar(arr[j]))i++;
            else if(!isSpecialChar(arr[i]) && isSpecialChar(arr[j])){i++;j--;}
            else {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return arr;
    }

    static char[] normalSpecialChars2(char arr[]){
        for (int i = 0, j=arr.length-1; i < arr.length-1;) {
            if (isSpecialChar(arr[i]) && isSpecialChar(arr[j])) j--;
            else if(!isSpecialChar(arr[i]) && !isSpecialChar(arr[j]))i++;
            else if(!isSpecialChar(arr[i]) && isSpecialChar(arr[j])){i++;j--;}
            else {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return arr;
    }
}
