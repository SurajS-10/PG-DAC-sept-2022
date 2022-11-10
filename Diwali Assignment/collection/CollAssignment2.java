//2. Write a Java program to insert an element into the array list at the first position.

import java.util.*;
public class CollAssignment2
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
	}
}