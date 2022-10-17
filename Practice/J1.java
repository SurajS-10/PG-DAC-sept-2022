class J1{
    public static void main (String [] args){
        //int arr[] = new arr(1,2,3,4);
        int x = 0;
        int mult=1;
       
        int arr2 [] = {1,2,3,4};
         int arr1[4];
        for (int i =0 ; i <= arr2.length; i++){
            System.out.println(arr2[i]);
        }
       for (int i =0 ; i <= arr2.length; i++){
            
           if (x == arr2[i]) continue;
           
           mult *= arr2[i];
           
               arr1[x]=mult;
           
           x++;
       }
        for (int i =0 ; i <= arr2.length; i++){
            System.out.println(arr1[i]);
        }
        
    }
}