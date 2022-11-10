import java.util.*;
public class CollAssignment7
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
	System.out.println("\nOriginal array list: " + list_Strings);
	System.out.println("\nPrint using index of an element: ");
	int no_of_elements = list_Strings.size();
	for (int index = 0; index < no_of_elements; index++)
	System.out.println(list_Strings.get(index));
	
	}
}