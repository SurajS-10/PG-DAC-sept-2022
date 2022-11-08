import java.util.Scanner;

class TreeCreationPrac{
	static Node create(){
		int data;
		Node root=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		data = sc.nextInt();
		if(data==0)
			return null ;
		root = new Node(data);
		System.out.println("Enter left value of "+root.data);
		root.left = create();	
		System.out.println("Enter right value of "+root.data);
		root.right = create();
		return root;
		
	} 
	static void inorder(Node root){		//LNR
		if(root==null)
		return;
		inorder(root.left);
		System.out.print(root.data);
		System.out.print(" ");
		inorder(root.right);
	}
	static void preorder(Node root){	//NLR
		if(root==null)
		return;
		System.out.print(root.data);
		System.out.print(" ");
		preorder(root.left);
		preorder(root.right);
	}
	static void postorder(Node root){	//LRN
		if(root==null)
		return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data);
		System.out.print(" ");
	}
	public static void main(String[] args){
		Node root=create();
		System.out.print("Preorder is [");
		preorder(root);
		System.out.print(" ]");
		System.out.println();
		System.out.print("Inorder is [");
		inorder(root);
		System.out.print(" ]");
		System.out.println();
		System.out.print("Postorder is  [");
		postorder(root);
		System.out.print(" ]");
		System.out.println();
		
	}
} 
class Node{
	int data;
	Node left,right;
	public Node(int data){		//constructor call
		this.data=data;
		left=null;
		right=null;
	}
}