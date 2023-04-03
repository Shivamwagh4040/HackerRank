import java.util.Scanner;
import java.util.regex.*;

public class Java_Pattern_Syntax_Checker
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int testCases = Integer.parseInt(sobj.nextLine());

        while(testCases > 0)
        {
            String pattern = sobj.nextLine();

            try
            {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(Exception e)
            {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}