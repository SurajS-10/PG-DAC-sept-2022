import java.util.Scanner;

class Stack2{
	private Node top;
	private int length;
	private int Max=10;
	public class Node{
		private int data;
		private Node next;
		public Node(int data){
			this.data=data;
		}
	}
	
	public Stack2(){
		top=null;
		length=0;
	}
	
	public boolean isEmpty(){
		return length==0;
	}
	
	public boolean isFull(){
		return length==Max;
	}
	
	public void push(int data){
		if(isFull()){
			System.out.println("Stack OverFlow");
		}
		Node temp = new Node(data);
		temp.next=top;
		top=temp;
		length++;
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack underFlow");
		}
		int result = top.data;
		top=top.next;
		length--;
		return result;
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Stack underFlow");
		}
		
		return top.data;
	}
	
	public static void main(String[] args){
		Stack2 s1 = new Stack2();
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Maximum size of stack");
		//int Max=sc.nextInt();
		int choice;
		do{
		System.out.println("Operation to perform on stack\n 1.Push\n 2.pop\n 3.peek\n press any other key to exit");
		choice = sc.nextInt();
			
		switch(choice)
		{
			case 1 :
					System.out.println("Enter element to add");
					int key = sc.nextInt();
					s1.push(key);
					break;
			
			case 2 :
					s1.pop();
					break;
					
			case 3 :
					System.out.println("The data on top od stack is "+s1.peek());
					break;
					
			default : 
					System.out.println("Thank you");
					break;
		}
		}while(choice!=0);
	}
}