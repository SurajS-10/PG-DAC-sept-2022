import java.util.*;   
public class BalancedParentheses
{   
	public static boolean balancedParenthesis(String inputStr) {   
          
	Stack stack = new Stack();   // create an empty stack  
	char[] charArray = inputStr.toCharArray();   // convert inputStr to char array   
	for (int i = 0; i < charArray.length; i++)    // iterate charArray       
    { 
		char current = charArray[i];   // get char   
		if (current == '{' || current == '[' || current == '(') 
		{   
			stack.push(current);   // push current to stack   
			continue;   
		}   
		
		if (stack.isEmpty())  // if stack is empty, return false   
		{    
			return false;   
		} 
		
			char popChar;   
			switch (current) 
			{   
                case ')':   
                popChar = (char) stack.pop();   
                if (popChar == '{' || popChar == '[')   
                    return false;   
                break;  

				
                case '}':   
                popChar = (char) stack.pop();   
                if (popChar == '(' || popChar == '[')   
                    return false;   
                break;   
				
				
                case ']':   
                popChar = (char) stack.pop();   
                if (popChar == '(' || popChar == '{')   
                    return false;   
                break;   
            }   
        }   
        return (stack.isEmpty());   
    }   
     
public static void main(String[] args)
{   
          
	String inputStr;   
	Scanner sc = new Scanner(System.in);   
	System.out.println("Enter input string to check:");   
	inputStr = sc.nextLine();   
	
	if (balancedParenthesis(inputStr))   
	System.out.println("Input string "+inputStr+" is balanced.");   

	else   
	System.out.println("Input string "+inputStr+" is not balanced.");   
}   
} 