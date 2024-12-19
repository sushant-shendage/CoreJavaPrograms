public class PanagramArr {
    public static void main(String[] args) {
        String s1 = "a bc defg HHHhia bc defg hijk l m nop qrstu vw xyZZZZZ";
        isPanagram(s1);
    }

    static void isPanagram(String s) {
        char ch[] = new char[s.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }
         System.out.println(ch);

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - 1; j++) {
                if (ch[i] >= 'A' && ch[i] <= 'Z') {
                    ch[i] += 32;
                }
                if (ch[j] > ch[j + 1]) {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }
         System.out.println(ch);
        int sum = 2847;
        char priviousChar = ' ';
        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == ' ' || ch[i] == priviousChar) {
                continue;
            } else {

                sum -= (int) ch[i];
                priviousChar = ch[i];
            }
        }
        System.out.println(ch);
         System.out.println(sum);
        if (sum == 0) {
            System.out.println("panagram");
        } else {
            System.out.println("NOT panagram");
        }

    }
}
