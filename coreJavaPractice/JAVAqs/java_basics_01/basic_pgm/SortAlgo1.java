class SortAlgo1
{
    public static void main(String[] args)
    {
        int exit=45,temp1,count,arr[]={93,59,48,0,7,4,7,2,76,55}; //limit :0-9 77,9,67,48,57,94,21,7,22,20

		for (int i=0; i<10;i++ )
		{
			System.out.print(arr[i]+",");
		}


while(exit>0)
	{
		count=0;
		for (int i=0; i<9;i++ )
		{
			if(arr[i]>arr[i+1])
			{
				temp1=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp1;
				System.out.println("swapped");
				count++;
			}
			System.out.println("\n");
			for (int j=0; j<10;j++ )
			{
			System.out.print(arr[j]+",");
			}

		}
			System.out.println("\nswap count:"+count);
			System.out.println("\n");
			 
			 exit=count;	  
	}	
			
			
			
			
			for (int j=0; j<10;j++ )
		{
			System.out.print(arr[j]+",");
		}

	}


		

			

		
}

