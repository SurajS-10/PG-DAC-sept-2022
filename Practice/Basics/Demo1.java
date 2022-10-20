class Student
{
	String name;
	int rollNo;
	int standard;
	double marks;
	char bloodGroup;
	String town;
	String schoolName;
	
	void printDetails()
	{
		System.out.println(name+" "+rollNo+" "+standard+" "+marks+" "+bloodGroup+" "+town+" "+schoolName);
	}
	
	
}

public class Demo1
{
	public static void main(String args[])
	{
		//Scanner sc = new Scanner(System.in);
		Student stud1 = new Student();
		stud1.name = "Suraj";
		stud1.rollNo = 10;
		stud1.standard = 7;
		stud1.marks = 300.00;
		stud1.bloodGroup = 'A';
		stud1.town = "Satara karad";
		stud1.schoolName = "King George";
		
		stud1.printDetails();
	}
}