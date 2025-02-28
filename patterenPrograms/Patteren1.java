public class Patteren1 {
    public static void main(String[] args) {
        // patt1(7);
        // patt12(7);
        // patt2(7);
        // patt3(7);
        // patt31(7);
        // patt4(7);
        // patt41(7);

        int n=5;

        for (int i = 1,id=0; i <=7; i++) {
            if(i<=n/2+1)
            id++;
            else
            id--;

            for (int k = 1; k <=n-id-n/2; k++) 
            System.out.print(" ");


            for (int j = 1; j <=id; j++) 
                System.out.print("*");
            
            System.out.println();
        }

    }

    static void patt1(int n) {

        if (n % 2 == 0)
            n = n + 1;

        System.out.println(n);

        for (int i = 1, id = 0; i <= n; i++) {
            if (i <= n / 2 + 1)
                id++;
            else
                id--;

            for (int j = 1; j <= id; j++)
                System.out.print("*");

            System.out.println();

        }
    }

    static void patt12(int n) {

        if (n % 2 == 0)
            n = n + 1;

        System.out.println(n);

        for (int i = 1, id = 0; i <= n; i++) {
            if (i <= n / 2 + 1)
                id++;
            else
                id--;

            for (int j = 1; j <= id; j++)
                if (j == 1 || j == id)
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();

        }
    }

    static void patt2(int n) {

        if (n % 2 == 0)
            n = n + 1;

        System.out.println(n);

        for (int i = 1, id = 0; i <= n; i++) {
            if (i <= n / 2 + 1)
                id++;
            else
                id--;

            for (int j = 1; j <= id; j++)
                System.out.print("* ");

            System.out.println();

        }
    }

    static void patt3(int n) {

        if (n % 2 == 0)
            n = n + 1;

        System.out.println(n);

        for (int i = 1, id = 0; i <= n; i++) {
            if (i <= n / 2 + 1)
                id++;
            else
                id--;

            for (int j = 1; j <= n - id - (n / 2); j++)
                System.out.print(" ");

            for (int j = 1; j <= id; j++)
                System.out.print("*");

            System.out.println();

        }
    }

    static void patt31(int n) {

        if (n % 2 == 0)
            n = n + 1;

        System.out.println(n);

        for (int i = 1, id = 0; i <= n; i++) {
            if (i <= n / 2 + 1)
                id++;
            else
                id--;

            for (int j = 1; j <= n - id - (n / 2); j++)
                System.out.print(" ");

            for (int j = 1; j <= id; j++)
                if (j == 1 || j == id)
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();

        }
    }

    static void patt4(int n) {

        if (n % 2 == 0)
            n = n + 1;

        System.out.println(n);

        for (int i = 1, id = 0; i <= n; i++) {
            if (i <= n / 2 + 1)
                id++;
            else
                id--;

            for (int j = 1; j <= n - id - (n / 2); j++)
                System.out.print(" ");

            for (int j = 1; j <= id; j++)
                System.out.print("* ");

            System.out.println();

        }
    }

    static void patt41(int n) {

        if (n % 2 == 0)
            n = n + 1;

        System.out.println(n);

        for (int i = 1, id = 0; i <= n; i++) {
            if (i <= n / 2 + 1)
                id++;
            else
                id--;

            for (int j = 1; j <= n - id - (n / 2); j++)
                System.out.print(" ");

            for (int j = 1; j <= id; j++)
                if (j == 1 || j == id)
                    System.out.print(" *");
                else
                    System.out.print("  ");

            System.out.println();

        }
    }

    static void pattn(int n) {

        if (n % 2 == 0)
            n = n + 1;

        System.out.println(n);

        for (int i = 1, id = 0; i <= n; i++) {
            if (i <= n / 2 + 1)
                id++;
            else
                id--;

            for (int j = 1; j < n - id - (n / 2 - 1); j++)
                System.out.print("-");

            for (int j = 1; j <= id; j++)
                if (j == 1 || j == id)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            System.out.println();

        }
    }

}