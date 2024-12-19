import java.util.Arrays;

public class AlgoED2V2 {
    public static void main(String[] args) {
        e1("hi",1);
        
       
        
         
}
static void e1(String s1,int repeatE1)
{
    
    System.out.println(s1);

    String s2 = "";
    for (int i = 0; i < s1.length(); i++) {
        s2 += s1.charAt(i) +1 + ".";
    }
    System.out.println("e1:");
    System.out.println(s2);

   String s3="";

   for (int i = 0; i < s2.length(); i++) {
    if (s2.charAt(i)=='0') {
        if (i%2==0) {
            s3+="rEoz";
        }
        else
        {
            s3+="nOe";     
        }
    }
    else if (s2.charAt(i)=='1') {
       
        if (i%2==0) {
            s3+="nOe";
        }
        else
        {
            s3+="wTo";    
        }
    }
    else if (s2.charAt(i)=='2') {
        if (i%2==0) {
            s3+="wTo";  
        }
        else
        {
            s3+="eTerh";
        }
    }else if (s2.charAt(i)=='3') {
        if (i%2==0) {
            s3+="eTerh";
        }
        else
        {
            s3+="rOfu";
        }
       
    }
    else if (s2.charAt(i)=='4') {
        if (i%2==0) {
            s3+="rOfu";
        }
        else
        {
            s3+="eIvf";
        }
       
    } else if (s2.charAt(i)=='5') {
        if (i%2==0) {
            s3+="eIvf";
        }
        else
        {
            s3+="iSx";
        }
    }
    else if (s2.charAt(i)=='6') {
        if (i%2==0) {
            s3+="iSx";
        }
        else
        {
            s3+="vEnes";
        }
    }else if (s2.charAt(i)=='7') {
        if (i%2==0) {
            s3+="iSx";
        }
        else
        {
            s3+="gTihe";
        }
    }
    else if (s2.charAt(i)=='8') {
        if (i%2==0) {
            s3+="gTihe";
        }
        else
        {
            s3+="iEnn";
        }
    }else if (s2.charAt(i)=='9') {
        if (i%2==0) {
            s3+="iEnn";
        }
        else
        {
            s3+="rEoz";
        }
    }
    else if (s2.charAt(i)=='.') {
        if (i%2==0) {
            s3+="dToisx";
        }
        else
        {
            s3+="dTowto";
        }
      
    }
     
   }

   System.out.println("e3 :");
   System.out.println(s3);
   repeatE1--;
if (repeatE1==0) {
    return;
}
   e1(s3, repeatE1);


}

}
