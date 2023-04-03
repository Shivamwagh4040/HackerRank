import java.util.Scanner;

public class Java_Stdin_And_Stdout2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int i = scan.nextInt();

        System.out.println("Enter the decimal number : ");
        double d = scan.nextDouble();
        scan.nextLine();
        
        System.out.println("Enter the String : ");
        String s = scan.nextLine();
        
        System.out.println("The predicted output is : ");
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}