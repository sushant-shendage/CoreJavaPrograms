// package javapgms.patterenPrograms;

public class AllTrianglePatterens  {
    public static void main(String[] args) {
        StarPatterenV1Sp0St1A01RightAngledTrianleVerticalSideFAcingToLeft(7);
        StarPatterenV1Sp0St1A02(7);
        StarPatterenV1Sp1St1A01RightAngledTrianleVerticalSideFAcingToRight(7);
        StarPatterenV1Sp1St2A01(7);
        int n=4;
        for (int i = 1; i <=n; i++) {
            for (int j = n-i; j >0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void StarPatterenV1Sp0St1A01RightAngledTrianleVerticalSideFAcingToLeft(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <=numberOfRows-i; j++) {
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    public static void StarPatterenV1Sp0St1A02(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = numberOfRows-i; j >0; j--) {
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void StarPatterenV1Sp1St1A01RightAngledTrianleVerticalSideFAcingToRight(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <=numberOfRows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void StarPatterenV1Sp1St2A01(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <=numberOfRows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("**");
            }
            System.out.println();
        }
    }

}

 