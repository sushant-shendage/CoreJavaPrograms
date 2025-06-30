public class ArrayLengthDriver {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        // array length without using inbuilt method
        System.out.println("length of given array using inbuilt method    : "+arrLength(arr));

        // array length using inbuilt method
        System.out.println("length of given array using userdefined method: "+arr.length);

    }

    static int arrLength(int arr[]) {
        int i = 0;
        try {

            while (true) {
                arr[i] += 0;
                i++;
            }
        } catch (Exception e) {
            return i;
        }

    }
}
