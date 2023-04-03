import java.io.*;
import java.util.*;

public class Java_String_Reverse
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string : ");
        String S = sobj.next();

        String R = new StringBuilder(S).reverse().toString();

        if(S.equals(R))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}