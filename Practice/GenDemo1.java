class Gen<T>
{
	T ob;
	Gen(T ob)
	{
		this.ob = ob;
	}
	public void show()
	{
		System.out.println("The Object is: "+ob.getClass().getName());
	}
	
	public T getOb()
	{
		return ob;
	}	
}

class GenDemo1
{
	public static void main(String args[])
	{
		Gen<Integer> g1= new Gen<Integer>(10);
		g1.show();
		System.out.println(g1.getOb());
		
		Gen<Double> g2 = new Gen<Double>(25.20);
		g2.show();
		System.out.println(g2.getOb());
	}
}