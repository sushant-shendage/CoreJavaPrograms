public class StringPalindrom {
    public static void main(String[] args) {
        String s="nayan";

        isStrpalindrom(s);
    }
    static void isStrpalindrom(String s)
    {
        int flag=1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
                flag=0;
                break;
            }
        }
        if (flag==1) {
            System.out.println(s+" is Palinndrom string");
        } else {
            System.out.println(s+" is NOT a Palinndrom string");
        }
    }
}
