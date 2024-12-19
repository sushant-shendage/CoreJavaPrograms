import java.util.Arrays;

public class AlgoED1 {
    public static void main(String[] args) {
        
        

         String s3="this is our secreate mission so be careful";
System.out.println(s3);
         String i1=" ";

         for (int i =0,j=s3.length()-1; j>0 || i <s3.length()-1; i++) {
            if (i<s3.length()-1) {
                i1+=s3.charAt(i);
            }
            else
            {
                i1+=s3.charAt(j);
                j--;
            }

         }

         //System.out.println(i1);
         
         
          char ch[]=new char[i1.length()];
         for (int i = 0; i < i1.length(); i++) {
            ch[i]=(char)((int)i1.charAt(i)+i);
         }
         System.out.println(ch);


         
         

         String res="";
         for (int i = 0; i < s3.length()+1; i++) {
            res+=(char)((int)ch[i]-i);
         }

          

         System.out.println(res);
       
    }
}
