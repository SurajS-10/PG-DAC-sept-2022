import java.util.Scanner;

class RemoveEvenIntegerFromArray{
	public static int scan(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		}
	}
	
	/*public static void printDetails(int[] arr){
		//int n=arr.length;
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
		System.out.println();
	}*/
	
	public static void main(String[] args){
		scan();
		
	
}