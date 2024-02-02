import java.util.*;

class Lecture17
{

    public int[] reverseArray(int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String ar[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Lecture17 obj = new Lecture17();
        arr = obj.reverseArray(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}