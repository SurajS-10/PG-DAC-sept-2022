import java.util.Scanner;

public class Box1
{	
	double width,depth,height;
	double volume;
	Box1(double x,double y,double z)
	{
		this.width=x;
		this.height=y;
		this.depth=z;
	}
		
	double Volume()
		{
			volume=depth*height*width;
			return volume;
		}
	public static void main(String args[])
	{
		System.out.println("Enter the Box dimensions:");
		Scanner sc = new Scanner(System.in);
		double x= sc.nextDouble();
		double y= sc.nextDouble();
		double z= sc.nextDouble();
		Box1 b1 = new Box1(x,y,z);
		double x1 = b1.Volume();
		System.out.println("Dimensions of box are Width = " +(int)x +" mm"); 
		System.out.println("Dimensions of box are Height = " +(int)y +" mm");
		System.out.println("Dimensions of box are Depth = " +(int)z +" mm");
		System.out.println("Volume of box = " +(int)x1+"mm3");
		System.out.println("Volume of box = " +x1+"mm3");
	}		
	
	
}