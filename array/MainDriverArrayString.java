public class MainDriverArrayString {
    public static void main(String[] args) {
        
    }
   public void waysToDeclareArray(){
         int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        
    }

       public static void sortArray(int arr[]) {
        int temp;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
