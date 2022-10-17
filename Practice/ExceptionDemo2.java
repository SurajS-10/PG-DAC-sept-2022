class ExceptionDemo2
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 0;
		int res = 0;
		int arr[]={4,2,1,7,5};
		System.out.println("Calculating the result:");
		try
		{
			res = a/b;
			System.out.println(arr[6]);
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException caught here");
			System.out.println(e.getMessage());	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException successfilly evaluated"+e.getMessage());
			//System.out.println(e.getMessage());
		}
		System.out.println("result = " +res); 		//error: res is not initialized
		System.out.println("Program Executed Succesfully!!");
	}
}