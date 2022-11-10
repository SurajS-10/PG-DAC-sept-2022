import java.util.*;
public class CollAssignment4
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
	
	Collections.sort(list_Strings);
	System.out.println("List after sort: "+list_Strings);  
	
	
	}
}