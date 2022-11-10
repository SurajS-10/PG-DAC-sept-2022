import java.util.*;
public class SQ_23 {
    // Function to print the sorted array of String
  static void printArrayString(String str[], int n) {
    for (int i = 0; i < n; i++)
      System.out.print(str[i] + " ");
  }
 
  // Driver function
  public static void main(String[] args) {
    String arr[] = { "GeeksforGeeks", "I", "from", "am" };
    int n = arr.length;
 
    // Function to perform sorting
    Arrays.sort(arr, Comparator.comparing(s->s.length()));
 
    // Calling the function to print result
    printArrayString(arr, n);
  }
}
