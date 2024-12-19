import java.util.Arrays;

public class ReplaceWord {
    public static void main(String[] args) {
        String s = "abc def def ghi ghi ghi";
        spaceCount(s);
        replaceword(s, "ghi", "xyz");

    }

    static void replaceword(String s, String s1, String s2) 
    {
        String words[] = new String[spaceCount(s)];

        String temp = "";

        
        for (int i = 0, j = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else if (s.charAt(i) == ' ') {
                words[j] = temp;
                j++;
                temp = "";
            }
            if (i == s.length() - 1) {
                words[j] = temp;
            }
        }
        System.out.println(Arrays.toString(words));


        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(s1)) {
                words[i]=s2;
            }
        }
        System.out.println(Arrays.toString(words));
        
        String final33="";

        for (int i = 0; i < words.length; i++) {
            final33+=words[i]+" ";
        }
        System.out.println(final33);
    }   

    static int spaceCount(String s)

    {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }

}
