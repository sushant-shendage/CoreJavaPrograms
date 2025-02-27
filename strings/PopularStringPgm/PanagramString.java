import java.util.Arrays;

public class PanagramString {
    public static void main(String[] args) {
        String str1 = "The black brown fox jumps over the lazy dog";
        if (str1.length() >= 26) {

            String str2 = "";
            for (int i = 0; i < str1.length() - 1; i++) {
                if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') {
                     str2 += (char)(str1.charAt(i)+0+32);  
                } else {
                    str2 +=(str1.charAt(i));
                }
                str2=new String();
              
            // if()
            // {

            // }

        } else {
            System.out.println("not panagram");
        }
    }
}
