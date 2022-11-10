
import java.util.Scanner;
public class Q26Byte_Sum
{
    public static void main(String[] args) 
    {
        byte a, b;
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first byte value:");
        a = s.nextByte();
        x = a;
        System.out.print("Enter second byte value:");
        b = s.nextByte(); 
        y = b;
        z = x + y;
        System.out.println("Result:"+z);
        s.close();
     }
}
