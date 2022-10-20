//creating an class

class Student
{
	String name;
	int rollNo;
	int marks;
	void printDetails()
	{
		System.out.println(name+","+rollNo+","+marks);
	}
}

public class Demo
{
	public static void main(String args[])
	{
	Student stud1= new Student();
	stud1.name = "Suraj";
	stud1.rollNo = 10;
	stud1.marks = 290;
	
	stud1.printDetails();
	}
}