class DigitExtract01_01
{
    public static void main (String[] args)
{
    int num=12345;

    //digit extraction and printing code
    for(int i=num;i!=0;i/=10)
    {
        System.out.println(i%10+",");
    }
} 
}