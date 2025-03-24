import java.util.Scanner; 
public class SimpleInterestCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int principle = scanner.nextInt(), rate = scanner.nextInt(), time = scanner.nextInt(); 
        float simpleInterest = (principle * rate * time)/100; 
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principle + ", Rate of Interest " + rate + " and Time " + time); 
    } 
} 
