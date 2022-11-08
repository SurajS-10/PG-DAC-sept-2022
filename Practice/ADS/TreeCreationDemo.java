import java.util.Scanner;

class TreeCreationDemo{
	static Node create(){
		int data;
		Node root = null;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value");
		data=sc.nextInt();
		if(data==0){
			return null;
		}
		root = new Node(data);
		System.out.println("Enter left value of "+root.data);
		root.left=create();
		System.out.println("Enter right value of "+root.data);
		root.right=create();
		return root;
	}
	
	static void inorder(Node root){		//LNR
		if(root==null)
		return;
		inorder(root.left);
		System.out.print(root.data);
		inorder(root.right);
		
	}
	
	static void preorder(Node root){		//NLR
		if(root==null)
		return;
		System.out.print(root.data);
		preorder(root.left);
		preorder(root.right);
		
	}
	
	static void postorder(Node root){		//LRN
		if(root==null)
		return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data);
	}
	
	public static void main(String[] args){
		Node root =create();
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);
	}
}

class Node{
	int data;
	Node right,left;
	public Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}