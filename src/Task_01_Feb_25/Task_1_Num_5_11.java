package Task_01_Feb_25;

import java.util.Scanner;

public class Task_1_Num_5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No:");
        int num = sc.nextInt();
        if (num%5==0 && num%11==0)
        {
            System.out.printf("%d is divisible by 5 and 11",num);
        }
        else {
        System.out.printf("%d is not divisible by 5 and 11",num);
    }
        sc.close();
    }
}
