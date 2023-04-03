import java.util.Scanner;

class HackerRank
{
    static boolean IsAnagram(String a, String b)
    {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length())
        {
            return false;
        }

        int arr[] = new int[26];

        for(int i = 0; i < a.length(); i++)
        {
            int index = a.charAt(i)-'a';
            arr[index]++;
        }

        for(int i = 0; i < b.length(); i++)
        {
            int index = b.charAt(i)-'a';
            arr[index]--;
        }

        for(int i = 0; i < 26; i++)
        {
            if(arr[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
}

class Java_Anagrams
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String A = sobj.next();

        System.out.println("Enter another string : ");
        String B = sobj.next();

        sobj.close();

        boolean bRet = IsAnagram(A,B);

        System.out.println((bRet) ? "Anagrams" : "Not Anagrams");
    }
}

