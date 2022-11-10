//14. Write a Java program to replace an element in a linked list.

import java.util.*;
public class CollAssignment14
{
	public static void main(String args[])
	{
	LinkedList<String> l_list1=new LinkedList<String>();
	l_list1.add("red");
	l_list1.add("green");
	l_list1.add("yellow");
	l_list1.add("blue");
	l_list1.add("violet");
	
	 System.out.println("Original linked list: " + l_list1);
	// Replacing 2nd element with new value
    l_list1.set(1, "Orange");
    System.out.println("The value of second element changed.");
        System.out.println("New linked list: " + l_list1);
	
	}
}
