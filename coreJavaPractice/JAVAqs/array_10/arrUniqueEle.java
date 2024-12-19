import java.util.Arrays;

public class arrUniqueEle {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 3, 2, 2, 1, 2, 3, 3, 2, 1, 1, 1, 1, 2, 3, 3, 2, 1, 1, 1, 1 };
        int[] ref = new int[a.length];
        int count, j, count2 = 0;

        System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(ref));
        for (int i = 0; i < ref.length; i++) {

            if (ref[i] == -1) {
                break;
            } else {
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

        }
        System.out.println(Arrays.toString(ref));

        for (int i = 0; i < ref.length; i++) {

            if (ref[i] >= 0) {
                count2++;
            }
        }
        // System.out.println(count2);

        int[] aUnique = new int[count2];

        for (int i = 0, k = 0; i < ref.length; i++) {

            if (ref[i] >= 0) {
                aUnique[k] = a[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(aUnique));

    }

}
