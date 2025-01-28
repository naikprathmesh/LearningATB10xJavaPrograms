package Task_29_Jan_25;

import java.util.Scanner;

public class Task2_Even_Odd_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No:");
        int num = sc.nextInt();
        String s = (num%2==0) ? "Even Number" : "Odd Number";
        System.out.println(s);
        sc.close();
    }
}
