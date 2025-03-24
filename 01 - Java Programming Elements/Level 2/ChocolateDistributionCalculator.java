import java.util.Scanner; 
public class ChocolateDistributionCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int numberOfChocoltes = scanner.nextInt(), numberOfChildren = scanner.nextInt(); 
        int numberOfChocolatesEachChildGets = numberOfChocoltes/numberOfChildren; 
        int numberOfChocolatesRemaining = numberOfChocoltes%numberOfChildren; 
        System.out.println("The number of chocolates each child gets is " + numberOfChocolatesEachChildGets + " and the number of remaining chocolates are " + numberOfChocolatesRemaining); 
    } 
} 
