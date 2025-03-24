import java.util.Scanner; 
public class TotalPurchasePriceCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        float unitPrice = scanner.nextFloat(), quantity = scanner.nextFloat(); 
        float totalPrice = unitPrice * quantity; 
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice); 
    } 
} 
