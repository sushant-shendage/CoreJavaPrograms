public class RotateNumber {
    public static void main(String[] args) {
//  System.out.println("combi :"+combination(170));
printAllCombinations("abcd");

    }
    static void printAllCombinations(String str){
for (int i = 0; i < str.length(); i++) {
    String strCombi=str.charAt(i)+"";
    for (int j = 0; j < str.length(); j++) {
        if (i==j) {
            continue;
        }
        strCombi+=str.charAt(j)+"";
       
    }

    System.out.println(strCombi);
      strCombi=str.charAt(i)+"";
    for (int j = str.length()-1; j >=0 ; j--) {
        if (i==j) {
            continue;
        }
        strCombi+=str.charAt(j)+"";
       
    }
    System.out.println(strCombi);

}
    }

    static int combination(int num){
        
        int totalDigits = 0,multiplier=1;
        
        for (int i = num; i != 0; i /= 10) {
            totalDigits++;
        }


        for (int i = 1; i <= totalDigits-1; i++) {
            multiplier*=10;
        }

        
        for (int i = 1; i <= totalDigits; i++) {
            int lastDigit=num%10;
            num/=10;
    
            num=num+lastDigit*multiplier;
    
            int j;
            for(  j=2;num%j!=0;j++){
    
            }
    
            if (j==num) {
                 return num;
            }
        }
        

        
        return 0;
    }
}
