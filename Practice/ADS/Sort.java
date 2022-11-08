MIDQUIZ scheduled tomorrow at 9.00am and syllabus for Midquiz will be  
Introduction to DS its types, Algorithm, Time and Space Complexity, 
Searching & its Techniques, Sorting & types of it

class Sort{
	public static void heapSort(int[] arr){
		int len = arr.length-1;
		
		for (int i = len/2-1; i >=0; i--)
			heapify(arr, len, i);
		
		for (int i = len ; i > 0; i--){
			int temp= arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, i , 0);
		}
	}
	public static void heapify(int[] arr, int len, int i){
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		if (left < len && arr[left] > arr[largest])
			largest = left;
		if (left < len && arr[right] > arr[largest])
			largest = right;
		
		if (largest != i){
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			
			heapify(arr, len, largest);
		}
	}
//===================================================================================
	public static void merg(int[] arr, int left, int mid, int right){
		int size1 = mid - left + 1;
		int size2 = right - mid;
		
		int[] leftSubarray = new int[size1];
		int[] rightSubarray = new int[size2];
		
		for (int i = 0; i < size1; i++)
			leftSubarray[i] = arr [left + i];
		
		for (int j = 0; j < size2; j++)
			rightSubarray[j] = arr[mid + 1 + j];
		
		int i=0, j=0, k=left;
		while( i < size1 && j < size2){
			if (leftSubarray[i] <= rightSubarray [j]){
				arr[k] = leftSubarray[i];
				i++;
			}
			else{
				arr[k] = rightSubarray[j];
				j++;
			}
			k++;
		}
		
		while(i < size1){
			arr[k] = leftSubarray[i];
			i++;
			k++;
		}
		while(i < size2){
			arr[k] = rightSubarray[j];
			j++;
			k++;
		}
		
		
	}
	public static void mergSort(int[] arr,int left, int right){
		if(left < right){
			int mid =left+(right - left)/2;
			//breakdown
			mergSort(arr, left, mid);//for left side
			mergSort(arr, mid+1, right);//for right side
			//sent to sort & merg
			merg(arr , left, mid, right);
		}
		
	}
//================================================================================	
	public static void quickSort(int[] arr, int low, int high){
		//unstable sort
		if(low < high){
			int pIndex = partition(arr, low ,high);
			
			quickSort(arr, low , pIndex-1);
			quickSort(arr, pIndex+1, high);
		}
	}
	public static int partition(int[] arr, int low, int high){
		int pivote = arr[high];
		int i = low-1;
		
		for(int j = low; j < high; j++){
			if (arr[j] < pivote){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
//===================================================================================
	public static void insertionSort(int[] arr){
		int len = arr.length;
		for (int i = 1 ; i < len; ++i){
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
//=================================================================================	
	public static void selectionSort(int[] arr){
		//ubstable sort
		int len = arr.length;
		for (int i = 0 ; i < len-1; i++){
			for (int j = i+1; j < len-1; j++){
				if (arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
//===================================================================================
	public static void bubbleSort(int[] arr){
		int len = arr.length;
		for (int i = 0 ; i < len-1; i++){
			for (int j = 0; j < len-i-1; j++){
				if (arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
//==================================================================================
	public static void display(int[] arr){
		for (int x : arr)
			System.out.print(x+" ");
		
		System.out.println();
	}
//==================================================================================
	public static void main(String[] args){
		int[] arr = new int[]{2,5,9,7,4,3,6,8};
		System.out.println("BEFORE : ");
		display(arr);
		//bubbleSort(arr);
		//selectionSort(arr);
		//insertionSort(arr);
		//mergSort(arr, 0, arr.length-1);
		//quickSort(arr, 0, arr.length-1);
		heapSort(arr);
		System.out.println("AFTER : ");
		display(arr);
	}
}