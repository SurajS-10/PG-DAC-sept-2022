import java.util.Scanner;
 
class P5 {
    static void display(int n)
    {
        
        int space = n / 2, number = 1;
 
        // Outer for loop for number of lines
        for (int i = 1; i <= n; i++) {
 
            // Inner for loop for printing space
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
 
            // Inner for loop for printing number
            int count = number / 2 + 1;
            for (int k = 1; k <= number; k++) {
                System.out.print(count);
                if (k <= number / 2)
                    count--;
                else
                    count++;
            }
			// To goto next line
            System.out.println();
            if (i <= n / 2) {
                space = space - 1;
                number = number + 2;
            }
 
            else {
                space = space + 1;
                number = number - 2;
            }
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int n = 7;
        display(n);
    }
}