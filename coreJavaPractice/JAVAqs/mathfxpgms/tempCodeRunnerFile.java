
public class QuadraticEquation {
    public static void main(String[] args) {
        quadraticEq(2, 5, -3);
    }

    static void quadraticEq(int a, int b, int c) {
        int discriminant = b * b - 4 * a * c;
        System.out.println("discriminant :: " + discriminant);
    }

}
