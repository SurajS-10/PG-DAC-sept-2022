class Recursion2
{
	static int i=0;
	static int show(int n)
	{
		i++;
		if(n==5)		// base condition or termination condition
			return n;
		else
			return 2*show(n+1);
	}
	public static void main(String args[])
	{
		System.out.println(show(3));
		
	}
}