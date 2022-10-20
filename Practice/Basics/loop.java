class loop{
	public static void main(String args[]){
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println(i+","+j);
				if(i==j)
				{
					continue;
				}
			}
			System.out.println("out of the inner loop");
		}
		System.out.println("out of outer loop");
	}
}