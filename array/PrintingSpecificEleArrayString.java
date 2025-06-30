import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class PrintingSpecificEleArrayString {
    public static void main(String[] args) {

        // printing even element of integer array
        // int arr[] = { 7, 4, 5, 5, 6, 7, 5 };
        // printArrElements(arr);
        // printEvenIntArrElements(arr);
        // calculateSumOfArray(arr);
        // segrigatePositiveNegativInArr(arr);
        // segrigateCharSpecialCharInArr("GFJkuygf^&%&6riyfi86v");
        // printUniqueElementsOfarr(arr);
        // printDuplicateElementsOfarr(arr);

        // printReapeatingStringChar("aswellas");

        int arr[]={77,9,67,48,48,67};

        //✅print all unique elements of an array
        //✅print repeating elements of an array
        //✅print non-repeating elements of an array

        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (i==j) {
                    continue; 
                }

                if (arr[i]==arr[j]) {
                    count++;
                    break;
                }
            }
            if (count!=1) {
                System.out.println(arr[i]);
            }
        }


    }

    static void printReapeatingStringChar(String str) {

        char charArr[]=str.toCharArray();
        for (int i = 0; i < charArr.length-1; i++) {
            for (int j = 0; j < charArr.length-1-i; j++) {
                char temp;
                if (charArr[j]>charArr[j+1]) {
                    temp=charArr[j];
                    charArr[j]=charArr[j+1];
                    charArr[j+1]=temp;
                }
            }
        }
System.out.println(Arrays.toString(charArr));
        str=new String(charArr);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)==str.charAt(i-1)) {
                if (i==1||str.charAt(i)!=str.charAt(i-2)) {
                    System.out.println("duplicate char : "+str.charAt(i));
                }
            }
        }

        System.out.println("----------------------");
int i=0;
        for (   ; i < str.length()-1; i++) {
            if ( str.charAt(i)!=str.charAt(i+1)) {
                System.out.println("U : "+str.charAt(i));
            }
        }
                       System.out.println("U : "+str.charAt(i));

    }

    static void printArrElements(int arr[]) {
        System.out.println("WAYS TO PRINT   ELEMENTS OF AN ARRAY..!");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ele from array : " + arr[i]);
        }
        System.out.println("way1:forLoop---------------------------------");
        for (int i : arr) {

            System.out.println("Ele from array :" + i);
        }
        System.out.println("way2:forEachLoop---------------------------------");

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; al.add(arr[i]), i++)
            ;
        System.out.println(al);
        System.out.println("way3:collection object ref var------------------");
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {

            System.out.println("arr ele :" + itr.next());
        }
        System.out.println("way4:iterator-------------------------");

        ListIterator<Integer> listItr = al.listIterator();
        while (listItr.hasNext()) {

            System.out.println("arr ele :" + listItr.next());
        }
        System.out.println("way5:ListIterator-------------------------");

        al.stream().forEach(e -> System.out.println("arr ele :" + e));
        System.out.println("way6:forEach() and Consumer---------------------------------");
        System.out.println("arr ele");
        al.stream().forEach(System.out::println);
        System.out.println("way7:forEach() and Consumer,Method Ref---------------------------------");

    }

    static void printEvenIntArrElements(int arr[]) {
        System.out.println("WAYS TO PRINT EVEN ELEMENTS OF AN ARRAY..!");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.println("Even from array : " + arr[i]);
        }
        System.out.println("way1:forLoop---------------------------------");
        for (int i : arr) {
            if (i % 2 == 0)
                System.out.println("Even from array :" + i);
        }
        System.out.println("way2:forEachLoop---------------------------------");
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; al.add(arr[i]), i++)
            ;
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {

            int j = itr.next();
            System.out.println("arr ele :" + j);
        }
        System.out.println("way3:iterator-------------------------");

        ListIterator<Integer> listItr = al.listIterator();
        while (listItr.hasNext()) {
            int j = listItr.next();
            if (j % 2 == 0)
                System.out.println("arr ele :" + j);
        }
        System.out.println("way4:ListIterator-------------------------");

        al.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println("even :" + e));
        System.out.println("way5:forEach() and Consumer---------------------------------");
        al.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
        System.out.println("way6:forEach() and method Ref---------------------------------");

    }

    static void calculateSumOfArray(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; sum += arr[i], i++)
            ;
        System.out.println("way2:sum : " + sum);

        sum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; al.add(arr[i]), sum += al.get(i), i++)
            ;
        System.out.println("way4:sum : " + sum);

        sum = 0;

        sum = al.stream().reduce(0, (a, b) -> a + b);
        System.out.println("way5:sum : " + sum);

        System.out.println("way6way7 Iterator and list iterator");

    }

    static void segrigatePositiveNegativInArr(int arr[]) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2;) {
            if (arr[i] >= 0 && arr[j] >= 00) {
                i++;
            } else if (arr[i] < 0 && arr[j] < 0) {
                j--;
            } else if (arr[i] < 0 && arr[j] >= 0) {
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
                i++;
                j--;
            } else {
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void segrigateCharSpecialCharInArr(String str) {

        String ansStr = "";
        String ansStr2 = "";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                ansStr = ansStr + str.charAt(i);
            } else {
                ansStr = str.charAt(i) + ansStr;
            }
        }
        System.out.println(new StringBuilder(ansStr).reverse());
    }

    static void printUniqueElementsOfarr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.println("Unique element : " + arr[i]);
            }
        }

        System.out.println("Unique element : " + arr[i]);
    }

    static void printDuplicateElementsOfarr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                if (arr[i] == 1 || arr[i] != arr[i - 2]) {
                    System.out.println("Duplicate ele of arr :" + arr[i]);
                }
            }
        }

    }

}
