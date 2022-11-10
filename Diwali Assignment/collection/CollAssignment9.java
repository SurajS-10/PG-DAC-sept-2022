//8. Write a Java program to append the specified element to the end of a linked list.

import java.util.*;
public class CollAssignment9
{
	public static void main(String args[])
	{
	List<String> list_Strings=new ArrayList<String>();
	list_Strings.add("red");
	list_Strings.add("green");
	list_Strings.add("orange");
	list_Strings.add("blue");
	list_Strings.add("violet");
	System.out.println("list="+list_Strings);
	
	System.out.println(" add the Yellow color after the Red Color: " + list_Strings);
	list_Strings.add(1, "Yellow");
	System.out.println("list="+list_Strings);


	
	}
}