class TypeCasting
{
	
		public static void main(String args[])
		{
			int a=5;
			double b=10.00;
			float c =15.00f;
			short d = 12;
			char e = 'A';
			//int result = a + b; //error: incompatible types: possible lossy conversion from double to int
			//int result = (byte)(a + b); 	//15
			//int result = (int)(a + b);		//15
			//int result = a+(int)(b)		// error: cannot find symbol
			//double result = a + b;  //15.00
			
			//int result = a + c; //error: incompatible types: possible lossy conversion from double to float
			//float result = a + c;		//20.0
			//int result = a + b;		//error: incompatible types: possible lossy conversion from double to float
			//double result = c + b;		//25.0
			//int result = (byte)(a + b); 	//15
			//int result = (int)(a + b);
			//short result = (short)e;		//65
			char result = e + d;	//error: incompatible types: possible lossy conversion from int to short
			System.out.println("Sum is = "+result);
		}
} 