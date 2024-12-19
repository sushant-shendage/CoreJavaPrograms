import java.util.Arrays;

public class UnionOf2Arr {
    public static void main(String[] args) {
        int[] b = { 1, 2, 3, 3, 4 };
        int[] c = { 2, 2, 3, 3, 3, 3, 4, 4 };
        System.out.println(Arrays.toString(b));
        // System.out.println(b.length);
        System.out.println(Arrays.toString(c));
        // System.out.println(c.length);

        b = uniqueArr(b);
        c = uniqueArr(c);

        // System.out.println(Arrays.toString(b));
        // System.out.println(b.length);
        // System.out.println(Arrays.toString(c));
        // System.out.println(c.length);

        int[] d = new int[b.length + c.length];

        for (int i = 0, j = 0; i < d.length; i++) {
            if (i < b.length) {
                d[i] = b[i];
            } else {
                d[i] = c[j];
                j++;
            }
        }

        System.out.println(Arrays.toString(d));

        int[] e = d;

        d = uniqueArr(d);
        System.out.println("union of 2 :" + Arrays.toString(d));

        e = arrRepeated(e);
        System.out.println("Intersection :" + Arrays.toString(e));

    }

    static int[] uniqueArr(int[] arr) {
        int[] a = new int[arr.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];

        }
        int[] ref = new int[a.length];
        int count, j, count2 = 0;

        // System.out.println(Arrays.toString(a));
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
        // System.out.println(Arrays.toString(ref));

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

        // System.out.println(Arrays.toString(aUnique));

        return aUnique;
    }

    static int[] arrRepeated(int[] arr) {
        int[] a = new int[arr.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];

        }
        int[] ref = new int[a.length];
        int count, count2 = 0, j;

        // System.out.println(Arrays.toString(a));
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
        // System.out.println(Arrays.toString(ref));

        for (int i = 0; i < ref.length; i++) {
            if (ref[i] > 0) {
                count2++;
            }
        }
        // System.out.println(count2);

        int[] arr2 = new int[count2];

        for (int i = 0, k = 0; i < ref.length; i++) {
            if (ref[i] > 0) {
                arr2[k] = a[i];
                k++;
            }
        }
        // System.out.println(Arrays.toString(arr2));
        return arr2;
    }

}
