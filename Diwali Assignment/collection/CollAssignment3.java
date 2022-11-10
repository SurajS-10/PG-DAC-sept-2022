//3. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.*;
public class CollAssignment3
{
	public static void main(String args[])
	{
	List<String> list_Strings=new ArrayList<String>();
	list_Strings.add("red");
	list_Strings.add("green");
	list_Strings.add("yellow");
	list_Strings.add("blue");
	list_Strings.add("violet");
	System.out.println(list_Strings);
	
	list_Strings.add(0, "Pink");
	list_Strings.add(5, "orange");
	
	System.out.println(list_Strings);
	
	String element = list_Strings.get(0);
	System.out.println("First element: "+element);
	element = list_Strings.get(2);
	System.out.println("Third element: "+element);
	
	}
}