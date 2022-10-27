class Student{
	
	String name;
	int marks[]=  new int[3];
	
	Student(String name){
		this.name=name;
	}
	void enterMarks(int sub1, int sub2, int sub3){
		marks[0] = sub1;
		marks[1] = sub2;
		marks[2] = sub3;
	}
	int totalAvarage(){
		int avg = (marks[0]+marks[1]+marks[2])/3;
		return avg;
	}
	
	void display(){
		int total = marks[0]+marks[1]+marks[2];
		System.out.println(name + " marks = "+ total);
	}
	
	public static void main(String args[]){
		Student s1 = new Student("sam");
		s1.enterMarks(70,80,90);
		s1.display();
		System.out.println("avarage "+ s1.totalAvarage());
	}
}