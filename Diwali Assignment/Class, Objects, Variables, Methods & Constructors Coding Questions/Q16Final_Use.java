

class Figure
{
    final int length = 5;
    final int bredth = 4;
    final void area()
    {
        int a = length * bredth;
        System.out.println("Area:"+a);
    }
}
class Q16Rectangle extends Figure
{
    final void rect()
    {
        System.out.println("This is rectangle");
    }
}
final public class Q16Final_Use extends Q16Rectangle
{
    public static void main(String[] args) 
    {
        Q16Final_Use obj = new Q16Final_Use();
        obj.rect();
        obj.area();
    }
}