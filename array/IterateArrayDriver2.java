public class IterateArrayDriver2 {
    public static void main(String[] args) {
        int arr[] = { 51, 42, 33, 24, 15 };

        System.out.println(" iterating array using for loop ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
        System.out.println("----------------------------------");

        
        System.out.println(" iterating array using for-each loop ");
        for (int i : arr) {
            System.out.println("arr[] : " + i);
        }
        System.out.println("----------------------------------");

       
        String str = "aswellas";
        System.out.println(" iterating string using for loop ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("string char : " + str.charAt(i));
        }
        System.out.println("----------------------------------");



        System.out.println(" iterating string using for-each loop ");

        for (char c : str.toCharArray()) {
            System.out.println("string char : " + c);
        }
        System.out.println("----------------------------------");


    }
}
