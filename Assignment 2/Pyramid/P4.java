class P4
{
	public static void main(String args[])
	{
		for(int i=0;i<=9;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1;j>0;j--)
			{
				System.out.print(j+" ");
			}
		System.out.println(" ");	
		}
	}
}