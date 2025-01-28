package Task_29_Jan_25;

import java.util.Scanner;

public class Task3_Max_2_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No 1: ");
        int a = sc.nextInt();
        System.out.println("Enter No 2: ");
        int b = sc.nextInt();
        if(a>b)
        {
            System.out.println(a+" is greater");
        }
        else {
            System.out.println(b + " is greater");
        };
        sc.close();
    }
}
