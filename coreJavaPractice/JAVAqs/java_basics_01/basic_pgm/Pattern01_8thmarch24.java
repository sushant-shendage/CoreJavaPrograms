import java.util.Scanner;
class Pattern01_8thmarch24 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number :");
		int n=sc.nextInt();


		 for (int i=0;i<=n ;i++ )
		 {
			 for (int j=0;j<=n ;j++ )
			{
				System.out.print("* ");
			}
				System.out.println("");
		 }
	}
}
