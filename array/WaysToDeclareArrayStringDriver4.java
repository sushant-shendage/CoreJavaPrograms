import java.util.Arrays;

public class WaysToDeclareArrayStringDriver4 {
    public static void main(String[] args) {
        System.out.println("ways to declare string");
        // using string literal,String class,StringBuilder class,StringBuffer class

        String stringByStringLiteral = "stringUsingLiteral";
        System.out.println("string using string literal : " + stringByStringLiteral);
        System.out.println("----------------------------------------");

        String stringByStringClassObject = new String("stringByStringClassObject");
        System.out.println("string using String class object : " + stringByStringClassObject);
        System.out.println("----------------------------------------");

        StringBuilder stringByStringBuilderClass = new StringBuilder("stringByStringBuilderClass");
        System.out.println("string using StringBuilder class object : " + stringByStringBuilderClass);
        System.out.println("----------------------------------------");

        StringBuffer stringByStringBufferClass = new StringBuffer("stringByStringBufferClass");
        System.out.println("string using StringBuffer class object : " + stringByStringBufferClass);
        System.out.println("----------------------------------------");

        System.out.println("ways to declare array ");

        // declaring array using curly braces and array object

        int arrUsingCurlyBraces[] = { 1, 2, 3, 4 };
        System.out.println("declaring array using curly braces : " + Arrays.toString(arrUsingCurlyBraces));
        System.out.println("----------------------------------------");

        int arrUsingArrayObject[] = new int[2];
        System.out.println("declaring array using curly braces : " + Arrays.toString(arrUsingArrayObject));
        System.out.println("----------------------------------------");

        // normalString
        // doubleCoated"Word"InString
        // singleCoated'word'InString
        // doubleCoat"Inword
        // singleCoat'InWord

        /*
         * this
         * is
         * multiline
         * string
         */

        System.out.println("normalString");
        System.out.println("doubleCoated\"Word\"InString");
        System.out.println("singleCoated'word'InString");
        System.out.println(" singleCoat'InWord");
        System.out.println("this \r\n" + //
                "is\r\n" + //
                "multiline \r\n" + //
                "string");

    }

}
