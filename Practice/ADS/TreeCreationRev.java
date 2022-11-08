import java.util.Scanner;

class TreeCreationRev{
	static Node create(){
		int data;
		Node root = null;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the data");
		data = sc.nextInt();
		//IMPORTANT DONT FORGET BASE CONDITION
		//=============================//
		if(data==0)
			return null;
		//=============================//
		root =new Node(data); //since we are creating node use NEW keyword
		System.out.print("Enter left data of "+root.data);
		root.left=create();
		System.out.print("Enter right data of "+root.data);
		root.right=create();
		return root;
	}
	public static void main(String[] args){
		Node root =create();
	}
}

class Node{
	int data;
	Node left,right;
	public Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}