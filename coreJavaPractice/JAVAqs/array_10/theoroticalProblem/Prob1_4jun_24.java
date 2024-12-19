
import java.util.Arrays;

public class Prob1_4jun_24 {
    /*-------------------------
     * i/p 1:
     * 1 2 2 4
     * o/p 1:expected
     * 2 3
     * -------------------------
     * i/p 2:
     * 5 3 2 1 2
     * o/p 2:
     * 2 4
     * ------------------------- 
     */

    public static void main(String[] args) {
        int[] a = { 5,3,2,1,2 };
        int[] a_ref = new int[a.length];
        int count, j;

        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a_ref.length; i++) {

            count = 0;
            for (j = i + 1; j < a_ref.length; j++) {

                if (a[i] == a[j]) {

                    count++;
                    a_ref[j] = -1;
                }

                if (a_ref[i] != -1) {
                    a_ref[i] = count;
                }
            }
        }

        //System.out.println(Arrays.toString(a_ref));

        int duplicateEle=0;
        for (int i = 0; i < a_ref.length; i++) {
            if (a_ref[i] == -1) {
                duplicateEle = a[i];
                break;
            }
        }
       // System.out.println("duplicate ele sum : " + duplicateEle);
        int gArrSum = 0;
        int arrSum = (a.length * (a.length + 1)) / 2;
        for (int i = 0; i < a_ref.length; i++) {
            gArrSum += a[i];
        }
        //System.out.println("    Given arr sum : " + gArrSum);
        //System.out.println("          Arr sum : " + arrSum);
        int missingEle=arrSum-(gArrSum-duplicateEle);
        //System.out.println("       missingEle : " + missingEle);

        for (int i = 0; i < a_ref.length; i++) {
            if (a_ref[i] == -1) {
             a[i]=missingEle;
                break;
            }
        }
        //System.out.println(Arrays.toString(a));

        for (int i = 0; i < a_ref.length; i++) {
            if (a_ref[i] == -1||a_ref[i] == 1) {
             System.out.print(a[i]+" ");
            }
        }
    }

}
