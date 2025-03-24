import java.util.Scanner;
public class ChocolateDistributionMethod {
    public static int[] findRemainderAndQuotient(int chocolates, int students){
        int quotient = chocolates/students;
        int remainder = chocolates%students;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of chocolates");
        int chocolates = scanner.nextInt();
        System.out.println("Please enter the number of students");
        int students = scanner.nextInt();
        int[] results = findRemainderAndQuotient(chocolates, students);
        System.out.println("Each child gets " + results[0] + " chocolates");
        System.out.println("Remaining chocolates : " + results[1]);
        scanner.close();
    }
}
