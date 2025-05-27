// package javapgms.patterenPrograms;

public class AllPatterens  {
    public static void main(String[] args) {
         // 1]trianlge patterens
        // 1.1] right angled triangle with vertical side facing to left and base at bottom

        int n = 11;
        System.out.println("1.1] right angled triangle with vertical side facing to left and base at bottom");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++, System.out.print("*"))
                ;
            System.out.println();
        }

        // 1.2] right angled triangle with vertical side facing to left and base at
        // bottom(Hollow)
        System.out.println("1.2] right angled triangle with vertical side facing to left and base at bottom(Hollow)");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                if (j == 1 || i == j || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();
        }

        // 1.3] right angled triangle with vertical side facing to right and base at
        // bottom
        System.out.println("1.3] right angled triangle with vertical side facing to right and base at bottom");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++, System.out.print(" "))
                ;
            for (int k = 1; k <= i; k++, System.out.print("*"))
                ;
            System.out.println();
        }

        // 1.4] right angled triangle with vertical side facing to right and base at
        // bottom
        System.out.println("1.4] right angled triangle with vertical side facing to right and base at bottom");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                if (k == 1 || k == i || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();
        }
        System.out.println();
        // 1.5] right angled triangle with vertical side facing to left and base at top
        System.out.println("1.5] right angled triangle with vertical side facing to left and base at top");

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i + 1; k++, System.out.print("*"))
                ;
            System.out.println();
        }

        // 1.6] right angled triangle with vertical side facing to left and base at
        // top(Hollow)
        System.out.println("1.6] right angled triangle with vertical side facing to left and base at top(Hollow)");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++)
                if (j == 1 || j == n - i + 1 || i == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();
        }

        System.out.println();

        // 1.7] right angled triangle with vertical side facing to right and base at top
        System.out.println("1.7] right angled triangle with vertical side facing to right and base at top");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++, System.out.print(" "))
                ;
            for (int k = 1; k <= n - i + 1; k++, System.out.print("*"))
                ;
            System.out.println();
        }

        // 1.8] right angled triangle with vertical side facing to right and base at
        // top(hollow)
        System.out.println("1.8] right angled triangle with vertical side facing to right and base at top(hollow)");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++, System.out.print(" "))
                ;

            for (int k = 1; k <= n - i + 1; k++)
                if (i == 1 || k == 1 || k == n - i + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();
        }
        // 1.9] pyramid
        System.out.println("1.9]  pyramid base at bottom");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++, System.out.print(" "))
                ;
            for (int k = 1; k <= i; k++, System.out.print("* "))
                ;
            System.out.println();
        }

        // 1.10] pyramid
        System.out.println("1.10]  pyramid base at bottom (Hollow)");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++, System.out.print(" "))
                ;

            for (int k = 1; k <= i; k++)
                if (k == 1 || i == n || k == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            System.out.println();
        }

        // 1.11] pyramid base at top
        System.out.println("1.11]  pyramid base at top");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++, System.out.print(" "))
                ;
            for (int j = 1; j <= n - i + 1; j++, System.out.print("* "))
                ;
            System.out.println();
        }

        // 1.12] pyramid base at top (Hollow)
        System.out.println("1.12]  pyramid base at top (Hollow)");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++, System.out.print(" "))
                ;
            for (int k = 1; k <= n - i + 1; k++)
                if (k == 1 || i == 1 || k == n - i + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            System.out.println();
        }

        // 1.13] pyramid base at left
        System.out.println("1.13]  pyramid base at left");

        for (int i = 1, k = 0; i <= n; i++) {

            if (i <= (n / 2) + 1)
                k++;
            else
                k--;

            for (int j = 1; j <= k; j++, System.out.print("*"))
                ;

            System.out.println();

        }

        // 1.14] pyramid base at left (Hollow)
        System.out.println("1.13]  pyramid base at left (Hollow)");
        for (int i = 1, k = 0; i <= n; i++) {

            if (i <= (n / 2) + 1)
                k++;
            else
                k--;

            for (int j = 1; j <= k; j++)
                if (j == 1 || j == k)
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();

        }

        // 1.15] pyramid base at right
        System.out.println("1.15]  pyramid base at right");
        for (int i = 1, k = 0; i <= n; i++) {
            if (i <= (n / 2) + 1)
                k++;
            else
                k--;

            for (int j = 1; j <= n - k; j++, System.out.print(" "))
                ;

            for (int j = 1; j <= k; j++, System.out.print("*"))
                ;
            System.out.println();
        }

        // 1.16] pyramid base at right (Hollow)
        System.out.println("1.16]  pyramid base at right (Hollow)");
        for (int i = 1, k = 0; i <= n; i++) {
            if (i <= (n / 2) + 1)
                k++;
            else
                k--;

            for (int j = 1; j <= n - k; j++, System.out.print(" "));

            for (int j = 1; j <= k; j++)
                if (j == 1 || j == k)
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();

        }

        // 1.17] diamond
        System.out.println("1.17]  diamond");
        for (int i = 1, k = 0; i <= n; i++) {
            if (i <= (n / 2) + 1)
                k++;
            else
                k--;

            for (int j = 1; j <= n - k; j++, System.out.print(" "));
            for (int j = 1; j <= k; j++, System.out.print("* "));

            System.out.println();
        }
  // 1.17] diamond enhanced v2
  System.out.println("1.17]  diamond enhanced v2");
  for (int i = 1, k = 0; i <= n; i++) {
      if (i <= (n / 2) + 1)
          k++;
      else
          k--;

      for (int j = 1; j <= n - k; j++, System.out.print(" "));
      for (int j = 1; j <= k; j++, System.out.print("* "));

      System.out.println();
  }

        // 1.18] diamond
        System.out.println("1.18]  diamond (Hollow)");
        for (int i = 1, k = 0; i <= n; i++) {
            if (i <= (n / 2) + 1)
                k++;
            else
                k--;

            for (int j = 1; j <= n - k; j++, System.out.print(" "))
                ;

            for (int j = 1; j <= k; j++) {
                if (j == 1 || j == k)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // 2]rectangle patterens

        // 2.1] butterfly
        System.out.println("2.1]  Butterfly");
        for (int i = 1, f = 0, b = n; i <= n; i++) {
            if (i <= (n / 2) + 1) {
                f++;
                b--;
            } else {
                f--;
                b++;
            }

            for (int j = 1; j <= n; j++)
                if (j <= f || j > b)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();

        }

        // 2.2] butterfly (Hollow)
        System.out.println("2.2]  Butterfly (Hollow)");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                if (i == j || i + j == n + 1 || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();

        }

        // 2.3] time device
        System.out.println("2.3]  time device");
        for (int i = 1, f = 0, b = n; i <= n; i++) {
            if (i <= (n / 2) + 1) {
                f++;
                b--;
            } else {
                f--;
                b++;
            }

            for (int j = 1; j <= n; j++)
                if (j <= f - 1 || j > b + 1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            System.out.println();

        }

        // 2.4] time device (Hollow)
        System.out.println("2.4]  time device (Hollow)");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                if (i == 1 || i + j == n + 1 || j == i || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();

        }
        System.out.println();

        
    }


    

}

 