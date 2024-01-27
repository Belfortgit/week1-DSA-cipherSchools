import java.util.*;

interface A
{
    int var = 90;
    void func();
}
interface B
{
    int var = 44;
    void func();
}

interface C extends A,B    // Multiple inheritance
{
    int var = 83;
    void func();
}

class Sample implements C
{
    public void func()
    {
        System.out.println("In class C");
    }
}

// THE;LIOUKYTRDCGVHBKLKL;KUYTRDTFVBNJK;L'POI98YI7YFTFCVGBHKILKO;IHGYFDTGFYUIJLKO;JUFDRSEFTYUI

class Lecture14
{
    public static void main(String t[])
    {
        Sample obj = new Sample();
        obj.func();
    }
}