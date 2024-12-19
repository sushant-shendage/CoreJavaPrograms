import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortCharArr("xys")));
        
    }
    static char[] sortCharArr(String s1)
    {
        char ch[]=new char[s1.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i]=s1.charAt(i);
        }
        //System.out.println(Arrays.toString(ch));
        for (int i = 0; i < ch.length-1; i++) {
            for (int j = 0; j < ch.length-1-i; j++) {
                if (ch[j]>ch[j+1]) {
                    char temp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                }
            }
        }
         return ch;
    }
}
