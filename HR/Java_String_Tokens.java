import java.io.*;
import java.util.*;

public class Java_String_Tokens
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String S = sobj.nextLine();

        S = S.trim();

        String token[] = S.split("[^a - zA - Z]+");

        if(S.length() == 0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(token.length);
        }

        for(String word : token)
        {
            System.out.println(word);
        }
        sobj.close();
    }
}