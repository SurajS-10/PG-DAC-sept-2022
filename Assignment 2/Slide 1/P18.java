class P18
{
	public static void main(String args[])
	{
		int i,j;
		int c=64;
		for (i=1;i<=5;i++)
		{
			for (j=1;j<=(6-i);j++)
			{
				System.out.print((char)(c+j)+" ");
			}
			System.out.println(" ");
		}
	
	}

} 