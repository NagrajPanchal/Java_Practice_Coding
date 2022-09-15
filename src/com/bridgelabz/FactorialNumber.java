// Factorial Number
package com.bridgelabz;
import java.util.Scanner;
public class FactorialNumber
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i<=num; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Number : "+num+" Factorial is : " + factorial);
    }
}
