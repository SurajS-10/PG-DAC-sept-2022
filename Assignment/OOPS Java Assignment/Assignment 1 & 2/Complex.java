class Complex{
	int r;
	int i;
	
	Complex(){
		this.r=0;
		this.i=0;
	}
	
	Complex(int r){
		this.r=r;
		this.i=0;
	}
	
	Complex(int r, int i){
		this.r = r;
		this.i = i;
	}
	
	static void add(Complex c1, Complex c2){
		int rSum = c1.r + c2.r;
		int imgSum = c1.i + c2.i;
		System.out.println("Addition of complex numbes is "+ rSum + " + " +"(" +imgSum+")" + " i");
	}
	
	static void multiplication(Complex c1, Complex c2){
		 
		 int rMulti = (c1.r*c2.r - c1.i*c2.i);
		 int imgMulti = (c1.r*c2.i + c2.r*c1.i);
		 System.out.println("Multiplication of complex numbers is "+ rMulti + " + " +"(" +imgMulti+")" + " i");
	}
	
	public static void main(String args[]){
		Complex c1 = new Complex(3,2);
		Complex c2 = new Complex(4,-2);
		add(c1,c2);
		multiplication(c1,c2);
	}
}