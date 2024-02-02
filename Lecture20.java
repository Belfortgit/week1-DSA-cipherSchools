import java.util.*;

class Lecture20
{
    public static void main(String ar[])
    {
        // Jagged Array 
        int arr [][] = new int [4][];
        arr[0] = new int[] {1,2,3}; // declaring size for each row
        arr[1] = new int[] {2,3,4,5};
        arr[2] = new int[] {6,5,7,8,3,2};
        arr[3] = new int[] {5,1};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}