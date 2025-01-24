//Write a program that prints numbers from 1 to 100.
// However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
// For numbers that are multiples of both 3 and 5, print "FizzBuzz."

package Task_25_Jan_25;

public class Task1_FizzBuzz_Test {
    public static void main(String[] args) {
    for (int i =1;i<=100;i++)
    {
        if (i%15==0)
        {
            System.out.println("FizzBuzz");
            continue;
        }
        else if (i%5==0) {
            System.out.println("Buzz");
            continue;
        }
        else if  (i%3==0)
        {
            System.out.println("Fizz");
            continue;
        }
        else
        {
            System.out.println(i);
        }
    }
    }
}