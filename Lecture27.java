import java.util.*;

class Lecture27
{
    public static void main(String ar[])
    {
        int arr[] = {2,1,4,3,6,5};

        for(int i=0;i<arr.length-1;i++)
        {
            int min = i;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
}