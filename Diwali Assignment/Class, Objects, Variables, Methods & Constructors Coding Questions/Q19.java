
public class Q19
{
    int a,b,c;
    Q19()
    {
         a = 5;
         b = 6;
    }
    void change()
    {
        a = 15;
        b = 10;
        c = a + b;
    }
    public static void main(String[] args) 
    {
        Q19 obj1 = new Q19();
        System.out.println("a:"+obj1.a);
        System.out.println("b:"+obj1.b);
        obj1.change();
        System.out.println("New a:"+obj1.a);
        System.out.println("New b:"+obj1.b);
        System.out.println("c:"+obj1.c);
    }
}
