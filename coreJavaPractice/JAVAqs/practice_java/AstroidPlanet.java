import java.util.Arrays;

public class AstroidPlanet {
    public static void main(String[] args) {
        String s1 = "This**i*sstri***n*";
        System.out.println(s1);
        char ch[] = StrToCharArr(s1);

        String finalString = astroidfx(ch);
        System.out.println(finalString);
    }

    static char[] StrToCharArr(String s) {
        char ch[] = new char[s.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }
        // System.out.println(Arrays.toString(ch));
        return ch;
    }

    static String astroidfx(char ch[]) {
        int flag;
        do {
            flag = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '*' && ch[i + 1] == '*') {
                    char temp = ch[i];
                    ch[i] = ch[i - 1];
                    ch[i - 1] = temp;
                    flag = 1;
                    break;
                }
            }

        } while (flag > 0);

        String finalStr = "";

        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == '*' || ch[i + 1] == '*') {
                continue;
            }
            finalStr += ch[i];
        }
        if (ch[ch.length-1] != '*' ) {
            finalStr += ch[ch.length-1];
        }
        return finalStr;
    }
}
