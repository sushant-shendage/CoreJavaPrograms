public class ArrMax_MyApproch {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60, 60, 70, 70, 80, 80, 90, 90, 100, 100 };
        arrMaxEle(a);
    }

    public static void arrMaxEle(int[] arr) {
        int max = -2147483648, smax = -2147483648, tmax = -2147483648, f4max = -2147483648, f5max = -2147483648;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            } 
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max) {
                continue;
            }
            if (arr[i]>smax) {
                smax=arr[i];
            } 
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max || arr[i]==smax ) {
                continue;
            }
            if (arr[i]>tmax) {
                tmax=arr[i];
            } 
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max || arr[i]==smax|| arr[i]==tmax ) {
                continue;
            }
            if (arr[i]>f4max) {
                f4max=arr[i];
            } 
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max || arr[i]==smax|| arr[i]==tmax || arr[i]==f4max ) {
                continue;
            }
            if (arr[i]>f5max) {
                f5max=arr[i];
            } 
        }
        System.out.println("max   : " + max);
        System.out.println("smax  : " + smax);
        System.out.println("tmax  : " + tmax);
        System.out.println("f4max : " + f4max);
        System.out.println("f5max : " + f5max);
    }
    
}
