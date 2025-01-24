// Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4

package Task_25_Jan_25;

import java.util.Scanner;

public class Task2_Vowels_Consonants
{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter String To Check");
        String OStr=a.nextLine();
        int len = OStr.length();
        int vowels=0;
        int con=0;
        for (int i=len-1;i>=0;i--)
        {
            if (OStr.charAt(i) == 'a' || OStr.charAt(i) == 'e' || OStr.charAt(i) == 'i' || OStr.charAt(i) == 'o' || OStr.charAt(i) == 'u') {
                vowels = vowels + 1;
            }
            else
            {
                con = con + 1;
            }
        }
        System.out.println("No of Vowels: " + vowels);
        System.out.println("No of Consonants: " + con);
        }
    }