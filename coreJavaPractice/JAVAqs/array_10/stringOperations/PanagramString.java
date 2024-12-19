import java.util.Arrays;

public class PanagramString {
    public static void main(String[] args) {
        String s1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG the quick brown fox jumps over the lazy dog";
        uniqueArr(s1);
    }

    static void uniqueArr(String s) {
        char ch[] = new char[s.length()];
        for (int i = 0; i < ch.length; i++) {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                ch[i]= (char)(s.charAt(i)+32);
            }
            else
            {

                ch[i] = s.charAt(i);
            }
        }

        int[] ref = new int[ch.length];
        int count, j, count2 = 0;

        System.out.println(Arrays.toString(ch));
        // System.out.println(Arrays.toString(ref));
        for (int i = 0; i < ref.length; i++) {

            count = 0;
            for (j = i + 1; j < ref.length; j++) {

                if (ch[i] == ch[j]) {

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

        char[] aUnique = new char[count2];

        for (int i = 0, k = 0; i < ref.length; i++) {

            if (ref[i] >= 0) {
                aUnique[k] = ch[i];
                k++;
            }
        }

        int sum =-32;
        for (int i = 0; i < aUnique.length; i++) {
            sum += aUnique[i];
        }

        //System.out.println(Arrays.toString(aUnique));
        //System.out.println(sum-32);

        if (sum==2847) {
            System.out.println("panagram");
        }
        else{
            System.out.println("not panagram");

        }
 

    }

}
