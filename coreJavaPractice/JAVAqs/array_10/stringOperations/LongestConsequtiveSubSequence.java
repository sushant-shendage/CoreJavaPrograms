import java.util.Arrays;

public class LongestConsequtiveSubSequence {
    public static void main(String[] args) {
        // aabaaabbbbccccc
        // 021003000400005
        longConsecutiveSequence("aaaa");
    }
    static void longConsecutiveSequence(String s1)
    {
        
         
        if (s1.length() == 1) {
            System.out.println(s1);
        } else {
            int count = 0, imax = 0, max = 0;
            for (int i = 0; i < s1.length() - 1; i++) {
                count++;
                if (s1.charAt(i) != s1.charAt(i + 1)) {
                    count = 0;
                }
                if (count > max) {
                    max = count;
                    imax = i;
                }
                System.out.println(count);
            }

            System.out.println(s1.charAt(imax) + " charecter repeated " + max + " times");
            for (int i = 0; i <= max; i++) {
                System.out.print(s1.charAt(imax));
            }

        }

    }

    

}
