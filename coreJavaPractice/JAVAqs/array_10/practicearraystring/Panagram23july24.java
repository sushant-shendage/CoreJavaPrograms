import java.util.Arrays;
//very important panagramv2//
public class Panagram23july24 {
    public static void main(String[] args) {
        String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
         char ch[]=new char[s1.length()];

        for (int i = 0; i < ch.length; i++) {
          ch[i]=s1.charAt(i);  
        }
        for (int j = 0; j < ch.length-1; j++) {
            for (int i = 0; i < ch.length-1-j; i++) {
                if (ch[i]>='A' && ch[i]<='Z') {
                    ch[i]+=32;
               }
               if (ch[i+1]>='A' && ch[i+1]<='Z') {
                ch[i+1]+=32;
           }

                if(ch[i]>ch[i+1]){
                    ch[i]=(char)((int)ch[i]+ch[i+1]);
                    ch[i+1]=(char)((int)ch[i]-ch[i+1]);
                    ch[i]=(char)((int)ch[i]-ch[i+1]);

                }
               
            }
        }
System.out.println(Arrays.toString(ch));
int sum=0;
char priviousChar=' ';
        for (int i = 0; i < ch.length; i++) {
           
            if (ch[i]==' ' || priviousChar==ch[i] ) {
                continue;
            }else{

               
                 
                sum+=(int)ch[i];
                priviousChar=ch[i];
            }
           
        }
        System.out.println(ch);
       if (sum==2847) {
         System.out.println("panagram");
       }
       else
       {
        System.out.println("not panagram");
       }

       char start='A',end='Z';
       int sum2=0;
        while (start<=end) {
            sum2+=(int)start;
            start++;
        }
        System.out.println(sum2);
    }
}
