import java.util.*;
class QuickSort{
    static int partition(int arr[], int start, int end){
        int breakPoint = arr[end];
        int i = start-1;
        for(int j = start; j < end; j++){
            if(arr[j]< breakPoint){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }

    static void quickSorting(int arr[], int start, int end){
        if(start<end){
            int breakPoint = partition(arr, start, end);

            quickSorting(arr, start , breakPoint-1);
            quickSorting(arr, breakPoint+1, end);
        }
        
    }

    static void display(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers : ");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        quickSorting(arr, 0, size-1);
        display(arr);

    }
}