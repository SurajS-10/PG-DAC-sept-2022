class Student
{
	int rollNo;
	int age;
	double marks;
	
	void setDetails(int r,int a,double m)
	{
		rollNo=r;
		age=a;
		marks=m;
	}
	
	void printDetails()
	{
		System.out.println(rollNo+","+age+","+marks);
	}	
}

public class studentDemo
{
	public static void main(String args[])
	{
		Student stud1 = new Student();
		stud1.setDetails(1,20,75.0);
		stud1.printDetails();
	}
}