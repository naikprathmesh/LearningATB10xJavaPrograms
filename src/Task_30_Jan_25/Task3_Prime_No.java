package Task_30_Jan_25;

import java.util.Scanner;

public class Task3_Prime_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = sc.nextInt();
        if (num%num==0 || num%1==0)
        {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not a Prime");
        }
        sc.close();
    }
}
