
public class PrintNnumsUsingRecursion 
{
    public static void main(String[] args) 
    {
        recPrint(2,4);
    }
     static void recPrint(int num1,int num2)
    {
       if (num1<=num2) {
        System.out.println(num1);
        num1++;
        recPrint(num1,num2);
       }
       else
       {
        return;
       }
    }
    
}
