// Switch case use Char,Integer, String
package com.bridgelabz;
import java.util.Scanner;
public class SwitchCase
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Case : ");
        String str = scanner.nextLine();
        switch (str)
        {
            case "A" :
                System.out.println("Apple");
                break;
            case "B" :
                System.out.println("Ball");
                break;
            case "C" :
                System.out.println("Cat");
                break;
            default :
                System.out.println("Words");
                break;
        }
    }
}
