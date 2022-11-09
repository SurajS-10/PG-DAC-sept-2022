class P4{
	public static void main(String args[]){
		int i,j;
		int c=1;
		
		for(i=0; i<5; i++){
			for(j=3;j>=i;j--){
				System.out.print(" ");
			}
			for(j=0; j<=i; j++){
				if(j==0 || i==0){
					c=1;
				}else{
					c=(c*(i-j+1))/j;
				}
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

}