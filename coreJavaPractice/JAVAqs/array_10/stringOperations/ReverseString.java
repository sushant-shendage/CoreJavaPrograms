public class ReverseString {
    public static void main(String[] args) {
        String s1="hgfedcba";

        char ch[]=new char[s1.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i]=s1.charAt(i);
        }
        System.out.println(ch);

        char temp;
        for (int i = 0; i < ch.length/2; i++) {
             temp=ch[i];
             ch[i]=ch[ch.length-1-i];
             ch[ch.length-1-i]=temp;
        }
        System.out.println(ch);

        revString("ABC");
    }
    
    static void revString(String s1)
    {
        

        char ch[]=new char[s1.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i]=s1.charAt(i);
        }
        System.out.println(ch);

        char temp;
        for (int i = 0; i < ch.length/2; i++) {
             temp=ch[i];
             ch[i]=ch[ch.length-1-i];
             ch[ch.length-1-i]=temp;
        }
        System.out.println(ch);

    }
}
