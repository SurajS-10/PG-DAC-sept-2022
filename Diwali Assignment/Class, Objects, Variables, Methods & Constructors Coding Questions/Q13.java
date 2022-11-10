
import java.util.Scanner;
class Q13test
{
    float areacircle()
    {   
        System.out.print("enter the radius :");
        Scanner s = new Scanner(System.in);
        float r = s.nextFloat();
        float ar;
        ar = (r * r) * 22 / 7;
        System.out.println("area of the circle is : "+ar+" sq units.");
        s.close();
		return ar;
    }
}
public class Q13
{
    public static void main(String args[]) 
    {
        Q13test obj = new Q13test();
        float a = obj.areacircle();
        System.out.println("area of the circle is : "+a+" sq units.");
    }
}
