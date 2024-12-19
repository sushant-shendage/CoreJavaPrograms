
 
class ArithmeticDtypeCombi
{
	public static void main(String[] args) 
	{
		

		//variable initilisation and declaration in different datatypes
		byte  var1=34,  var2=23;
		short var3=34,  var4=23;
		int   var5=45,  var6=45;
		long  var7=54l, var8=89;

		float  var9=45.67f,  var10=56.34f;
		double var11=46.565, var12=67.898;

		char var13='A', var14='a';

		boolean var15=true, var16=false;
		
		System.out.println("Addition:--------------------------------------");
		System.out.println("Byte+Byte   : "+((Object)(var1+var2)).getClass().getSimpleName());
		System.out.println("short+short : "+((Object)(var3+var4)).getClass().getSimpleName());
		System.out.println("int+int     : "+((Object)(var5+var6)).getClass().getSimpleName());
		System.out.println("long+long   : "+((Object)(var7+var8)).getClass().getSimpleName());

		System.out.println("subtraction:--------------------------------------");
		System.out.println("Byte-Byte   : "+((Object)(var1-var2)).getClass().getSimpleName());
		System.out.println("short-short : "+((Object)(var3-var4)).getClass().getSimpleName());
		System.out.println("int-int     : "+((Object)(var5-var6)).getClass().getSimpleName());
		System.out.println("long-long   : "+((Object)(var7-var8)).getClass().getSimpleName());

		System.out.println("Multi:--------------------------------------");
		System.out.println("Byte*Byte   : "+((Object)(var1*var2)).getClass().getSimpleName());
		System.out.println("short*short : "+((Object)(var3*var4)).getClass().getSimpleName());
		System.out.println("int*int     : "+((Object)(var5*var6)).getClass().getSimpleName());
		System.out.println("long*long   : "+((Object)(var7*var8)).getClass().getSimpleName());
		
		System.out.println("Division:--------------------------------------");
		System.out.println("Byte/Byte   : "+((Object)(var1/var2)).getClass().getSimpleName());
		System.out.println("short/short : "+((Object)(var3/var4)).getClass().getSimpleName());
		System.out.println("int/int     : "+((Object)(var5/var6)).getClass().getSimpleName());
		System.out.println("long/long   : "+((Object)(var7/var8)).getClass().getSimpleName());




	}
}
