import java,util.*;
 

class ArrayListDemo
{
	static void display(ArrayList<String> list)
	{
		for(String s : list)
		{
			System.out.println(s);
		}
	}
	public static void main(String args[])
	{
		ArrayList<String> list1 = new ArrayList <String>();
		list1.add("Suraj");
		list1.addAll("Mayur","Kavita","Mukesh","Suresh");
		
		System.out,println("list1 elements :");
		display(list1);
	}
}