// Check Number is Positive and Negative

package com.bridgelabz;
import java.util.Scanner;
public class Positive_Nagative
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scanner.nextInt();
        if(num > 0)
        {
            System.out.println(num+" : Positive");
        } else if (num < 0)
        {
            System.out.println(num+" : Negative");
        }
        else
        {
            System.out.println(num+ " : Zero");
        }
    }
}

