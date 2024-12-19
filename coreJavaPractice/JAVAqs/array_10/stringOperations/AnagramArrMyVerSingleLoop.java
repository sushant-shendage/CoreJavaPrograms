import java.util.Arrays;

public class AnagramArrMyVerSingleLoop {
    public static void main(String[] args) {
        String s1 = "eleven plus two", s2 = "twelve plus one";
        AnagramArr(s1, s2);
    }

    static void AnagramArr(String s1, String s2) {
        int flag = 0;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {

                flag += (int) s1.charAt(i) - s2.charAt(i);
                //System.out.println(flag);
            }

            if (flag == 0) {
                System.out.println("anagram array");
            } else {
                System.out.println("NOT anagram array");
            }
        } else {
            System.out.println("NOT anagram array");
        }

    }
}
