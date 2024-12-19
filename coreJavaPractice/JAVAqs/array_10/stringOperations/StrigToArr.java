import java.util.Arrays;

public class StrigToArr {
    public static void main(String[] args) {
        String s1="Qspiders";

       char ch[]=StrToCharArr(s1);
       System.out.println(Arrays.toString(ch));
    }
    static char[] StrToCharArr(String s)
    {
        char ch[]=new char[s.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i]=s.charAt(i);
        }
        return ch;
    }
}
