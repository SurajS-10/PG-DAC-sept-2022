class ExceptionDemo1
{
	public static void main(String args[])
	{
		System.out.println("Calculating the result");
		int a[]={4,9,1,5,2};
		try
		{
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException successfilly evaluated");
			System.out.println(e.getMessage());
		}
		System.out.println("Program execution completed");
	}
}

/*
O/p:-
Calculating the result
ArrayIndexOutOfBoundsException successfilly evaluated
5
Program execution completed
*/