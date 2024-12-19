public class AstroidPlanet {
    public static void main(String[] args) {
        String s1="abcd***t";
         finalStr(s1);

    }
    public static void finalStr(String s)
    {
char ch[]=new char[s.length()];
for (int i = 0; i < ch.length; i++) {
    ch[i]=s.charAt(i);
}
int flag;
do {
    flag=0;
    for (int i = 0; i < ch.length-1; i++) {
        if (ch[i]=='*' && ch[i+1]=='*') {
            char temp=ch[i];
            ch[i]=ch[i-1];
            ch[i-1]=temp;
            flag=1;
            System.out.println("afterswap");
            break;
        }
        System.out.println("while loop");//failed
    }
    System.out.println("do while  loop");
} while (flag>0);
System.out.println(ch);
String finalStr="";
for (int i = 0; i < ch.length-1; i++) {
    if (ch[i]=='*' ||ch[i+1]=='*') {
        continue;
    }
    finalStr+=ch[i];
}
if (ch[ch.length-1]!='*') {
    finalStr+=ch[ch.length-1];
}
System.out.println(finalStr);
    }
}
