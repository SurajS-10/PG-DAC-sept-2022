class P1{
	public static void main(String[] args) {
    // size of the pyramid
    int size = 5;
    for (int  i = 0; i < size; i++) {
      // print spaces
      for (int j = 0; j < size - i - 1; j++) {
        System.out.print(" ");
      }
      // print stars
      for (int k = 0; k < 2 * i + 1; k++) {
        if (i == 0 || i == size - 1) {
          System.out.print("*");
		  if(k==size-1)
			System.out.print("***");
        }
		
        else {
          if (k == 0 || k == 2 * i) {
            System.out.print("*");
			
          }
          else {
            System.out.print(" ");
          }
		  
		 }
		 		
        }
		System.out.println();
      }
      
    }
  }
