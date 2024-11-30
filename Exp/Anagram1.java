public class Anagram1 {
    public static void main(String[] args) {
        String str1 = "abccd";
        String str2 = "dabcd";

        int flag = 0;

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                flag += ((str1.charAt(i) + 0) - (str2.charAt(i) + 0));
            }
        } else {
            System.out.println("NOT ANAGRAM...!");
            return;
        }

        if (flag==0) {
            System.out.println("ANAGRAM string..!");
        } else {
            System.out.println("NOT ANAGRAM...!");
        }



         
    }

}
