import java.util.*;

class Lecture19
{
    public static void main(String ar[])
    {
        int arr[][] = new int [3][4];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = j+i;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Jagged Array 
        int nums [][] = new int [2][];
        nums[0] = new int[3]; // declaring size for each row
        nums[1] = new int[4];
    }
}