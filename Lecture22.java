import java.util.*;

class Lecture22
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array....");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}