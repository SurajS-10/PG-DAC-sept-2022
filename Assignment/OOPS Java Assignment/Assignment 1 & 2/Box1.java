class Box
{
	int width;
	int breadth	;
	int height;
	
	Box(int h,int w,int b)
	{
		width = w;
		breadth = b;
		height = h;
	}
	
	int getVolume()
	{
		return (width*height*breadth);
	}
	
	int getArea()
	{
		return ((2*width*height)+(2*height*breadth)+(2*height*width));
	}
	
	void printDetails()
	{
		System.out.println("Dimensions of Box are \n1.Width = "+width+"mm\n2.Height = "+height+"mm\n3.Breadth = "+breadth+"mm\n");
		System.out.println("Volume of box =" +getVolume()+" mm3");
		System.out.println("Area of Box=" +getArea()+" mm2");
	}	
	
}

public class Box1
{
	public static void main(String args[])
	{
		Box b1 = new Box(50,50,50);
		b1.getArea();
		b1.getVolume();
		b1.printDetails();
	}
}