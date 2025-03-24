import java.util.Scanner;
public class GcdLcmCalculator {
    public static int gcdCalculation(int num1, int num2){
        int gcd=Math.min(num1,num2);
        while(true){
            if(num1%gcd==0 && num2%gcd==0){
                return gcd;
            }
            gcd--;
        }
    }
    public static int[] lcmCalculation(int num1, int num2){
        int gcd = gcdCalculation(num1,num2), lcm;
        lcm = num1*num2/gcd;
        return new int[] {gcd, lcm};
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();
        int[] gcdLcm = lcmCalculation(num1, num2);
        System.out.println("Greatest common divisor is :" + gcdLcm[0]);
        System.out.println("Largest common multiple is :" + gcdLcm[1]);
    }
}
