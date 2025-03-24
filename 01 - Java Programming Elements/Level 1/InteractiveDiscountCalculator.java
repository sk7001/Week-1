import java.util.Scanner; 
public class InteractiveDiscountCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int fee = scanner.nextInt(), discountPercent = scanner.nextInt(); 
        float discount = (float) fee * discountPercent / 100; 
        float discountedFee = fee - discount; 
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee); 
    } 
} 
