import java.util.Scanner;


class SearchInArray1{
	public static byte check(int n, int[] arr, int x){
		if(n<0){
			return -1;
		}
		if(arr[n]==x){
		return 1;
		}
		return check(n-1,arr,x);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to check available in Array");
		int x = sc.nextInt();
		
		System.out.println("Output : "+check(n-1,arr,x));
	}
}