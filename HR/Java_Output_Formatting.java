import java.util.Scanner;

public class Java_Output_Formatting
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("-----------------------------------");

        for(int i = 0; i < 3; i++)
        {
            String s1 = sobj.next();
            int x = sobj.nextInt();
            System.out.println("%-15s%03d%n",s1,x);
        }
        System.out.println("-----------------------------------");
    }
}