// 11
import java.util.*;
public class CollAssignment11
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
	
	System.out.println("Original linked list:" + l_list);  
	for(int p=0; p < l_list.size(); p++)
	{
      System.out.println("Element at index "+p+": "+l_list.get(p));
    }  
	
	}
}
