public class Pyr {
    public static void main(String[] args) {
        pyramidPatt(5);

        //diamond problem

        int n=11;
        for (int i = 1,k=0; i <= n; i++) {
            if(i <= (n/2)+1)
            k++;
            else
            k--;

            System.out.printf("%d ,",k);
            
        }
    }
    static void pyramidPatt(int n){
        

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");  
              }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  
              }
              System.out.println();
        }
    }
}
