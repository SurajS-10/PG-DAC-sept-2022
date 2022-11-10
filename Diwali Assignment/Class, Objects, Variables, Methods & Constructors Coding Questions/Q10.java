
class Computer {
    // Attributes associated with Computer
    int no;
    Computer(int no) 
    { 
    	this.no = no; 
    }
}
 
// Class 2
// Uses Computer objects
class Q10 {
    // Method 1
    // To swap
    public static void swap(Computer c1, Computer c2)
    {
        int temp = c1.no;
        c1.no = c2.no;
        c2.no = temp;
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Creating Computer class objects(creating Computers)
        Computer c1 = new Computer(1);
        Computer c2 = new Computer(2);
 
        // Calling method 1
        swap(c1, c2);
 
        // Print and display commands
        System.out.println("c1.no = " + c1.no);
        System.out.println("c2.no = " + c2.no);
    }
}