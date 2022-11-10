
public class Q8Number_Objects 
{
    static int count=0;
    Q8Number_Objects()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        Q8Number_Objects obj1 = new Q8Number_Objects();
        Q8Number_Objects obj2 = new Q8Number_Objects();
        Q8Number_Objects obj3 = new Q8Number_Objects();
        Q8Number_Objects obj4 = new Q8Number_Objects();
        System.out.println("Number of objects created:"+count);
    }
}
