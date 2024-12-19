public class RevStr {
    public static void main(String[] args) {
        String string1="abcdef";

        String string2="";

        // for (int i = string1.length()-1; i >=0 ; i--) {
        //     string2+=string1.charAt(i);
        // }

        // System.out.println(string2);



        // for (int i =0; i < string1.length() ; i++) {
        //     string2 =string1.charAt(i)+string2;
        // }

        // System.out.println(string2);



        //   for (int i =0,j=string1.length()-1; i < string1.length()/2 ; i++,j--) {
        //     char leftChar=string1.charAt(i);
        //     char rightChar=string1.charAt(j);

        //     char temp;

        //     temp=leftChar;
        //     leftChar=rightChar;
        //     rightChar=temp;


        // }

        // System.out.println(string1);

// String s1="nitin";

// s1.charAt(0)='M';



System.out.println(new StringBuffer(string1).reverse());
        
    }
    
}
