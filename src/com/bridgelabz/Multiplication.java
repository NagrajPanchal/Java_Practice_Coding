// Multiplication Table
package com.bridgelabz;
import java.util.Scanner;
public class Multiplication
{
    public static void main(String[] args)
    {
        System.out.println("Multiplication table");
        System.out.print("Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i=1; i<=10; i++)
        {
            int sum = num*i;
            System.out.println(num+"X"+i+"="+sum);
        }
    }
}
