import java.util.Scanner;
public class TrigonometricFunctionsCalculator {
    public static double[] calculateTrigonometricFunctions(double angle){
        double radAngle = Math.toRadians(angle);
        double sine = Math.sin(radAngle);
        double cose = Math.cos(radAngle);
        double tangent = Math.tan(radAngle);
        return new double[] {sine, cose, tangent};
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the angle in degrees");
        double angle = scanner.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sine : " + result[0]);
        System.out.println("Cose : " + result[1]);
        System.out.println("Tangent : " + result[2]);
        scanner.close();
    }
}
