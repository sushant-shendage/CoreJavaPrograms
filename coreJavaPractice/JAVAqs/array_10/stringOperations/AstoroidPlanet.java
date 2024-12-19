import java.util.Arrays;

public class AstoroidPlanet {
    public static void main(String[] args) {
        String s1 = "feab**yc**"; // abcdef*g***hijk***lmn
        System.out.println(s1);

        char ch[] = new char[s1.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = s1.charAt(i);
        }
        int flag, count = 0;

        do {
            flag = 0;
            for (int i = 0; i < ch.length-1; i++) {
                if (ch[i] == '*' && ch[i + 1] == '*') {
                    //System.out.println("swap " + (i + 1));
                    char temp = ch[i];
                    ch[i] = ch[i - 1];
                    ch[i - 1] = temp;
                    flag = 1;
                    break;
                }
            }

        } while (flag > 0);
        //System.out.println(Arrays.toString(ch));

        String res = "";

        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == '*' || ch[i + 1] == '*') {
                continue;
            }

            res += ch[i];
        }

        if ( ch[ch.length - 1] != '*') {
            res += ch[ch.length - 1];
        }

        System.out.println(res);
    }

}
