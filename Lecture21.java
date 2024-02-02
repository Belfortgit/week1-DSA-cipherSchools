import java.util.*;

class Lecture21
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ur name");
        String name = sc.next();

        System.out.println("Enter ur Roll-no");
        int rollno = sc.nextInt();

        System.out.println("Enter ur Profession");
        String prof = sc.next();

        System.out.println("Enter ur Salary");
        int sal = sc.nextInt();

        System.out.println("Enter ur Company");
        String com = sc.next();

        // float x = sc.nextFloat();
        // double y = sc.nextDouble();
        // boolean z = sc.nextBoolean();

        System.out.println("Details of the candidate are");
        System.out.println(name+" "+rollno+" "+prof+" "+sal+" "+com);
    }
}