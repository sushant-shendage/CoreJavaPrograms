import java.util.Arrays;

public class Astroidpgm {
    public static void main(String[] args) {
        String s1 = "dfgab***c*d*efgh**";
        astroidStr(s1);
        System.out.println("pgm end");
    }

    static void astroidStr(String s) {
        char ch[] = new char[s.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }
        System.out.println(Arrays.toString(ch));
        int flag;
        do {
            flag = 0;
            for (int i = 0; i < ch.length - 1; i++) {
                if (ch[i] == '*' && ch[i + 1] == '*') {
                    char temp = ch[i];
                    ch[i] = ch[i - 1];
                    ch[i - 1] = temp;
                    flag = 1;
                    break;
                }
            }
        } while (flag > 0);
        System.out.println(ch);

        String finalStr="";

        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='*' || ch[i+1]=='*') {
               continue;
            }
            finalStr+=ch[i];
        }
        System.out.println(finalStr);
    }

}
