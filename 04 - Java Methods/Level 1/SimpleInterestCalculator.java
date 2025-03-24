import java.util.Scanner;
public class SimpleInterestCalculator {
    public static double simpleInterest(double principle, double rate, double time){
        return (principle * rate * time)/100;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the principle amount");
        double principle = scanner.nextDouble();
        System.out.println("Please enter the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.println("Please enter the time: ");
        double time = scanner.nextDouble();
        double simpleInterest = simpleInterest(principle, rate, time);
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principle + ", Rate of Interest " + rate + " and Time " + time );
        scanner.close();
    }
}
