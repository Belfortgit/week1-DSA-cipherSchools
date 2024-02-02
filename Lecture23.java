import java.util.*;

// Checking whether the number is prime or not

class Lecture23
{
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;
        
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0) return false; 
        }
        return true;
    }
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        System.out.print(isPrime(n));
    }
} 