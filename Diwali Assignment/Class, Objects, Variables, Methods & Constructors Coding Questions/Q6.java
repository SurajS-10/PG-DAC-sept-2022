class BankAcct 
{
    int principal = 200, rate = 4, time = 2;
    void test() 
    {
        Interest inner_obj = new Interest();
        inner_obj.display();
    }
    class Interest 
    {
        void display() 
        {
            int si = (principal * rate * time) / 100;
            System.out.println("Interest : " + si + " Rs");
        }
    }
}
public class Q6

{
    public static void main(String args[]) 
    {
        BankAcct outer_obj = new BankAcct();
        outer_obj.test();
    }
}