class Room{
	int height;
	int width;
	int breadth;
	
	Room(int h, int w, int b){
		height=h;
		width=w;
		breadth=b;
	}
	int volume(){
		return (height*width*breadth);
	}
}

class RoomDemo extends Room {
	
	RoomDemo(int height, int width, int breadth){
		super(height,width,breadth);
	}
	void displayVolume(){
		System.out.println("Volume of room : "+super.volume());
	}
}

public class Rooms{
	public static void main(String args[]){
		RoomDemo r1 = new RoomDemo( 23, 34, 45);
		r1.displayVolume();
	}
}