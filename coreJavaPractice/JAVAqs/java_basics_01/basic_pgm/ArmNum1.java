import java.util.Scanner;
class ArmNum1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int power_val=0;

		System.out.print("Enter any number :");
		int num=sc.nextInt();
		int cnum1,cnum2,armNum=0,cnum1Mod;

		cnum1=num;
		cnum2=num;

		   while(num>0)
			{
			   num/=10;
			   power_val++;
			}
			System.out.println("power value :"+power_val);

						
			 while(cnum1>0)
			{
				 cnum1Mod=cnum1%10;
				 armNum=armNum+(int)(Math.pow(cnum1Mod,power_val));
				 cnum1/=10;
			}
			 System.out.println("Addition :"+armNum);

			 if(armNum==cnum2)
			 {
				System.out.println("Result :"+cnum2+" is a armstrong number.");

			 }
			 else
			 {
				System.out.println("Result :"+cnum2+" is not a armstrong number.");

			 }
		 

	}
}
