 class Parent
 {
     Parent(int a, int b)
     {
         System.out.println(" the super class constructor");
          int z = a + b;
         System.out.println("the super class method ");
         System.out.println("the sum is "+z);
     }
 }
public class Q21Child extends Parent
{
    Q21Child(int x)
    {
        super(12, 20);
        System.out.println("the sub class constructor ");
        System.out.println(x);
    }
    public static void main(String ... a)
     {
        Q21Child obj = new Q21Child(10);
     }
}