import java.util.Scanner;

class SearchInArray2{
	public static int search(int[] arr,int x,int n,int y){
		if(n >=arr.length){
			return y;
		}
		if(arr[n] == x){
			y=n;
		}
		return search(arr,x,n+1,y);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of elements to enter");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to check in Array");
		int x = sc.nextInt();
		
		System.out.println("Output : ");
		System.out.println (search(arr, x, 0, -1));
	}
}