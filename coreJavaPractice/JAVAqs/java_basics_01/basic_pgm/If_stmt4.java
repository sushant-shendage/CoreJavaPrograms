import java.util.Scanner;
class If_stmt4

{
	public static void main(String[] args) 
	{
		
		boolean booleanVar1;
		Scanner ScanVar=new Scanner(System.in);

		System.out.println(" Are you user with premium account:");
		booleanVar1=ScanVar.nextBoolean();

		if(booleanVar1)
			{
			 System.out.println("Get additional discount 10 %in addition to current discount");
			}
				
				
				System.out.println("Pay the charges and get the delivery");

		
	}
}
