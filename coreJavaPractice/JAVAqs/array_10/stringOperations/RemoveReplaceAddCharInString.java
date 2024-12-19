public class RemoveReplaceAddCharInString {
    public static void main(String[] args) {

        arrAddCharToStr("Hollywood", 'z');
        arrRemoveCharToStr("Hollywood", 'l');
        arrReplaceCharToStr("Hollywood", 'o', 't');
        wordsInSentence("this is the sentence having seven words.");

    }

    static void arrAddCharToStr(String s1, char ch1) {

        char ch[] = new char[s1.length() + 1];

        // System.out.println(s1);
        for (int i = 0; i < ch.length - 1; i++) {
            ch[i] = s1.charAt(i);
        }
        ch[ch.length - 1] = ch1;

        System.out.println(ch);

    }

    static void arrRemoveCharToStr(String s1, char ch1) {

        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ch1) {
                count++;
            }
        }
        // System.out.println(s1);
        // System.out.println(count);

        char chArr[] = new char[s1.length() - count];

        // System.out.println(chArr.length);

        for (int i = 0, j = 0; i < chArr.length;) {
            if (s1.charAt(j) == ch1) {
                j++;
            } else {
                chArr[i] = s1.charAt(j);
                i++;
                j++;
            }
        }
        System.out.println(chArr);
    }

    static void arrReplaceCharToStr(String s1, char char1, char char2) {
        char chArr[] = new char[s1.length()];

        // System.out.println(chArr.length);

        for (int i = 0; i < chArr.length; i++) {
            if (s1.charAt(i) == char1) {
                chArr[i] = char2;
                continue;
            }
            chArr[i] = s1.charAt(i);
        }
        System.out.println(chArr);

    }
    static void wordsInSentence(String s1){

        System.out.println("Sentence :: "+s1);
        

        int count=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)==32) {
                count++;
            }
        }
        count++;
        System.out.println("Words :: "+count);
    }
}
