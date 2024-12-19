class TypeCastingLong
{
	public static void main(String[] args) 
	{
		long longvar=12345678;
		
		byte bytevar;
		//bytevar=longvar;
		/*incompatible types: possible lossy conversion from long to byte*/
		  
		short shortvar;
		//shortvar=longvar;
		/*incompatible types: 
		possible lossy conversion from long to short*/
		 

		int intvar;
		//intvar=longvar;
		/* incompatible types: possible lossy conversion from long to int*/

		float floatvar;
		floatvar=longvar;

		double doublevar;
		doublevar=longvar;

		char charvar;
		//charvar=longvar;
		/* incompatible types: possible lossy conversion from long to char*/
	 

		boolean booleanvar;
		
		// booleanvar=longchar;
		  /*incompatible types: int cannot be converted to boolean*/

		System.out.println("long variable      : "+longvar);
		//System.out.println("long in byte       : "+bytevar);//CTE
		//System.out.println("long in short        : "+shortvar);//CTE
		//System.out.println("long in int       : "+intgvar);//CTE
		System.out.println("long in float      : "+floatvar);
		
		System.out.println("long in double     : "+doublevar);
		//System.out.println("long in char     : "+charvar); //CTE
		//System.out.println("long in boolean  : "+booleanvar);//CTE*/
		
	}
}
