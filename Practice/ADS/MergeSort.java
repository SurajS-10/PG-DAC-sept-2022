import java.util.*;
class MergeSort{
    static void conquer(int arr[], int low, int mid, int high){
        int i1 = low;
        int i2 = mid+1;
        int merged[] = new int[high-low+1];
        int x = 0;
        while(i1 <= mid && i2 <= high){
            if(arr[i1] <= arr[i2]){
                merged[x++] = arr[i1++];
            }
            else{
                merged[x++] = arr[i2++];
            }
        }
        while(i1<=mid){
            merged[x++] = arr[i1++];
        }
        while(i2<=high){
            merged[x++] = arr[i2++];
        }
        int j=low;
        for(int i: merged){
            arr[j++] = i;
        }
    }

    static void divide(int arr[], int low, int high){
        if(low>=high){
            return;
        }
        int mid = low + (high-low)/2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        conquer(arr, low, mid, high);
    }

    static void display(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers : ");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        divide(arr, 0, size-1);
        display(arr);

    }
}