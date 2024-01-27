import java.util.*;

class A
{
    final int a = 8; // Final values cannot be changed by child classes
    final int b;
    public A()
    {
        b = 36; // we can assing the value of final variable either in constructor or while declaration
    }
}

final class B extends A  // final classes can't be inherited
{
    public void funcB()
    {
        System.out.println("Inside function B"); // Final methods can't be overridden
    }
}

class Lecture11
{
    public static void main(String p[])
    {
        B obj = new B();
        obj.funcB();
    }
}