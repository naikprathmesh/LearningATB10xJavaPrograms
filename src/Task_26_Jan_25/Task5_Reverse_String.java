package Task_26_Jan_25;

import java.util.Scanner;

public class Task5_Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String OStr= sc.nextLine();
        int StrLen = OStr.length();
        String RevStr ="";
        for (int i=StrLen-1;i>=0;i--)
        {
            RevStr = RevStr+OStr.charAt(i);
        }
        System.out.println("Reverse of number is : "+ RevStr);
        sc.close();

    }
}
