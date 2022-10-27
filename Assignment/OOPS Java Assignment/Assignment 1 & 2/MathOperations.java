import java.util.*;
class Demo{
	static int add(int num1, int num2){
		return (num1+num2);
	}
	
	static int substract(int num1, int num2){
		return (num1-num2);
	}
	
	static int multiplication(int num1, int num2){
		return (num1*num2);
	}
	
	static int power(int num1, int num2){
		return (int)(Math.pow(num1, num2));
	}
}

class MathOperations{
	
	public static void main(String args[]){
		Demo d1 = new Demo();
		int addi=d1.add(12,23);
		int sub=d1.substract(21,10);
		int mul=d1.multiplication(10,20);
		int pow1=d1.power(2,8);
		System.out.println("Addition : "+ addi);
		System.out.println("Substraction : "+ sub);
		System.out.println("Multiplication : "+mul);
		System.out.println("Power : "+pow1);
	}
}