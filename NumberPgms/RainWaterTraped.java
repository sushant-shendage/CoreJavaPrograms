import java.util.Arrays;

public class RainWaterTraped {
public static void main(String[] args) {
    int arr[]={3,1,2,4,0,1,3,2};
    System.out.println(Arrays.toString(arr));

    int leftArr[]=new int[arr.length],rightArr[]=new int[arr.length];

    int max=arr[0];
    for (int i = 0; i < rightArr.length; i++) {
        if(arr[i]>max){
            rightArr[i]=arr[i];
            max=arr[i];
        }else{
            rightArr[i]=max;
        }
    }
    System.out.println(Arrays.toString(rightArr));
    max=arr[arr.length-1];

     for (int i = leftArr.length-1; i >= 0; i--) {
        if(arr[i]>max){
            max=arr[i];
            leftArr[i]=arr[i];
        }else{
            leftArr[i]=max;
        }
    }
    System.out.println(Arrays.toString(leftArr));

    int min=0,trapedWater=0;

    for (int i = 0; i < rightArr.length; i++) {
        if(leftArr[i]<rightArr[i]){
            min=leftArr[i];
        }else{
            min=rightArr[i];
        }

        trapedWater+=min-arr[i];

    }

    System.out.println("traped water : "+trapedWater);

}
}
