package Task_29_Jan_25;

import java.util.Scanner;

public class Task4_Age_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        if (age >=18 && age <= 100)
        {
            System.out.println("Eligible to Vote");
        }
        else {
            System.out.println("Not Eligible to Vote");
        }
        sc.close();
    }
}
