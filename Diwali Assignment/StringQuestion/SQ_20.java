import java.util.*;
public class SQ_20 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        String str = "India is my country";  
        System.out.println("Entet the charcter you want to remove ");
        char s = sc.next().charAt(0);
        int  a= str.indexOf(s);
        
        System.out.println(charRemoveAt(str, a));  
     }  
     public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
     }  
}
