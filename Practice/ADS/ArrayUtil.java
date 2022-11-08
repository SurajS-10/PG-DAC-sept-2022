import java.util.*;

public class ArrayUtil	
{
	public void printArray(int[] arr)
	{
		for(int i =0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void arrayDemo()
	{
		int[] arr =new int[5];
		printArray(arr); // 0 0 0 0 0
		arr[0]=5;
		arr[1]=2;
		arr[2]=4;
		arr[3]=45;
		arr[4]=10;
		printArray(arr);
		System.out.println(arr.length);
		System.out.println(arr[arr.length-1]);//accessing element at last index
	}
	public static void main(String[] args){
		ArrayUtil a1 = new ArrayUtil();
		
		a1.arrayDemo();
		
	} 
} 
/*
==============================================================

public class ArrayUtil
{
	public static void printDisplay(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int[] arr = new int[5];
		printDisplay(arr);
		
	}
}
*/