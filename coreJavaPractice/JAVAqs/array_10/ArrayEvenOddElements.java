
public class ArrayEvenOddElements {

    public static void main(String[] args) {
        int eSum = 0, oSum = 0;

        int[] arr1 = { 77, 9, 67, 48, 57, 92, 21, 7, 22, 20 };

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.println("even :" + arr1[i]);
                eSum+=arr1[i];

            }
        }
        System.out.println("eSum:"+eSum);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                System.out.println("Odd :" + arr1[i]);
                oSum+=arr1[i];

            }
        }
        System.out.println("oSum:"+oSum);
    }

}
