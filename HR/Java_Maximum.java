import java.util.Scanner;

public class Java_Maximum
{
    public static void main(String args[])
    {
        int arr[] = {5,2,7,3,9};
        int max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        System.out.println("Maximum number in the array is : "+max);
    }
}