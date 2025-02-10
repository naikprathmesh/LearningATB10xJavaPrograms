package Task_30_Jan_25;

import java.util.Scanner;

public class Task1_Largest_3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter no 1");
        int n1 = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Enter no 1");
        int n2 = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("Enter no 1");
        int n3 = c.nextInt();

        if (n1 > n2 && n1 > 3) {
            System.out.println("n1 is greater");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("n2 is greater");
        } else {
            System.out.println("n3 is greater");
        }
    }
}
