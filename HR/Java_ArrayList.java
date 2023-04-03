import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<ArrayList<Integer>> al1 = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++)
        {
            int d = scn.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            for(int j = 0; j < d; j++)
            {
                int num = scn.nextInt();
                al.add(num);
            }
            al1.add(al);
        }
        int q = scn.nextInt();
        for(int i = 0; i < q; i++)
        {
            int x = scn.nextInt();
            int y = scn.nextInt();
            if(x > al1.size() || y > al1.get(x-1).size())
            {
                System.out.println("Error!");
            }
            else
            {
                System.out.println(al1.get(x-1).get(y-1));
            }
        }
    }
}