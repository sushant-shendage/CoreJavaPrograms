import java.util.Scanner;
class If_stmt5

{
	public static void main(String[] args) 
	{
		
		boolean booleanVar1,booleanVar2;
		Scanner ScanVar=new Scanner(System.in);

		System.out.println(" Is your shoping amt more than 5000:");
		booleanVar1=ScanVar.nextBoolean();

		System.out.println(" Is your shoping amt more than 10000:");
		booleanVar2=ScanVar.nextBoolean();
		

		if(booleanVar1==true && booleanVar2==false)
			{
			System.out.println("Get  5 % discount on shopping ");
			}

			if(booleanVar2==true && booleanVar2==true)
			{
			 System.out.println("Get  10 % discount on shopping ");
			}
			 
			System.out.println("Pay the bill");
	}
}
 