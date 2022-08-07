//Program to find the power X over N in O(logn) time complexity

import java.util.*;

class Power {
    static int power(int x, int y){
    int temp;
    if( y == 0)
        return 1;
    temp = power(x, y / 2);
    if (y % 2 == 0)
        return temp*temp;
    else
        return x*temp*temp;
}

public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Program to calculate pow(x,n)");
        System.out.println();
        System.out.print("Enter x:");
        int x = in.nextInt();
        System.out.print("Enter y:");
        int y = in.nextInt();
        System.out.printf("%d", power(x, y));
    }
}