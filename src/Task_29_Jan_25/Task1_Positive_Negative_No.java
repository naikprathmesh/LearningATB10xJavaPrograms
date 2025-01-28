package Task_29_Jan_25;

import java.util.Scanner;

public class Task1_Positive_Negative_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No to check");
        int num = sc.nextInt();
        String s = (num >= 0) ? "Positive" : "Negative";
        System.out.println(s);
        sc.close();
    }
}
