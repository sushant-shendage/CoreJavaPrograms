import java.util.Arrays;

public class FrequebcyOfWords {
    public static void main(String[] args) {
        String s1 = "abc def def ghi ghi ghi jkl jkl jkl jkl";
        wordFrequency(s1);
    }

    static void wordFrequency(String s) {
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
        // System.out.println(Arrays.toString(words));

        int ref[] = new int[words.length];
        int count;
        for (int i = 0; i < words.length; i++) {
            count = 0;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    ref[j] = -1;
                    count++;
                }
            }
            if (ref[i] != -1) {
                ref[i] = count;
            }
        }
        System.out.println(Arrays.toString(ref));

        /*
         * frequency of each word
         * 
         */
        int uniqueWordsCount = 0;
        for (int i = 0; i < ref.length; i++) {
            if (ref[i] >= 0) {
                System.out.println(words[i] + " : " + ref[i]);
            }
            if (ref[i] >= 0) {
                uniqueWordsCount++;
            }

        }
        System.out.println(uniqueWordsCount);
        int repeatedWordCount = ref.length - uniqueWordsCount;
        System.out.println(repeatedWordCount);
        /*
         * max/min time repeated words
         */
        int maxRepeated = ref[0], maxIndex = 0, minRepeated = ref[0], minIndex = 0;
        for (int i = 0; i < ref.length; i++) {
            if (ref[i] >= maxRepeated) {
                maxIndex = i;
            }
            // if (ref[i] =< minRepeated) {
            // maxIndex=i;
            // }
        }

        System.out.println(words[maxIndex] + " repeated maximum times ");
        System.out.println(words[minIndex] + " repeated minimum times ");

        /*
         * unique words
         */

        String Uwords[] = new String[uniqueWordsCount];

        for (int i = 0, j = 0; i < words.length; i++) {
            if (ref[i] >= 0) {
                Uwords[j] = words[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(Uwords));
        String uniqueWordsString = "";

        for (int i = 0; i < Uwords.length; i++) {
            uniqueWordsString += Uwords[i] + " ";
        }
        System.out.println(uniqueWordsString);
    
    /*
     * replace word
     */
    
     
    }
     
}
