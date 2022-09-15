// Print number 100 to 1 Odd Number and Count Numbers
package com.bridgelabz;

public class OddNumber
{
    public static void main(String[] args)
    {
        int count = 0;
        for (int i = 99; i >= 1; i=i-2)
        {
            if( i%1 ==0)
            {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nCount is : "+count);
    }
}
