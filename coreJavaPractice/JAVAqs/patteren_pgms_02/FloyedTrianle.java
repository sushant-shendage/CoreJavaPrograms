public class FloyedTrianle {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1, k = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
