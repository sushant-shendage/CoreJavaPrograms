public class RevStr {
    public static void main(String[] args) {
        String s="zyxw";
        System.out.println(s);
        s=RevStr(s);

        System.out.println(s);
    }
    static String RevStr(String s)
    {
        char ch[]=new char[s.length()];
 

        for (int i = ch.length-1,j=0; i >=0 ; i--,j++) {
           ch[j]=s.charAt(i);
        }

        return new String(ch);

    }
}
