import java.util.Scanner
class ScanDetails
{
	public static void main(String[] args) 
	{
		Scanner ScanVar=new Scanner(System.in);

		String name ;
		String city;
		String email;
		String job;
		byte age;
		long pincode;
		

		 name=ScanVar.next();
		System.out.println("Enter city :");
		 city=ScanVar.next();
		System.out.println("Enter EmailId:");
		 email=ScanVar.next();
		System.out.println("Enter Age :");
		 age=ScanVar.nextByte();

		 System.out.println("Enter job :");
		 job=ScanVar.next();

		System.out.println("Enter city pincode :");
		 pincode=ScanVar.nextLong();

/*System.out.print("Enter the byte-integer number :");
		byte byteVar=ScanVar.nextByte();*/

		
		
		
		
		

		System.out.println("Entered Age      :");
		System.out.println("Entered city     :");
		System.out.println("Entered job     :");
		System.out.println("Entered pincode  :");
		System.out.println("Entered EmailId  :");


	}
}
