package Task_19_Jan_25;

public class Task_Part2_CLI_Maxof2 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);;
        int max = n1>n2 ? n1:n2;
        System.out.println("Max number is:"+max);
    }
}