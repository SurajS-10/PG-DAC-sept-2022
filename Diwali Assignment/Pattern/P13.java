import java.util.Scanner;
class P13{
	public static void main(String[] args) {
      // take input
	  
      Scanner scan = new Scanner(System.in);
      int n = 0;
      System.out.print("Enter N value:: ");
      n = scan.nextInt();
      printNumberHollowDiamond(n);
   }

   private static void printNumberHollowDiamond(int n) {
	   char c =64;
      if(n <= 0)
      System.out.println("Enter Positive Number");

      // declare temp variable
      int a = 1;

      // for first half portion (top to bottom)
      for(int i=1; i <= n; i++) {

         // print space 
         for(int j = i; j <= n; j++) {
            System.out.print(" ");
         }

         // print digit and space 
         for(int k = 1; k <= 2*i-1; k++) {
            if(k==1 || k==(2*i-1) )
            System.out.print((char)(c+a));
            else
            System.out.print(" ");
         }

         // increase temp variable
         a++;

         // new line
         System.out.println();
      }

      // update temp variable
      a = n-1;

      // for second half portion
      for(int i=n-1; i >= 1; i--) {

         // print space
         for(int j=n; j >= i; j--) {
            System.out.print(" ");
         }

         // print digit and space 
         for(int k=1; k <= 2*i-1; k++) {
            if(k==1 || k==(2*i-1) )
            System.out.print((char)(c+a));
            else
            System.out.print(" ");
         }

         // decrease temp variable
          a--;

         // new line
         System.out.println();
      }
   }
}