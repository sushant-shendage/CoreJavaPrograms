import java.util.Arrays;

public class AlgoED2 {
    public static void main(String[] args) {
        String s1 = "this is encrypted line";
        System.out.println(s1);
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            s2 += s1.charAt(i) +1 + ".";
        }
        System.out.println(s2);

        char ch[] = new char[s2.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i] = s2.charAt(i);
        }
        System.out.println(ch);
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='0') {
                ch[i]='1';
            } else if (ch[i]=='1') {
                ch[i]='2';
            }else if (ch[i]=='2') {
                ch[i]='3';
            }else if (ch[i]=='3') {
                ch[i]='4';
            }else if (ch[i]=='4') {
               ch[i]='5'; 
            }else if (ch[i]=='5') {
               ch[i]='6'; 
            }else if (ch[i]=='6') {
               ch[i]='7'; 
            }else if (ch[i]=='7') {
                ch[i]='8';
            }else if (ch[i]=='8') {
                ch[i]='9';
            }else if (ch[i]=='9') {
                ch[i]='0';
            }
            else if (ch[i]=='.' && i%2==0  ) {
                ch[i]='_';
            }else if (ch[i]=='.' && i%2!=0 ){
                ch[i]='-';
            }
            
        }
       System.out.println(ch);
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='-' || ch[i]=='_') {
                ch[i]='.';
            }
            else if (ch[i]=='0') {
                ch[i]='9';
            } else if (ch[i]=='1') {
                ch[i]='0';
            }else if (ch[i]=='2') {
                ch[i]='1';
            }else if (ch[i]=='3') {
                ch[i]='2';
            }else if (ch[i]=='4') {
               ch[i]='3'; 
            }else if (ch[i]=='5') {
               ch[i]='4'; 
            }else if (ch[i]=='6') {
               ch[i]='5'; 
            }else if (ch[i]=='7') {
                ch[i]='6';
            }else if (ch[i]=='8') {
                ch[i]='7';
            }else if (ch[i]=='9') {
                ch[i]='8';
            }
        }
      System.out.println(ch);

        String arr[]=new String[s1.length()];
String temp="";
        for (int i = 0,j=0; i < ch.length; i++) {
            if (ch[i]!='.') {
                temp+=ch[i];
            }
            else{
                arr[j]=temp;
                temp="";
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));

        int arr2[]=new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=numberFormat(arr[i]);
        }

        System.out.println(Arrays.toString(arr2));

         String finalStr="";

         for (int i = 0; i < arr2.length; i++) {
            finalStr+=(char)(arr2[i]-1);
         }
         System.out.println(finalStr);
    }

static int numberFormat(String s)
{
    int count=s.length();
    int sum=0;

    for (int i = 0; i < s.length(); i++) {
        sum+=(int)(s.charAt(i)-48) *(int)Math.pow(10, --count);
    }
return sum;
    }
}
