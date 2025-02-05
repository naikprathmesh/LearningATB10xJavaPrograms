package Task_01_Feb_25;

import java.util.Scanner;

public class Task2_Domain_URL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL:");
        String url = sc.nextLine();
        if (url.contains(".com"))
        {
            System.out.println("Commercial Website");
        }
        else if (url.contains(".org")) {
            System.out.println("Non Profit Website");
        }

        else if (url.contains(".edu")) {
            System.out.println("Education Website");
        }

        else if (url.contains(".gov")) {
            System.out.println("Government Website");
        }

        else if (url.contains(".net")) {
            System.out.println("Network-related Website");
        }

        else if (url.contains(".info")) {
            System.out.println(" Informational Website");
        }

        else {
            System.out.println("Invalid Website");
        }
        sc.close();
    }
}
