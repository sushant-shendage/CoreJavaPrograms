
public class AnagramSentence {
    public static void main(String[] args) {
        String s1 = "abc def ghi";
        String s2 = "ABCDEF Ghi";

        int asciiSum1 = 0, asciiSum2 = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                continue;
            }
            asciiSum1 += ((s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') ? s1.charAt(i) + 32 : s1.charAt(i));

        }

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == ' ') {
                continue;
            }
            asciiSum2 += ((s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z') ? s2.charAt(i) + 32 : s2.charAt(i));
        }

        if (asciiSum1 - asciiSum2 == 0) {
            System.out.println(" Anagram string or Sentence ");
        } else {
            System.out.println("NOT anagram string or sentence");
        }
    }
}