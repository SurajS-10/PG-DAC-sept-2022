import java.util.Scanner;

public class BinarySearchDemo{

    public static void main(String[] args){
        int n,i,c=0,item;
        int[] arr;
		int low=0,high=0,mid=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n =sc.nextInt();
        arr = new int[n];
		System.out.println("Enter the elements");
        for(i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        
		System.out.println("Enter the item to find");
        item = sc.nextInt();
		high=(n-1);
		while(low<=high){
			mid=(high+low)/2;
			if(item==arr[mid]){
				c++;break;
			} 
			else if(item<arr[mid]){
				high=(mid-1);
			}
			else if(item>arr[mid]){
				low=(mid+1);
			}
		}
       
        if(c>0){
            System.out.println("Item exist at "+mid+" index of array");
        }
        else {
            System.out.println("Item does not exist");
        }

    }
}