//12. Write a Java program to check if a particular element exists in a linked list.
import java.util.*;
public class CollAssignment12
{
	public static void main(String args[])
	{
	LinkedList<String> l_list=new LinkedList<String>();
	l_list.add("red");
	l_list.add("green");
	l_list.add("yellow");
	l_list.add("blue");
	l_list.add("violet");
	System.out.println(l_list);
	
	if (l_list.contains("Green")) {
       System.out.println("Color Green is present in the linked list.");
    }
	else 
	{
       System.out.println("Color Green is not present in the linked list.");
    }
    
    if (l_list.contains("Orange")) 
	{
       System.out.println("Color Orange is present in the linked list.");
    } 
	else 
	{
       System.out.println("Color Orange is not present in the linked list.");
	}
	
	}
}
