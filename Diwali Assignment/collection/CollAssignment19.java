//19. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.

import java.util.*;
public class CollAssignment19
{
	public static void main(String args[])
	{
	TreeSet<String> tree_set=new TreeSet<String>();
	tree_set.add("red");
	tree_set.add("green");
	tree_set.add("yellow");
	tree_set.add("blue");
	tree_set.add("violet");
	System.out.println("Tree set:- "+tree_set);
	
	}
}