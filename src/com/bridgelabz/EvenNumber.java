// Print number 100 to 1 Even Number and Count Numbers
package com.bridgelabz;

public class EvenNumber
{
    public static void main(String[] args)
    {
        int count = 0;
        for (int i = 100; i >= 1; i--)
        {
            if( i%2 ==0)
            {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nCount is : "+count);
    }
}
