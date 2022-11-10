//17. Write a Java program to convert a hash set to an array.


import java.util.*;
public class CollAssignment17
{
	public static void main(String args[])
	{
	HashSet<String> h_set=new HashSet<String>();
	h_set.add("red");
	h_set.add("green");
	h_set.add("yellow");
	h_set.add("blue");
	h_set.add("violet");
	 
	System.out.println("Original Hash Set: " + h_set);
    String[] new_array = new String[h_set.size()];
    h_set.toArray(new_array);
 
    // Displaying Array elements
    System.out.println("Array elements: ");
    for(String element : new_array){
    System.out.println(element);
     }
	
	}
}
