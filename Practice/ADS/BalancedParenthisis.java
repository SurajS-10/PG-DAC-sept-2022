import java.util.Scanner;
import java.util.Stack;

class BalancedParenthisis{
	public static boolean BalancedParenthisis(String str){
		Stack<Character> stack = new Stack<> ();
		char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++){
				char current = ch[i];
				if(current == '{' ||current == '['||current == '('){
						stack.push(current);
						continue;
				}
				if(stack.isEmpty()){
					return false;
				}
				char popChar;
				switch(current){
					case ')' :
								popChar = (char) stack.pop();
								if(popChar == '{' || popChar == '[')
									return false;
								break;
						
					case '}' :
								popChar = (char) stack.pop();
								if(popChar == '(' || popChar == '[')
									return false;
								break;
								
					case ']' :
								popChar = (char) stack.pop();
								if(popChar == '(' || popChar == '{')
									return false;
								break;
				}
		}
		return (stack.isEmpty());
	}
	
	public static void main(String[] args){
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input string to check:");   
		s = sc.nextLine();
		if (BalancedParenthisis(s))   
	System.out.println("Input string "+s+" is balanced.");   

	else   
	System.out.println("Input string "+s+" is not balanced."); 
	}
}