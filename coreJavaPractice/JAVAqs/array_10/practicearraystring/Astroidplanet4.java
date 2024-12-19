public class Astroidplanet4 {
    public static void main(String[] args) {
        String s1="bcd***";

        String s2=astroid(s1);
        System.out.println(s2);
    }
    static String astroid (String s)
    {
        char ch[]=new char[s.length()];
        
        for (int i = 0; i < ch.length; i++) {
            ch[i]=s.charAt(i);
        }
        int flag=0;
do{
flag=0;

    for (int i = 0; i < ch.length-1; i++) {
        if (ch[i]=='*' && ch[i+1]=='*') {
            ch[i]=(char)((int)ch[i]+ch[i-1]);
            ch[i-1]=(char)((int)ch[i]-ch[i-1]);
            ch[i]=(char)((int)ch[i]-ch[i-1]);
            flag=1;
            break;
        }
    }


}while(flag>0);
        System.out.println(ch);
        
        String finalStr="";
        for (int i = 0; i < ch.length-1; i++) {
            if (ch[i]=='*' || ch[i+1]=='*') {
                continue;
            }
            finalStr+=ch[i];
        }
        System.out.println("in fx:"+finalStr);
        return finalStr;
    } 
}
