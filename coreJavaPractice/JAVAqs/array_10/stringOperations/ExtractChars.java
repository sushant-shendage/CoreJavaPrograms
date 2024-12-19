public class ExtractChars {
    public static void main(String[] args) {
        String s1="KILL";
        showChars(s1);

    }
    static void showChars(String s)
    {
        for (int i = 0; i < s.length(); i++) {
            System.out.printf(" %c ,",s.charAt(i));
        }
    }
}
