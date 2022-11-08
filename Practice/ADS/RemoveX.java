import java.util.Scanner;

class RemoveX{
	
	static String removeX(String str, int n, String str2){
        if(n>=str.length()){
            return str2;
        }
        if(str.charAt(n)!= 'x'){
            str2+=str.charAt(n);
        }
        return removeX(str, n+1, str2);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        System.out.println(removeX(str, 0, ""));
    }
	
}