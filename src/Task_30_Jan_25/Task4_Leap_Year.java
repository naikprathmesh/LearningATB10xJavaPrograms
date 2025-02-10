package Task_30_Jan_25;

import java.util.Scanner;

public class Task4_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year to Check");
        int year = sc.nextInt();

        if ((year%4 == 0))
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }

}
