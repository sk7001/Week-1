import java.util.Scanner;
public class RemainderAndQuotientMethod {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient = number/divisor;
        int remainder = number%divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        System.out.println("Please enter the divisor");
        int divisor = scanner.nextInt();
        int[] results = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient :" + results[0]);
        System.out.println("Remainder :" + results[1]);
        scanner.close();
    }
}
