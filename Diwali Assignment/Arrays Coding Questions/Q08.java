
public class Q08 {
     
    // Function that return average of an array.
    static  void average(int a[], int n)
    {
    	int sum = 0;
    	double avg;
    	 
    	for ( int j = 0 ; j < a.length-2 ; j++) {
    		for (int i = j; i < 3; i++) {
    			sum += a[i];
    			
        	}
    		avg = sum / 3;
    		System.out.println(avg+" ");
    	}
        return ;
    }
     
    //driver code
    public static void main (String[] args)
    {
         
        int arr[] = {5,14,35,89,140};
        int n = arr.length;
     
        average(arr, n);
    }
}
