import java.util.Arrays;

public class SentenceToWordArr {
    public static void main(String[] args) {
        String s1 = "This is the sentence with seven words";
        wordArr(s1);
         
    }

    static void wordArr(String s) {

        int space = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                space++;
            }

        }
        //System.out.println(space);

        String word[] = new String[space + 1];

        String temp = "";
        String string1=""; 
        for (int i = 0, j =word.length-1; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
                //System.out.println(temp);
            } else if (s.charAt(i) == ' ') {

                word[j] = revStr(temp);
                //word[j] = temp;
                j--;
                temp = "";

            }
            if (i == s.length() - 1) {
                word[j] = revStr(temp);
                //word[j] = temp;
                break;
            }
            
            
            
        }
        
        
         for (int j2 = 0; j2 < word.length; j2++) {
             string1+=word[j2]+"  ";
         }
        System.out.println(Arrays.toString(word));
        System.out.println(string1);
        
                    
        
    }

    static String revStr(String s) {
        char ch[] = new char[s.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }
        //System.out.println(Arrays.toString(ch));
        char temp;
        for (int i = 0; i < ch.length/2; i++) {
             temp=ch[i];
             ch[i]=ch[ch.length-1-i];
             ch[ch.length-1-i]=temp;
        }
        //System.out.println(Arrays.toString(ch));
        return new String(ch);

    }
}
