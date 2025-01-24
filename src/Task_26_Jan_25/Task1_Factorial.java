package Task_26_Jan_25;

import java.util.Scanner;

public class Task1_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for Factorial");
        int num = sc.nextInt();
        int fact=1;
        for (int i=1;i<=num;i++)
        {
            fact= fact*i;
        }
        System.out.println("Factorial is: " +fact);
        sc.close();
    }
}
