public class AllPatterens {
     public static void main(String[] args) {
        int rows=11;

         System.out.println("1]right-angled trianlge ,verical_face_left,base_down=========");

         for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i; j++) 
                System.out.print("*");
            
            System.out.println();
         }


         System.out.println("1]right-angled trianlge ,verical_face_left,base_down(Hollow)=========");

         for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i; j++)
                if( i==j ||(j==1||i==rows)) 
                System.out.print("*");
                else
                System.out.print(" ");
            
            System.out.println();
         }


         System.out.println("2]right-angled trianlge ,verical_face_right,base_down(Hollow)=========");

         for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= rows-i; j++) 
            System.out.print(" ");

            for (int j = 1; j <= i; j++) 
            if( i==j ||(j==1||i==rows)) 
                    System.out.print("*");
                    else
                    System.out.print(" ");
            
            System.out.println();
         }


         System.out.println("3]right-angled trianlge ,verical_face_left,base_up====FAILED..!=====");

         for (int i = 1; i <= rows ; i++) {
            for (int j = rows-i; j > 0; j--) 
             if (i==1 ||j==1||(j==rows+1-i && j <= (rows+1-i))) 
                System.out.print("*");
                else
                System.out.print(" ");
            
            System.out.println();
         }


         System.out.println("4]right-angled trianlge ,verical_face_right,base_up=========");

         for (int i = 1; i <= rows ; i++) {
            for (int k = 1; k <= i-1; k++) 
            System.out.print(" ");

            for (int j = 1; j <=rows-i  ; j++) 
                System.out.print("*");
            System.out.println();
         }

         System.out.println("4]right-angled trianlge ,verical_face_right,base_up(Hollow)=========");

         for (int i = 1; i <= rows ; i++) {
            for (int k = 1; k <= i-1; k++) 
            System.out.print(" ");

            for (int j = 1; j <=rows-i  ; j++)
                if(i==1 || j==1||j==rows-i) 
                System.out.print("*");
                else
                System.out.print(" ");

            System.out.println();
         }

         

         System.out.println("5]pyramid base_down=========");
         for (int i = 1; i <= rows; i++) {
            // for (int j = rows-i; j > 0; j--) {
            //     System.out.print(" ");
            // }
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
         }

         System.out.println("5]pyramid base_down(Hollow)=========");
         for (int i = 1; i <= rows; i++) {
            // for (int j = rows-i; j > 0; j--) {
            //     System.out.print(" ");
            // }
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
            if(i==j||j==1||i==rows)
                System.out.print("* ");
                else
                System.out.print("  ");

            System.out.println();
         }

         System.out.println("5]pyramid base_up=========");
          
         for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i-1; j++) 
                System.out.print(" ");
            for (int j = 1; j <= rows-i; j++) 
                System.out.print("* ");
                System.out.println();
         }


         for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) 
                System.out.print(" ");

            for (int j = 1; j <= rows-i; j++)
            System.out.print("* ");

            System.out.println();
            
         }

         System.out.println("5]pyramid base_up(Hollow)=========");
          
         for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i-1; j++) 
                System.out.print(" ");
            for (int j = 1; j <= rows-i; j++) 
            if(i==1||j==1||(j==rows-i))
                System.out.print("* ");
                else
                System.out.print("  ");

                System.out.println();
         }


         for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) 
                System.out.print(" ");

            for (int j = 1; j <= rows-i; j++)
            System.out.print("* ");

            System.out.println();
            
         }

         System.out.println("5]>=========");
          
         for (int i = 1,k=0; i <= rows; i++) {

            if (i<= (rows/2)+1)
            k++;
            else
            k--;

            for (int j = 1; j <= k ; j++) 
                System.out.print("*");
            System.out.println();
            
         }



         System.out.println("5]>=========(Hollow)");
          
         for (int i = 1,k=0; i <= rows; i++) {

            if (i<= (rows/2)+1)
            k++;
            else
            k--;

            for (int j = 1; j <= k ; j++) 
            if(j==1|| j==k)
                System.out.print("*");
                else
                System.out.print(" ");

            System.out.println();
            
         }

         System.out.println("6]<=========");
          
         for (int i = 1,k=0; i <= rows; i++) {

            if (i<= (rows/2)+1)
            k++;
            else
            k--;

            for (int j = 1; j <= rows-k ; j++) 
            System.out.print(" ");

            for (int j = 1; j <= k ; j++) 
                System.out.print("*");
            System.out.println();
            
         }
         System.out.println("6]<=========(Hollow)");
          
         for (int i = 1,k=0; i <= rows; i++) {

            if (i<= (rows/2)+1)
            k++;
            else
            k--;

            for (int j = 1; j <= rows-k ; j++) 
            System.out.print(" ");

            for (int j = 1; j <= k ; j++) 
            if(j==k||j==1)
                    System.out.print("*");
                    else
                    System.out.print(" ");
            System.out.println();
            
         }
         

         System.out.println("6]<>=========");
          
         for (int i = 1,k=0; i <= rows; i++) {

            if (i <= (rows/2)+1)
            k++;
            else
            k--;

            for (int j = 1; j <= rows-k ; j++) 
            System.out.print(" ");

            for (int j = 1; j <= k ; j++) 
                System.out.print("* ");
            System.out.println();
            
         }

         System.out.println("6]<>=========");
          
         for (int i = 1,k=0; i <= rows; i++) {

            if (i <= (rows/2)+1)
            k++;
            else
            k--;

            for (int j = 1; j <= rows-k ; j++) 
            System.out.print(" ");

            for (int j = 1; j <= k ; j++) 
            if(j==k||j==1)
                System.out.print("* ");
                else
                System.out.print("  ");


            System.out.println();
            
         }
         

    }

    
}
