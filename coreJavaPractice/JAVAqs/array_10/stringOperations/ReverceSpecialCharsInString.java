import java.util.Arrays;

public class ReverceSpecialCharsInString {
    public static void main(String[] args) {
        String s1="kj#$%ghvg*+-@";
        System.out.println(s1);

         char ch[]=new char[s1.length()];

         for (int i = 0; i < ch.length; i++) {
            ch[i]=s1.charAt(i);
         }
         //System.out.println(Arrays.toString(ch));

         for (int i = 0,j=ch.length-1; i < j;) {
            if ( ((int)ch[i]<65||(int)ch[i]>90)&&((int)ch[i]<97||(int)ch[i]>122)&&((int)ch[i]<48||(int)ch[i]>57)) 
            {
                if (((int)ch[j]<65||(int)ch[j]>90)&&((int)ch[j]<97||(int)ch[j]>122)&&((int)ch[j]<48||(int)ch[j]>57)) 
                {
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                    i++;
                    j--;
                }
                else
                {
                    j--;
                }

            }else
            {
                i++;
            }
          
         }
         //System.out.println(Arrays.toString(ch));

          String s2= new String(ch);
          System.out.println(s2);

    }
    
}
