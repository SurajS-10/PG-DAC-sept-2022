class P9
{
	public static void main(String args[])
	{
		int i,j;
		int c=64;
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for (j=1;j<=i;j++)
			{
				System.out.print((char)(c+j)+" ");
			}
		System.out.println(" ");	
		}
	
	}
}