import java.util.Arrays;

public class SortWordsInSentence {
    public static void main(String[] args) {
        String s1 = "def xyz abc mno jkl ghi";
        wordsSort(s1);
    }

    public static void wordsSort(String s) {
        int space = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                space++;
            }
        }
        String words[] = new String[space + 1];
        String temp = "";
        for (int i = 0, j = 0; i < s.length(); i++) {
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

        String tempString,tempString2,temp2;
        for (int i = 0; i < words.length-1; i++) {
            for (int j = 0; j < words.length-1-i; j++) {
                //  tempString=words[j];
                //  System.out.println(tempString.charAt(0));
                //  tempString2=words[j+1];

                 if (words[j].charAt(0)>words[j+1].charAt(0)) {
                    temp2=words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp2;
                 }

            }
        }
         
        String finalString="";

        for (int i = 0; i < words.length; i++) {
            finalString+=words[i]+" ";
        }
System.out.println(finalString);
        
    }

}
