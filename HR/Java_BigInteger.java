import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_BigInteger 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        BigInteger a = new BigInteger((sobj.next()));

        BigInteger b = new BigInteger((sobj.next()));

        System.out.println(a.add(b));

        System.out.println(a.multiply(b));
    }
}