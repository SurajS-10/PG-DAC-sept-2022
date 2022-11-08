import java.util.Scanner;
class Sum{
    static int calulate(int arr[], int n, int sum){
        if(n<=0){
            return sum;
        }
        sum += arr[n-1];
        return calulate(arr, n-1, sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers : ");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum : "+calulate(arr , arr.length, 0));
    }
}