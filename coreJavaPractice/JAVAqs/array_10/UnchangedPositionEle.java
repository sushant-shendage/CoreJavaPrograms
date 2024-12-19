public class UnchangedPositionEle {
    public static void main(String[] args) {
        int[] a = { 1, 2,6,3,4,5,6,2,1 };
        int count = 0;

         for (int i = 0; i < (a.length/2); i++) {

            if (a[i]==a[a.length-i-1]) {
                System.out.println(a[i]);
                count++;
            }
            
         }
         System.out.println("Above "+count+" elements remain same position even we reverse array");
    }

}
