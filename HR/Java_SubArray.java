import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_SubArray 
{

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            int sum = 0;
            for(int j = i; j < n; j++)
            {
                sum = sum + a[j];
                if(sum < 0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}