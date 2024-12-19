public class P1DigitsInString {
    public static void main(String[] args) {
        String s1 = "453bjs2sf3";// sumOfDigits=17

        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
                sum += s1.charAt(i) - 48;
            }
        }
        System.out.println(sum);
    }
}
