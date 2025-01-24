
//Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)
package Task_25_Jan_25;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3_Palndrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String To Check");
        String OriginalStr= input.nextLine();
        int StrLen= OriginalStr.length() ;
        String ReverseStr = "";
        for (int i = StrLen-1;i >= 0;i--)
        {
            ReverseStr = ReverseStr + OriginalStr.charAt(i);
        }
        if (OriginalStr.toLowerCase().equals(ReverseStr.toLowerCase()))
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a Palindrome");
    }
    }

