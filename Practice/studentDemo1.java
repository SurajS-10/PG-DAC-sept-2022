class Student
{
	int rollNo;
	int age;
	double marks;
	
	Student()
	{
		System.out.println("zero-arg constructor");
	}
	Student(int r)
	{
		System.out.println("one-arg constructor");
		rollNo = r;
	}
	Student(int r,int a)
	{
		System.out.println("Two-arg constructor");
		rollNo = r;
		age= a;
	}
	Student(int r,int a,double m)
	{
		System.out.println("Three-arg constructor");
		rollNo = r;
		age= a;
		marks=m;
	}
	
	void printDetails()
	{
		System.out.println(rollNo+","+age+","+marks);
	}	
}

public class studentDemo1
{
	public static void main(String args[])
	{
		//Student stud1 = new Student();
		//Student stud1 = new Student(110);
		Student stud1 = new Student(125,15);
		//Student stud1 = new Student(273,20,78.0);
		stud1.printDetails();
	}
}