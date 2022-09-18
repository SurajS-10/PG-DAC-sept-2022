
class P8
{
	
	public static void main (String args[])
	{
		for(int r=5;r>=1;r--)
			{
			for(int c=1;c<r;c++)
			{
				System.out.print("  ");
			}
			for(int c=r;c<=5;c++)
			{
				System.out.print(" "+c+"  ");
			}	
			System.out.println();	
		}
	}
}