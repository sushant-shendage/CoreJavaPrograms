// package PopularStringPgm;

public class PrintUniqueDuplicate {

    public static void main(String[] args) {
        String str = "The black brown fox jumps over the lazy dog" ;
        String ansStr = "" ;

        for (int i = 0; i < str.length(); i++) {
            int j;
            for (j = 0; j < str.length(); j++) {
                if (i != j) {
                    if (str.charAt(i) == str.charAt(j)) {
                        break;
                    }
                }
            }
            //remove unique element
            //remove duplicate element
            if ((j == (str.length()))) {
                ansStr += str.charAt(i);
            }
        }

        System.out.println(ansStr);
    }
}
