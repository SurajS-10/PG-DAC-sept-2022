class Box{
	int height;
	int width;
	int breadth;
	
	Box(int h, int w, int b){
		height=h;
		width=w;
		breadth=b;
	}
	int getVolume(){
		return height*width*breadth;
	}
	
	int getArea(){
		return (2*breadth*width+2*breadth*height+2*height*width);
	}
	
	void printDetails(){
		System.out.println("Volume is "+ getVolume());
		System.out.println("Surface area is "+ getArea());
	}
}

class BoxCode{
	public static void main(String args[]){
		Box b1 = new Box(25,50,40);
		Box b2 = new Box(20,20,20);
		
		b1.printDetails();
		b2.printDetails();
		
		
	}
}