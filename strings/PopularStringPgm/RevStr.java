public class RevStr {
    public static void main(String[] args) {
        String str="acag";
        // String str2=rev(str);
         

        if (str.equals(new StringBuffer(str).reverse().toString().toString())) {
            System.out.println("given string is palindromic string..!");
        }else{
            System.out.println("given string is NOT palindromic string..!");
        }



        int num=121;
        // int revNum=new StringBuffer(String.valueOf(num)).reverse().
         
        if ( (String.valueOf(121)).equals(
        (new StringBuffer(String.valueOf(121)).toString()))
        
        ) {
            System.out.println("given num is palindromic num..!");
        }else{
            System.out.println("given num is NOT palindromic num..!");
        }


        int num2=1221;
        // int revNum=new StringBuffer(String.valueOf(num)).reverse().
         
        if ( (num2+"").equals(
        (new StringBuffer( num2+"").toString()))
        
        ) {
            System.out.println("given num is palindromic num..!");
        }else{
            System.out.println("given num is NOT palindromic num..!");
        }




//         int num = 123;
// String str = num + "";

//converting String-digit to number-digit
System.out.println(('0'-48));
System.out.println(('1'-48));

//converting  number to  string






    }

}
