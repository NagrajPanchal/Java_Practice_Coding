// Square Number
package com.bridgelabz;
import java.util.Scanner;
public class SquareNumber
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        System.out.print("1 to "+number+" Squares are\n");
        for (int i =1; i<=number; i++) {
            int square = (i * i);
            System.out.println("Number "+i+" Square is : "+i+"^"+2+"=" + square);
        }
    }
}
