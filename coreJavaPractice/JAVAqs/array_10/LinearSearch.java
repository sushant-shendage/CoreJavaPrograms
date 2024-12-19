public class LinearSearch {
    public static void main(String[] args) {
        int a[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        int searchElement = 12;

        for (int i = 0; i < a.length; i++) {
            if (searchElement == a[i]) {
                System.out.printf("%d element found at %d index within range 1 to %d.", a[i], i + 1, a.length);
                return;
            }
           
        }

        
                System.out.println("Element not found...!");
           return;
    }

}
