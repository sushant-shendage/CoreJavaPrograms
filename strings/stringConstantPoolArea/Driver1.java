// package javapgms.strings.stringConstantPoolArea;
public class Driver1 {
    public static void main(String[] args) {
        String inputString1 = "demo1";
        String inputString2 = "demo1";
        String inputString3 = new String("demo1");

        System.out.println(inputString1 == inputString2);// true
        System.out.println(inputString2 == inputString3);// false

        System.out.println(inputString2.equals(inputString3));// true
        System.out.println(inputString1.equals(inputString2));// true
    }
}
