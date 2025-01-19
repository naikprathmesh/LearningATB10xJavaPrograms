package ex_Java_Basic_Day3;

public class Task_Part2_Largestof3 {
    public static void main(String[] args) {
        int n1=5;
        int n2=27;
        //String largest = n1 > n2 ? "n1 is greater" : "n2 is greater";
        //System.out.println(largest);
        int n3=10;
        String result = (n1>n2 && (n1>n3)) ? "n1 is greater" : (n2>n3) ?"n2 is greater": "n3 is greater";
        System.out.println(result);
    }
}
