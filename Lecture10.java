import java.util.*;

class Student
{
    int roll; // Instance variable
    String name;
    static int count; // Static variable

    public Student(int a, String s)
    {
        this.roll = a;
        this.name = s;
        count++;
    }

    static void show()
    {
        System.out.println("Count value is "+count);
    }
}

class Lecture10
{
    public static void main(String o[])
    {
        Student obj1 = new Student(5,"John");
        Student obj2 = new Student(8,"Pant");
        Student obj3 = new Student(9,"Gill");

        System.out.println(Student.count);
        Student.show();

    }
}