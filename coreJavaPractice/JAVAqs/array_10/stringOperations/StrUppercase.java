import java.util.Arrays;

public class StrUppercase {
    public static void main(String[] args) {
        String s1 = "DemoStriNG";
        System.out.println(s1);
        s1 = StrUppercase(s1);
        System.out.println(s1);
        s1 = StrLowercase(s1);
        System.out.println(s1);
    }

    public static String StrUppercase(String s) {
        char ch[] = new char[s.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            }
        }
        return new String(ch);
    }

    public static String StrLowercase(String s) {
        char ch[] = new char[s.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            }
        }
        return new String(ch);
    }

}
