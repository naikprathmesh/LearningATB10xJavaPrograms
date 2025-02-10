package Task_30_Jan_25;

import java.util.Scanner;

public class Task2_Smallest_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no 1: ");
        int num1 = sc.nextInt();

        Scanner sc1 = new Scanner (System.in);
        System.out.println("Enter no 2: ");
        int num2 = sc1.nextInt();

        if (num1 < num2)
        {
            System.out.println("1st num is smaller");
        }
        else
        {
            System.out.println("2nd num is smaller");
        }

        sc.close();
        sc1.close();
    }
}
