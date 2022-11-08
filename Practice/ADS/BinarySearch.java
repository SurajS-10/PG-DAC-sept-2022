import java.util.Scanner;

public class BinarySearch{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int mid=0,high=0,low,c=0;
		low=0;
		high=(arr.length-1);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element to be find");
		int item=sc.nextInt();
		while(low<=high){
			mid=((low+high)/2);
			if(item == arr[mid]){
				c++;
				break;
			}else if(item<arr[mid]){
				low=mid+1;
			}else if(item>arr[mid]){
				high=mid-1;
			}
			
		}
		if(c>0){
			System.out.println("Item exist at "+mid+"index of array");
			}
			else
			{
			System.out.println("Item does not exist ");
			}
	}
	
	
}