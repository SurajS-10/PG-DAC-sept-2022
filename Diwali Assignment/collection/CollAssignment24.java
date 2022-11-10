//24. Write a Java program to check whether a map contains key-value mappings (empty) or not

import java.util.*;
public class CollAssignment24
{	
public static void main(String args[]) {
	HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
	hash_map.put(1, "Red");
	hash_map.put(2, "Green");
	hash_map.put(3, "Black");
	hash_map.put(4, "White");
	hash_map.put(5, "Blue");
  
		boolean result = hash_map.isEmpty();
		System.out.println("Is hash map empty: " + result);
  
		hash_map.clear();
		result = hash_map.isEmpty();
		System.out.println("Is hash map empty: " + result);
	
 }
}
