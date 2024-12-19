import java.util.Scanner;
class If_stmt 
{
	public static void main(String[] args) 
	{
		
		boolean booleanVar1;
		Scanner ScanVar=new Scanner(System.in);

		System.out.println("Are you incubation student :");
		booleanVar1=ScanVar.nextBoolean();

		if(booleanVar1==false)
			{
				System.out.println("First pay the fees.");
			}
				
				System.out.println("Attend all classes");

		
	}
}
