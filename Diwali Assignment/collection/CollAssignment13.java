//13. Write a Java program to compare two linked lists.

import java.util.*;
public class CollAssignment13
{
	public static void main(String args[])
	{
	LinkedList<String> l_list1=new LinkedList<String>();
	l_list1.add("red");
	l_list1.add("green");
	l_list1.add("yellow");
	l_list1.add("blue");
	l_list1.add("violet");
	
	LinkedList<String> l_list2=new LinkedList<String>();
	l_list2.add("red");
	l_list2.add("green");
	l_list2.add("yellow");
	l_list2.add("orange");
	l_list2.add("white");
	
	LinkedList<String> l_list3 = new LinkedList<String>();
    for (String e : l_list1)
        l_list3.add(l_list2.contains(e) ? "Yes" : "No");
        System.out.println(l_list3);         
     
	
	}
}
