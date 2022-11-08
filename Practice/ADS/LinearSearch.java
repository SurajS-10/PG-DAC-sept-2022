import java.util.Scanner;

class LinearSearch{
	public static void main(String[] args){
		int c=0,i;
		int[] arr={51,2,34,15,99,76,82,60,22,45};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the item to find");
		int item=sc.nextInt();
		for(i=0;i<arr.length;i++){
			if(arr[i] == item){
				c++;
				break;
			}
		}
		
		if(c>0)
		  System.out.println("Item exist in array "+i+" index");
        
        else 
            System.out.println("Item does not exist");
   
	}
}