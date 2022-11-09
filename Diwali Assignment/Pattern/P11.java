class P11{
	public static void main(String args[]){
		char c = 64;
 
		for(int i=6;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print((char)(c+j)+"");
				
			}
			System.out.println(" ");
		}
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)(c+j)+"");
			}
			System.out.println(" ");
		}
	
	}

}