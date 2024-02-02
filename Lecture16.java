import java.util.*;

class Encap
{
    private int a = 2; // these are only accessible inside this class
    private int b = 9;
    private int c = 8;
    private int d = 7;
    private int e = 3;

    public int getA() // this method is used by other classes to get the value of a
    {
        return this.a;
    }
    public int getB()
    {
        return this.b;
    }
    public void setA(int a) // this method is used by other classes to set the value of a
    {
        if(a>100) this.a = a;
        else System.out.println("Cannot set the value");
    }
    public void setB(int b)
    {
        this.b = b;
    }

}

class Lecture16
{
    public static void main(String qr[])
    {
        Encap obj = new Encap();
        System.out.println(obj.getA());
        obj.setA(899);
        System.out.println(obj.getA());
    }
}