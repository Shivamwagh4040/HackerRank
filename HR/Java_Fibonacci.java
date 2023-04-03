import java.util.Scanner;

public class Java_Fibonacci
{
    public static void main(String args[])
    {
        int n = 10;
        int fib1 = 0;
        int fib2 = 1;
        int fib = 0;

        for(int i = 2; i <= n; i++)
        {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }

        System.out.println("Fibonacci number at position " +n+ " is : "+fib);
    }
}