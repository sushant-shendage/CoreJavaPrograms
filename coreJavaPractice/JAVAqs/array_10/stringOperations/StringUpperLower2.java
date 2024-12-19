public class StringUpperLower2 {
    public static void main(String[] args) {
        String s1 = "thisISdemoSTRING";

        char ch[] = new char[s1.length()];

        for (int i = 0; i < ch.length; i++) {
            if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
                ch[i] = (char) (s1.charAt(i) - 32);
            }
            else if(s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
            {
                ch[i] = (char) (s1.charAt(i) + 32);
            }
        }

        String s2=new String(ch);

        System.out.println(s2);
    }

}
