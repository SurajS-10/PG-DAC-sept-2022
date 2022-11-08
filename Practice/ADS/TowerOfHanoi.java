import java.util.Scanner;

class TowerOfHanoi{
	public static void toh(int n,char s,char inter, char d ){
		if(n==1){
			System.out.println("Disc moved from "+s+" pole to "+d+" pole");
		}
		else{
			toh(n-1,s,d,inter);
			System.out.println("Disc moved from "+s+" pole to "+d+" pole");
			toh(n-1,inter,s,d);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No.of Disc's");
		int n = sc.nextInt();
		toh(n,'A','B','C');
	}
}
