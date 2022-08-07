//Check if a given string is a palindrome and return true or false based on the result, only with the help of recursion. You can //not use string buffer or inbuilt string features like reverse etc

// A recursive JAVA program to
// check whether a given String
// is palindrome or not

import java.util.*;
 
class Palindrome
{
    // A recursive function that
    // check a str(s..e) is
    // palindrome or not.
    static boolean isPalRec(String str, int s, int e)
    {
        // If there is only one character
        if (s == e)
            return true;
 
        // If first and last
        // characters do not match
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
 
        // If there are more than
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);
 
        return true;
    }
 
    static boolean isPalindrome(String str)
    {
        int n = str.length();
 
    // An empty string is
    // considered as palindrome
        if (n == 0)
            return true;
 
        return isPalRec(str, 0, n - 1);
    }
 
    // Driver Code
    public static void main(String args[])
    {
        String str;
	   Scanner in = new Scanner(System.in);
       System.out.println("Enter the String:");
	   str = in.next();
 
        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}