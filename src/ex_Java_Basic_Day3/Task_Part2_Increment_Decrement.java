package ex_Java_Basic_Day3;

public class Task_Part2_Increment_Decrement {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        int b = 20;
        System.out.println(--b + b++ + b--);
        System.out.println(b);
    }
}
