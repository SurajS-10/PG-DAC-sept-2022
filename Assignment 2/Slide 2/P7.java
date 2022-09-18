class P7
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
	
			for(int j=2;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println(" ");			
		}
		
		int i,j;
		for(i=2;i<=5;i++)
		{
			for(j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			for(j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}