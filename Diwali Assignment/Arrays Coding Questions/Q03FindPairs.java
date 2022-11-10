public class Q03FindPairs 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[] {2, 7, 5, 4, 3, 9, 15};
       
        int sum = 9;
        
        findPairs(arr, sum);
    }
    
   
    static void findPairs(int inputArray[], int sum) 
    {
        System.out.println("The pairs whose sum are equal to "+ sum+" are : ");
        for (int i = 0; i < inputArray.length; i++) 
        {
            for (int j = i + 1; j < inputArray.length; j++) 
            {
                if (inputArray[i] + inputArray[j] == sum) 
                {
                    System.out.println(inputArray[i] + " " + inputArray[j]);
                }
            }
        }
    }
}