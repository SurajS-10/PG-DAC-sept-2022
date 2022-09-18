class P13
{
	public static void main(String args[])
	{
		int c=64;
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(c+i)+" ");
			}
		System.out.println(" ");
		}
	}
}