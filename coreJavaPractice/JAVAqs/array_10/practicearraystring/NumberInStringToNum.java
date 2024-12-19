public class NumberInStringToNum {
    public static void main(String[] args) {
        String s1 = "8753468";
        // int num=numFormat(s1);
        numFormat(s1);
    }

    static void numFormat(String s) {
        int count = s.length();

        long num = 0;

        for (int i = 0; i < s.length(); i++) {
            num += (s.charAt(i) - 48) * (int) Math.pow(10, --count);
            System.out.println(count);
        }
        System.out.println(num);

    }
}
