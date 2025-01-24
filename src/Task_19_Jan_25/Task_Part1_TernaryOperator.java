package Task_19_Jan_25;

public class Task_Part1_TernaryOperator {
    public static void main(String[] args) {
        int marks=95;
        String grade = (marks >90 && marks<100) ? "A" : (marks >80 && marks<89) ? "B" : (marks >70 && marks<79) ? "C" : (marks >60 && marks<69) ? "D" : "F" ;
        System.out.println(grade);
    }
}
