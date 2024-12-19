public class MaxEleArr_4_july_24 {
    public static void main(String[] args) {
        int[]a={1,2,3};
 
        System.out.println("Max         : "+ArrMaxEle(a));
        System.out.println("Min         : "+ArrMinEle(a));
        System.out.println("Sum         : "+ArrSumEle(a));
        System.out.println("Sum+ve      : "+ArrSumPosiEle(a));
        System.out.println("Sum-ve      : "+ArrSumNegeEle(a));
        System.out.println("Average arr : "+ArrAvgEle(a));
    }

    public static int ArrMaxEle(int[]arr)
    {
         
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
                return max;
    }
    public static int ArrMinEle(int[]arr)
    {
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min)
            {
            min=arr[i];
            }
        }
                return min;
    }

    public static int ArrSumEle(int[]arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
                return sum;
    }
    public static int ArrSumPosiEle(int[]arr)
    {
        int psum=0;
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i]>0) {
                psum+=arr[i]; 
            }
        }
            return psum;
    }
    public static int ArrSumNegeEle(int[]arr)
    {
        int nsum=0;
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i]<0) {
                nsum+=arr[i]; 
            }
        }
                return nsum;
    }

    public static float ArrAvgEle(int[]arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
                return (float)sum/arr.length;
    }

    //arrRepeated
    //arrNrepeated
}
