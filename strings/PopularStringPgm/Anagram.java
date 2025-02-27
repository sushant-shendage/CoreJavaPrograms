public class Anagram {
    public static void main(String[] args) {
        String inputString1="abcd";
        String inputString2="acbd";

        if (inputString1.length()==inputString2.length()) {
            int flag=0;

            for (int i = 0; i < (inputString1.length()-1); i++) {
                flag+=(inputString1.charAt(i)-inputString2.charAt(i));
            }
            if (flag==0) {
                System.out.println("anagram string");
            } else {
                System.out.println("NOT anagram string");
            }
            
        } else {
            System.out.println("not anagrams");
        }
    }
}
