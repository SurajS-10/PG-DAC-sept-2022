
public class Q4
{
    int x = 10;
    static int y = 20;
    static class Inner 			//static inner class
    {
        void show()		        // non static method in static inner class
        {
            System.out.println(y);
            //  System.out.println(x);  error :  non-static variable x cannot be referenced from a static context
        }
    }
    public static  void main(String... s)
    {
        System.out.println("'In main method'. The vlaue of static data member of outer class is :"+y);
        //  System.out.println(x);                     error:  non-static variable x cannot be referenced from a static context
        System.out.println("Inner class method accessed by Inner class object ");
        Inner i = new Inner();
        i.show();
        System.out.println("Inner class method accessed by outer class object ");
        Q4.Inner o = new Q4.Inner();
        o.show();
    }
}