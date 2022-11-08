class Stack1{
	private Node top;
	private int length;
	private int MAX=10;
	public class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
		}
	}
	
	public Stack1(){
		top=null;
		length=0;
	}
	
	public boolean isEmpty(){
		return length==0;
	}
	public boolean isFull(){
		return length==MAX;
	}
	public void push(int data){
		if(isFull()){
			System.out.println("Stack is Overflow");
			return;
		}
		Node temp=new Node(data);
		temp.next=top;
		top=temp;
		length++;
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack underflow");
		}
		int result = top.data;
		top=top.next;
		length--;
		return result;
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Stack underflow");
		}
		if(isFull()){
			System.out.println("Stack is Overflow");
		}
		int result = top.data;
		return result;
	}
	
	public static void main(String[] args){
		Stack1 s1 = new Stack1();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
	}
}