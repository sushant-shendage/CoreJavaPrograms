// package javapgms.patterenPrograms;

public class Patteren2 {
    public static void main(String[] args) {
        trianglePatt1(7);
        trianglePatt2(7);
        trianglePatt3(7);
        trianglePatt4(7);
        trianglePatt5(7);
        trianglePatt6(7);





    }

    static void trianglePatt1(int n){
        for (int i = 1; i <=7; i++) {
            for (int j = 1; j <= i; j++) 
                System.out.print("*");

            System.out.println();
        }
    }
    static void trianglePatt2(int n){
        for (int i = 1; i <=7; i++) {

            for (int j =1; j <=n-i; j++) 
                System.out.print(" ");

            for (int j = 1; j <= i; j++) 
                System.out.print("*");

            System.out.println();
        }
    }

    static void trianglePatt3(int n){
        for (int i = 1; i <=7; i++) {

            for (int j =1; j <=n-i; j++) 
                System.out.print(" ");

            for (int j = 1; j <= i; j++) 
                System.out.print("* ");

            System.out.println();
        }
    }

    static void trianglePatt4(int n){
         for ( int i = n ; i > 0 ; i-- ) {
            for (int j = 1; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
         }
    }
    static void trianglePatt5(int n){
        for ( int i = n ; i > 0 ; i-- ) {
            for (int k = n-i; k >0; k--) {
                System.out.print(" ");
            }
           for (int j = 1; j <i; j++) {
               System.out.print("*");
           }
           System.out.println();
        }
   }
   static void trianglePatt6(int n){
    for ( int i = n ; i > 0 ; i-- ) {
        for (int k = n-i; k >0; k--) {
            System.out.print(" ");
        }
       for (int j = 1; j <i; j++) {
           System.out.print("* ");
       }
       System.out.println();
    }
}
}
