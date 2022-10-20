class Operator
{
	public static void main(String args[])
	{
		int x=5;
		int y=6;
		int z=10;
		//if(x!=y & x<z)		true & true-->true //hey
		//if(x!=y & x>z)		true & false-->false //bye
		//if(x==y & x>z)		 false & false -->false//bye
		//if(x==y & x<z)			false & true -->false//bye
		//if(x!=y | x>z)		true | false-->true//hey
		//if(x!=y | x<z)			true | true-->true//hey
		//if(x==y | x>z)			false | false-->false//bye
		if(x==y | x<z)				//false | true-->true //hey
		{
			System.out.print("hey");
		}
		else
		{
			System.out.print("Bye");
		}
	}
}