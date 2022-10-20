class ExceptionDemo
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 0;
		int res = 0;
		int c=5;
		System.out.println("Calculating the result:");
		try
		{
			res = a/b;
			//res = a/c;
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException caught here");
			System.out.println(e.getMessage());
			
		}
		System.out.println("result = " + res); 		//error: res is not initialized
		System.out.println("Program Executed Succesfully!!");
	}
}


/*
op=
1. Error: ArithmeticException as / by zero not allowed
	xception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	at ExceptionDemo.main(ExceptionDemo.java:lineNo)

2. Calculating the result:
   result= 2;
   Program Executed Succesfully!!
   
3. Calculating the result:
   ArithmeticException caught here
   / by zero
   Program Executed Succesfully!! */