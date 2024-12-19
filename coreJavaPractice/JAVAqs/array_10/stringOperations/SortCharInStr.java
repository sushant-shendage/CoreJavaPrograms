public class SortCharInStr {
    public static void main(String[] args) {
        String s1="hgfedcba";
        s1=sortChars(s1);

        System.out.println(s1);
    }
    static String sortChars(String s)
    {
        char ch[]=new char[s.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i]=s.charAt(i);
        }
        for (int i = 0; i < ch.length-1; i++) {
            for (int j = 0; j < ch.length-1-i; j++) {
                if (ch[j]>ch[j+1]) {
                    // char temp=ch[j];
                    // ch[j]=ch[j+1];
                    // ch[j+1]=temp;
                    ch[j]=(char)(ch[j]+ch[j+1]);
                    ch[j+1]=(char)(ch[j]-ch[j+1]);
                    ch[j]=(char)(ch[j]-ch[j+1]);
                }
            }
        }
         return new String(ch);
    }
}
