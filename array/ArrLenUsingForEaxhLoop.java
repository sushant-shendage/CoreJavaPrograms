public class ArrLenUsingForEaxhLoop{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};

        //approch 1
        int count1=0;
        for (int i : arr) {
            count1++;
        }

        System.out.println("count way 1 :"+count1);

        //approch 2
        int count2=0,temp=0;
        try {
            for (int i = 0; ; i++) {
                 temp=arr[i];
                 count2++;
            }
    
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("count way 2 :"+count2);
        }

         //approch 3
         
             System.out.println("count way 3 :"+ arr.length);
         
       
    }
}