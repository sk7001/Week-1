public class CalculateDiscountedFee { 
    public static void main(String[] args) { 
        int fee = 125000, discountPercent = 10; 
        float discount = (float) fee * discountPercent / 100; 
        float discountedFee = fee - discount; 
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee); 
    } 
} 
