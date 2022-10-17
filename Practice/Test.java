class Gen<T>
{
	T ob;
	Gen(T ob)
	{
		this.ob = ob;
	}
	public void Show()
	{
		System.out.println("The type of Ob :"+ob.getClass().getName());
	}
	public T getOb()
	{
		return ob;
	}
}

class Test
{
	public static void main(String args[])
	{
		Gen<String> g1 = new Gen<String>("Suraj");
		g1.Show();
		System.out.println(g1.getOb());
	}
}