package Task_26_Jan_25;

public class Task3_Fibonacci_Series {
    public static void main(String[] args) {
        int a = 0 ;
        int b = 1;
        int c;
        System.out.print(a+" "+b);
        for (int i = 2;i<10;i++)
        {
            c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
