import java.util.Arrays;

public class ArrEleInsert {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 9, 10 };
        
        System.out.println(Arrays.toString(arr));

        arr=arrAddEle(arr, 3,5);
        System.out.println(Arrays.toString(arr));

        arr=arrAddEle(arr, 3,5);
        System.out.println(Arrays.toString(arr));

        // arr=arrDleEle(arr, 3,1);
        // System.out.println(Arrays.toString(arr));
    }

    static int[] arrAddEle(int arr[], int index,int totalEle) {
        System.out.printf("%d elements added \n",totalEle);
        int modifyArr[]=new int[arr.length+totalEle];
        for (int i = 0,j=0; i < modifyArr.length; i++) {
            if(i<index || i>=index+totalEle){

                modifyArr[i]=arr[j];
                j++;
            }
        }
        //System.out.println(Arrays.toString(modifyArr));
        return modifyArr;
    }

    static int[] arrDleEle(int arr[], int index,int totalEle) {
        System.out.printf("%d elements deleted \n",totalEle);
        int modifyArr[]=new int[arr.length-totalEle];
        for (int i = 0,j=0; i < modifyArr.length; i++) {
            if(i<index ){

                modifyArr[j]=arr[i];
                j++;
                System.out.println(Arrays.toString(modifyArr));
            }
            else if (i>=index+totalEle) 
            {
                
            }
            
        }
        //System.out.println(Arrays.toString(modifyArr));
        return modifyArr;
    }
}
