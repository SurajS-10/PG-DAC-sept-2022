class Patient
{
	String name;
	double weight,height;//weight in pound and height in inch
	String reference;
	int patientNo;
	
	
	static double bmi(double weight,double height)
	{
		double r = ((weight/(height*height))*703);
		System.out.println("BMI of Patient is "+r);
		return r;
	}
	
	void printDetails()
	{
		System.out.println("Patient name = "+name+",Weight & height are : "+weight+" pounds & "+height+" inch");

	}
	
} 

public class HealthCare
{
	public static void main(String args[])
	{
		Patient p1 =new Patient();
		p1.name = "Suraj";
		p1.patientNo = 10;
		p1.weight = 132.00;
		p1.height = 72;
		p1.reference = "Dr.Shiva";
		
		p1.bmi(p1.weight,p1.height);
		p1.printDetails();
	}
}