
public class AnagramStringUsingSingleLoop {
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "HI";

        int flag = 0;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {

                flag += ((s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') ? s1.charAt(i) + 32 : s1.charAt(i))
                        - ((s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z') ? s2.charAt(i) + 32 : s2.charAt(i));

            }
        } else 
        {
            System.out.println("NOT anagram string");
            return;
        }

        if (flag == 0) {
            System.out.println(" Anagram string ");
        } else {
            System.out.println("NOT anagram string");
        }

    }
}