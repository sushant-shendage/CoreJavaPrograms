
public class SumOfDigitsInString {
    public static void main(String[] args) {
      digitSumStr("i1E1n66N6I61e62N1n3d72T73o74I75s76x77");
    }
    public static void digitSumStr(String s1)
    {
       

        System.out.println(s1);
        int sum=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)>='0' && s1.charAt(i)<='9') {
               sum+=(int)s1.charAt(i)-48;
            }
        }
        System.out.println("sum of digits :"+sum);
    }
}
