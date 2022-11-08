class Stack{
	private Node top;
	private int length;
	public class Node{
		private int data;
		private Node next;
		public Node(int data){
			this.data=data;
		}
	}
	
	public Stack(){
		top=null;
		length=0;
	}
	
	public int length(){
		return length;
	}
	
	public boolean isEmpty(){
		return length==0;
	}
	
	public void push(int data){
		Node temp = new Node(data);
		temp.next=top;
		top=temp;
		length++;
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is underflow");
		}
		int result = top.data;
		top=top.next;
		length--;
		return result; 	
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Stack is underflow");
		}
		return top.data;
	}
	
	public static void main(String[] args){
		Stack s1= new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
	}
}