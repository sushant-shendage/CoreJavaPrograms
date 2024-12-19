
import java.util.Scanner;

public class ArraySwaping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = smalleststring(s);
        System.out.println(result);
        ;

    }

    public static String smalleststring(String s)
    {
char[] ch=new char[s.length()];
for (int i = 0; i < ch.length; i++) {
    ch[i]=s.charAt(i);
}

int count=1;
while(count>0){
    count=0;
for (int i = 0; i < ch.length-1; i++) {
    if(ch[i]=='1' && ch[i+1]=='0' )
    {
ch[i]='r';
count++;
    }

    char[] ch2=new char[ch.length-count];
    for (int j = 0; j < ch.length-1; j++) {
        if(ch[j]!='r' )
        {
     ch2[j]=ch[j];
        }
        else
        {
            ch2[j+1]=ch[j];
        }

        
}
}

System.out.println(ch);

String s2=new String(ch2);
return s2;
    }
}
}
