import java.util.Scanner;
import java.util.Stack; 

class StringReverse{
	public static String reverse(String s1){
		Stack<Character> stack = new Stack<> ();
		char[] ch =s1.toCharArray();
		
		for(char c : ch){
			stack.push(c);
		}
		
		for(int i=0;i<s1.length();i++){
			ch[i] = stack.pop();
		}
		return new String(ch);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the string");
		String str1 = sc.next();
		System.out.println("String before reverse "+str1);
		System.out.println("String after reverse "+reverse(str1));
		
	}
	
}