import java.util.Scanner;

public class TreeCreation{
	static Node create(){
		int data;
		Scanner sc = new Scanner(System.in);
		Node root = null;	//root node created and assigned null
		System.out.println("Enter the value : ");
		data = sc.nextInt();
		root = new Node(data);
		if(data == -1)
			return null;
		System.out.println("Enter left child of "+root.data);
		root.left=create();
		System.out.println("Enter right child of "+root.data);
		root.right=create();
		return root;
	}
	
	public static void main(String[] args){
		Node root = create();
	}

}

class Node{
	int data;
	Node right,left;
	public Node(int data){
	this.data = data;
	left = null;
	right= null;
	}
}