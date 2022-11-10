public class Q18Constructor_Chaining
{
        public Q18Constructor_Chaining()
        {
            System.out.println("In default constructor");
        }
        public Q18Constructor_Chaining(int i)
        {
            this();
            System.out.println("In single parameter constructor");
        }
        public Q18Constructor_Chaining(int i,int j)
        {
            this(j);
            System.out.println("In double parameter constructor");
        }
        public static void main(String a[])
		{
           Q18Constructor_Chaining obj = new Q18Constructor_Chaining(11,12);
        }
}