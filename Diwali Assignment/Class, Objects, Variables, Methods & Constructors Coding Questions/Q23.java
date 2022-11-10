
public class Q23
{
    int x = 17;
    public static void main(String...a)
    {
        //System.out.println(x);  Error 
        // non static variable can be called only after making objects
        Q23 ob = new Q23();
        System.out.println(ob.x);
    }
}