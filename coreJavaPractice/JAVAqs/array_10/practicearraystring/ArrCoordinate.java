public class ArrCoordinate {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        arrCoordinate(a);
    }
    static void arrCoordinate(int arr[])
    {
        for (int i = 0; i <= arr.length/2; i++) {
            System.out.printf("(%d,%d)\n",arr[i],arr[arr.length-1-i]);
        }
    }
}
