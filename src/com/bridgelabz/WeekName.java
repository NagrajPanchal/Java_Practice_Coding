// Week Number by using Switch case
package com.bridgelabz;
import java.util.Scanner;
public class WeekName
{
    public static void main(String[] args)
    {
        int weeknum;
        for ( int i = 1; i<=7;i++)
        {
            if(i<=7)
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter Week Number : ");
                weeknum = scanner.nextInt();

                switch (weeknum) {
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Invalid");
                        break;
                }
            }
            
        }

    }
}
