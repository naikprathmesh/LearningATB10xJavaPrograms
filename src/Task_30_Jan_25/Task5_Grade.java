package Task_30_Jan_25;

import java.util.Scanner;

public class Task5_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int marks = sc.nextInt();
        if (marks<=100 && marks>=90)
        {
            System.out.println("A+");
        }
        else if (marks<=89 && marks>=80)
        {
            System.out.println("A");
        }
        else if (marks<=79 && marks>=70)
        {
            System.out.println("B");
        }
        else if (marks<=69 && marks>=60)
        {
            System.out.println("C");
        }
        else if (marks<=59 && marks>=50)
        {
            System.out.println("D");
        }

        else if (marks<=49 && marks>=40)
        {
            System.out.println("E");
        }

        else {
            System.out.println("Fail");
        }
    }
}
