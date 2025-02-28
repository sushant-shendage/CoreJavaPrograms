// package javapgms.patterenPrograms;

public class PyramidPatteren {
    public static void main(String[] args) {
        pyramidPatteren(7);
    }
    
    static void pyramidPatteren(int n){

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=n-i; j++) 
            System.out.print(" ");

            for (int j = 1; j <=i; j++) 
            System.out.print("* ");
            
            System.out.println();
        }
    }
}
