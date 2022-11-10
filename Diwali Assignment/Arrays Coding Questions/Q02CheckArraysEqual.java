import java.util.Arrays;

public class Q02CheckArraysEqual {
    public static void main(String[] args)
    {
      
        int a[] = { 30, 25, 40 };
  
       
        int b[] = { 30, 25, 40 };
  
      
        boolean result = Arrays.equals(a, b);
  
      
        if (result == true) {
            
            System.out.println("Two arrays are equal");
        }
        else {
           
            System.out.println("Two arrays are not equal");
        }
    }
}