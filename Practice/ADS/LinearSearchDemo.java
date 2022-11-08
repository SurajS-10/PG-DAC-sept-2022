import java.util.Scanner;

public class LinearSearchDemo{

    public static void main(String[] args){
        int n,i,c=0,item;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n =sc.nextInt();
        arr = new int[n];
		System.out.println("Enter the elements");
        for(i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        
		System.out.println("Enter the item to find");
        item = sc.nextInt();

        for(i=0;i<arr.length;i++){
            if(arr[i]==item){
                c++;
                break;
            }
        }
        if(c>0){
            System.out.println("Item exist at "+i+" index of array");
        }
        else {
            System.out.println("Item does not exist");
        }

    }
}