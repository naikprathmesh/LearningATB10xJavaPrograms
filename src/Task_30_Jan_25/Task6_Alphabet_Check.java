package Task_30_Jan_25;

import java.util.Scanner;

public class Task6_Alphabet_Check {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet:");
        char c = sc.next().charAt(0);

        if (Character.isLetter(c))
        {
            System.out.println("Is an Alphabet");
        }
        else {
            System.out.println("Not an Alphabet");
        }
        sc.close();

    }
}
