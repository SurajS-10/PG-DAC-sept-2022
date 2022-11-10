import java.util.Arrays;
  
public class Q07MergeTwoArrays1 {
    public static void main(String[] args) {
  
        int[] a = {23,60,94,3,102};
  
      
        int[] b = {42,16,74};
  

        int a1 = a.length;
      
        int b1 = b.length;
        
 
        int c1 = a1 + b1;
  
      
        int[] c = new int[c1];
  
   
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
  
       
        System.out.println(Arrays.toString(c));
    }
}