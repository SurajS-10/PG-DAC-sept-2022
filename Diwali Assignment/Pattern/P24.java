class P24{
	public static void main(String args[]){
	
		for(int i=1; i<=5; i++){
		int count=i;
			for(int j=1; j<=i; j++){
				System.out.print(count+" ");
				count=count+5-j;
			}
		System.out.println();
		}
	}
}