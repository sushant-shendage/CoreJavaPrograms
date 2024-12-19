
public class QuadraticEquation {
    public static void main(String[] args) {
        quadraticEq(2, 4, 2);
        quadraticEq(2, 5, -3);
        quadraticEq(9, -12, 20);
    }

    static void quadraticEq(int a, int b, int c) {
        int discriminant = b * b - 4 * a * c;
        int DISCRIMINANT = discriminant;
        if (discriminant < 0) {
            DISCRIMINANT *= -1;
        }
        // System.out.println("discriminant :: " + discriminant);

        double r1n = -b + Math.sqrt(DISCRIMINANT), r1d = 2 * a, r2d = 2 * a, r2n = -b - Math.sqrt(DISCRIMINANT);

        if (discriminant > 0) {
            System.out.printf("%d X^(2) + %d X + (%d) = 0  \n", a, b, c);
            System.out.println("+ve");
            System.out.println("ROOT1: " + r1n + " / " + r1d);
            System.out.println("ROOT2: " + r2n + " / " + r2d);
            System.out.println("----------------");

        } else if (discriminant < 0) {
            System.out.printf("%d X^(2) + %d X + (%d) = 0  \n", a, b, c);
            System.out.println("-ve");
            System.out.println("ROOT1: " + r1n + " / " + r1d + "i");
            System.out.println("ROOT2: " + r2n + " / " + r2d + "i");
            System.out.println("----------------");
        } else {
            System.out.printf("%d X^(2) + %d X + (%d) = 0  \n", a, b, c);
            System.out.println("0");
            System.out.printf("ROOT1/ROOT2:%d/%d ", (-b), 2 * a);
            System.out.println("\n----------------");
        }
    }

}
