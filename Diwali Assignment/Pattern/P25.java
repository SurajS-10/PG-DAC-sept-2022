class P25{
	public static void main(String[] args){
		for (int i = 1; i <= 7; i++){
            int j = i;
            for (int k = 1; k <= 7; k++) { 
                System.out.print(j ); 
                j++; 
                if (j > 7)
                    j = 1;
            }
            System.out.println();
        }
	}
}