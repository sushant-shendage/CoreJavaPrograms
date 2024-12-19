import java.util.Scanner;
class If_stmt3

{
	public static void main(String[] args) 
	{
		
		boolean booleanVar1;
		Scanner ScanVar=new Scanner(System.in);

		System.out.println("Have you passed in  exam A :");
		booleanVar1=ScanVar.nextBoolean();

		if(booleanVar1==false)
			{
			 System.out.println("First pass exam A");
			}
				
				
				System.out.println("Appear for exam B");

		
	}
}
