
public class AstroidPlanet3 {
    public static void main(String[] args) {
        String s1 = "zabc****";
        String s2=finalStr(s1);
        System.out.println(s2);
    }

    static String finalStr(String s) {
        char ch[] = new char[s.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }

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
        String s22 = "";

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '*' || ch[i + 1] == '*') {
                continue;
            }
            s22+=ch[i];
        }
        return s22;
    }
}
