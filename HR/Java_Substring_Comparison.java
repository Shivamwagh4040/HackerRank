import java.util.Scanner;

class Java_Substring_comparison
{
    public String SmallestLargest(String s, int k)
    {
        String str = s.substring(0, k);
        String Smallest = str;
        String Largest = str;

        for(int i = 1; i <= s.length()-k; i++)
        {
            str = s.substring(i, i + k);

            if(str.compareTo(Smallest) < 0)
            {
                Smallest = str;
            }

            if(str.compareTo(Largest) > 0)
            {
                Largest = str;
            }
        }
        return Smallest + "\n" + Largest;
    }
}

public class Java_Substring_Comparison
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String L = sobj.next();

        System.out.println("Enter the number of words you want : ");
        int j = sobj.nextInt(); 

        String iRet = SmallestLargest(L,j);

        System.out.println("The smallest and largest lexographical order of this string is : "+iRet);
    }
}


