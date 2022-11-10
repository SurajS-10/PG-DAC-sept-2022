import java.util.Scanner;
class Q12test
{
    void areacircle()
    {   
        System.out.print("enter the radius :");
        Scanner s = new Scanner(System.in);
        float r = s.nextFloat();
        float ar;
        ar = (r * r) * 22 / 7;
        System.out.println("area of the circle is : "+ar+" sq units.");
        s.close();
    }
}
public class Q12
{
    public static void main(String args[]) 
    {
        Q12test obj = new Q12test();
        obj.areacircle();
    }
}
