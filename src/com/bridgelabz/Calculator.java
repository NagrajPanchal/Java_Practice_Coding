// Calculator Addition Subtraction Multiplication Division
package com.bridgelabz;
import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        for (int i =1; i<=4; i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nChoose option to press \n 1. Addition\n 2. Subtraction \n 3. Multiplication\n 4. Division\n");
            int option = scanner.nextInt();
            System.out.print("Enter NUmber1 : ");
            int number1 = scanner.nextInt();
            System.out.print("Enter Number2 : ");
            int number2 = scanner.nextInt();
            switch (option) {
                case 1:
                    int add = number1 + number2;
                    System.out.println("Addition is : " + add);
                    break;
                case 2:
                    int sub = number1 - number2;
                    System.out.println("Subtraction is : " + sub);
                    break;
                case 3:
                    int mul = number1 * number2;
                    System.out.println("Multiplication is : " + mul);
                    break;
                case 4:
                    int div = number1 / number2;
                    System.out.println("Division is : " + div);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
