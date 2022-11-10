//21. Write a Java program to remove all the elements from a priority queue.
import java.util.*;
public class CollAssignment21
{
	public static void main(String args[])
	{
	PriorityQueue<String> pq = new PriorityQueue<String>();
	pq.add("red");
	pq.add("green");
	pq.add("yellow");
	pq.add("white");
	pq.add("blue");
	System.out.println(" Priority Queue: "+pq);
   
	// Removing all the elements from the Priority Queue
	
    pq.clear();
	System.out.println("The New Priority Queue: " + pq);
	
	}
}