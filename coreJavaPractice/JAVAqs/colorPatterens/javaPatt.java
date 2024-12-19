// package colorPatterens;

public class javaPatt {
    public static void main(String[] args) {
        for (int i = 1; i <=190; i++) {
            for (int j = 1; j <= 401; j++) {

                if(  
                     (i==8) && (j==101)
                     || (i==1) && (j>=225 && j<=226)









                ){
                    System.out.print(".");
                }else{

                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
    
}
