public class BinarySearch {
    public static void main(String[] args) {
        int a[] = { 11, 2, 3, 4,66, 5, 6, 7, 8, 9 };
        int searchElement = 99;

        int start = 0, end = a.length - 1, mid;

        for (; start <= end;) {
            mid = (start + end) / 2;
            if (a[start] == searchElement || a[mid] == searchElement || a[end] == searchElement) {
                if (a[mid] == searchElement) {
                    System.out.printf("mf index : %d", mid);
                    return;
                } else if (a[start] == searchElement) {
                    System.out.printf("sf index : %d", start);
                    return;
                } else {
                    System.out.printf("ef index : %d", end);
                    return;
                }

            } else if (start <= end) {
                if (searchElement > mid) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }  
        }

        System.out.println("Element not found...!");

    }
}
