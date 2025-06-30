import java.util.Arrays;

public class ConvertingStringTocharArrayDriver3 {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------");

        String stringVar = "ThisIsString";
        System.out.println("string : " + stringVar);
        char charArrayUsingString[] = stringVar.toCharArray();
        System.out.println("String to charecter array : " + Arrays.toString(charArrayUsingString));
      

        char charArr[] = { 'A', 'B', 'C' };
        System.out.println("char array :" + Arrays.toString(charArr));
        String stringUsingCharArray = new String(charArr);
        System.out.println("charecter array to string : " + stringUsingCharArray);

        System.out.println("--------------------------------------------------------");
        

        System.out.println("string to charecter array : " + Arrays.toString("stringLiteral".toCharArray()));
        System.out.println("charecter arry to string : " + new String("stringLiteral".toCharArray()));

        System.out.println("--------------------------------------------------------");

    }
}
