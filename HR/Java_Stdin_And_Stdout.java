import java.util.*;

public class Java_Stdin_And_Stdout 
{
    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int a = Scan.nextInt();
        System.out.println("Enter Second number : ");
        int b = Scan.nextInt();
        System.out.println("Enter Third number : ");
        int c = Scan.nextInt();
        
        Scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
