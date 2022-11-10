
 
public class Q09 {
 

public static int logicOfSequence(int N)
{
    if (N % 2 == 0)
        N = N * N;
    else
        N = N * N * N;
    return N;
}
 
public static void main(String args[])
{
   for(int i = 1; i<=6;i++) {
   int N = i;
    System.out.print(logicOfSequence(N)+" ");
   }
}
}