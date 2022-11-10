public class Q5
{
    static Q5.InnerClass obj;
    void test1()
    {
        System.out.println("Success");
    }
    static public class InnerClass
    {
    	private String name = "Peakit";
        public void test2()
        {
            Q5 outer = new Q5();
            outer.test1();
        }
    }
    public static void main(String[] args)
    {
        obj = new Q5.InnerClass();
        obj.test2();
    }
}