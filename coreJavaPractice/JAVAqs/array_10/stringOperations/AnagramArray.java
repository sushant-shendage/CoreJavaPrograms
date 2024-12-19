import java.util.Arrays;

public class AnagramArray {
    public static void main(String[] args) {
        String s1="batt",s2="tabht";
        anagramArr(s1,s2);
    }
    static String sort(String s)
    {
        char ch[]=new char[s.length()];
        for (int i = 0; i < s.length(); i++) 
        {
            ch[i]=s.charAt(i);
        }

        for (int i = 0; i < ch.length-1; i++) 
        {
            for (int j = 0; j < ch.length-1-i; j++) 
            {
                if(ch[i]>ch[i+1]){
                    ch[i]=(char)(ch[i]+ch[i+1]);
                    ch[i+1]=(char)(ch[i]-ch[i+1]);
                    ch[i]=(char)(ch[i]-ch[i+1]);
                }
                
            }
        }
        System.out.println(Arrays.toString(ch));
        return new String(ch);
    }
    static void anagramArr(String s1,String s2)
    {
        s1=sort(s1);
        s2=sort(s2);

        if (s1.equals(s2)) 
        {
            System.out.println("anagram array");
        }
        else
        {
            System.out.println("NOT an anagram array");
        }
    }
}
