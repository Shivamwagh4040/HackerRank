import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Substring
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String S = sobj.next();

        System.out.println("Enter the starting index of string from which you want to start : ");
        int start = sobj.nextInt();

        System.out.println("Enter the ending index of string where you want to stop : ");
        int end = sobj.nextInt();

        System.out.println("The displayed string is : "+S.substring(start,end));
    }
}