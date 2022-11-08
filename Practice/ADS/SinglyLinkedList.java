

public class SinglyLinkedList{
	private Node head;
	
	public static class Node{
		private int data;
		private Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void Display(){
		Node current = head;
		while(current!=null){
			System.out.print(current.data+"--->");
			current=current.next;
		}
		System.out.print("null");
	} 
	public static void main(String[] args){
		SinglyLinkedList s1= new SinglyLinkedList();
		s1.head = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		
		s1.head.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		
		s1.Display();
	}
}