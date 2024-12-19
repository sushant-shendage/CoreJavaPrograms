import java.util.Arrays;

public class Replacefx {
    public static void main(String[] args) {
        String s1 = "abchh";
        System.out.println(s1);
        s1 = replaceChar(s1, 'h', 'H');
        System.out.println(s1);
    }

    public static String replaceChar(String s, char ch1, char ch2) {
        char ch[] = new char[s.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ch1) {
                ch[i] = ch2;
            }
        }
        return new String(ch);
    }
}
