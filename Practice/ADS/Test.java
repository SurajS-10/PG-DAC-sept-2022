class Animal{
	String name="animal";
	String makeNoise(){
		return "Generic noise";
	}
}
class Dog extends Animal{
	String name="dog";
	String makeNoise(){
		return "bark";
	}
}
public class Test{
	public static void main(String[] args){
		Animal an = new Dog();
		System.out.println(an.name+" "+an.makeNoise());
	}
}