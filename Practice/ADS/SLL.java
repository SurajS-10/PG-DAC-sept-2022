public class SLL{
	private Node head;
	
	public static class Node{	//node creation
		private int data;
		private Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
		} 
	}
	
	public int lengthOfLL(){ 	//fpr length of linked list
		if(head==null)
			return 0;
		int count=0;
		Node current=head;
		while(current!=null){
			count++;
			current=current.next;
		}
		return count;
	}
	
	public void insert(int data){	//inserting a data at beginning of LL
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		
	}
	
	public void insertAtEnd(int data){	//inserting a data at end of LL
		Node newNode = new Node(data);
		if(head==null){
			head=newNode;
			return;
		}
		Node current = head;
		while(current.next != null){
			current=current.next;
		}
		current.next=newNode;
	}
	
	public void insertAtPoint(int data,int pos){ //inserting a data at location of LL
		Node newNode = new Node(data);
		if(pos==1){
			newNode.next=head;
			head=newNode;
		}else{
			Node previous=head;
			int count=1;
			while(count<(pos-1)){
				previous=previous.next;
				count++;
			}
			Node current =previous.next;
			previous.next=newNode;
			newNode.next=current;
		}
		
	}
	
	public void display(){
		Node current =head;
		while(current!=null){
			System.out.print(current.data+" -->");
			current=current.next;
		}
		System.out.println("null");
		
	}
	
	public static void main(String[] args){
		SLL s1 = new SLL();
		s1.head = new Node(10);
		Node two = new Node(2);
		Node three = new Node(30);
		Node four = new Node(4);
		Node five = new Node(50);
		
		s1.head.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
	
		s1.insert(500);
		s1.insertAtEnd(99);
		s1.insertAtPoint(111,3);
		s1.display();
		System.out.println(s1.lengthOfLL());
	}
}