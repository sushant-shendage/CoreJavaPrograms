import java.util.Arrays;

public class SentenceToWordArray {
    public static void main(String[] args) {
        String s1="this is demo string with seven words";

        int count=1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)==' ') {
                count++;
            }
        }
        //System.out.println(count);

        String word[]=new String [count];
        String temp="";
        for (int i = 0,j=word.length-1; i < s1.length(); i++) {
            if (s1.charAt(i)!=' ') {
                temp+=s1.charAt(i);
            }
            else if(s1.charAt(i)==' '){
                word[j]=revStr(temp);
                j--;
                temp="";
            }

            if (s1.length()-1==i) {
                word[j]=revStr(temp);
            }
           
        }

        System.out.println(Arrays.toString(word));

        String revWords="";
        
        for (int i = 0; i < word.length; i++) {
            revWords+=word[i]+" ";
        }

        System.out.println(revWords);

        
    }
    static String revStr(String s)
    {
        char ch[]=new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ch[i]=s.charAt(i);
        }
        System.out.println("char arr :"+Arrays.toString(ch));
        for (int i = 0; i < ch.length/2; i++) {     
                    char temp=ch[i];
                    ch[i]=ch[ch.length-1-i];
                    ch[ch.length-1-i]=temp;
        }

        return new String(ch);

    }
    
}
