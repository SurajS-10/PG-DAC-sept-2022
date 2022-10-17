//Find largest and smallest element of integer array

class Arr{
	
	
	public static void main(String args[]){
		int arr[]={5,4,3,1,2};
		
		int temp =0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}					
			}
		}
		
		System.out.println("Largest Number in array = "+arr[4]);
		System.out.println("Largest Number in array = "+arr[0]);
	}
}