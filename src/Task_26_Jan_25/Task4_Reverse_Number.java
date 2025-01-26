package Task_26_Jan_25;

import java.util.Scanner;

public class Task4_Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        String rev="";
        for (int i=1;i<=num;i++)
        {
            rev = rev + num%10;
            num =num/10;
        }
        System.out.println("Reverse of number is : "+rev);
        sc.close();

    }
}
