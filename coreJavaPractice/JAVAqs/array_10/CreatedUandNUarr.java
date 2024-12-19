import java.util.Arrays;

public class CreatedUandNUarr {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 2, 3, 3, 4, 5, 6 };
        int[] ref = new int[a.length];
        int count, j, count2 = 0;

        System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(ref));
        for (int i = 0; i < ref.length; i++) {

            count = 0;
            for (j = i + 1; j < ref.length; j++) {

                if (a[i] == a[j]) {

                    count++;
                    ref[j] = -1;
                }

                if (ref[i] != -1) {
                    ref[i] = count;
                }

            }

        }
        System.out.println(Arrays.toString(ref));

        for (int i = 0; i < ref.length; i++) {

            if (ref[i] >= 0) {
                count2++;
            }
        }
        // System.out.println(count2);

        int[] aUniqueR = new int[RECount(ref)];
        int[] aUniqueNR = new int[NRCount(ref)];

        for (int i = 0, k = 0, l = 0; i < ref.length; i++) {

            if (ref[i] > 0) {
                aUniqueR[k] = a[i];
                k++;
            } else if (ref[i] == 0) {
                aUniqueNR[l] = a[i];
                l++;
            }
        }

        System.out.println(Arrays.toString(aUniqueR));
        System.out.println(Arrays.toString(aUniqueNR));

        System.out.printf("repeted : %d   non-repeated : %d", RECount(ref), NRCount(ref));
    }

    static int RECount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    static int NRCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }

}
