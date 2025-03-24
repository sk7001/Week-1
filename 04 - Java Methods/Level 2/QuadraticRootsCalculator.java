import java.util.Scanner;
public class QuadraticRootsCalculator {
    public static double[] rootsOfQuadratic(double a, double b, double c){
        double delta = Math.pow(b,2) - 4 * a * c;
        if(delta > 0){
            double[] rootsOfQuadratic = {((-b + Math.sqrt(delta)) / (2*a)), ((-b - Math.sqrt(delta)) / (2*a))};
            return rootsOfQuadratic;
        }else if(delta == 0){
            double[] rootsOfQuadratic = {-b / (2*a)};
            return rootsOfQuadratic;
        }else{
            double[] rootsOfQuadratic = {};
            return rootsOfQuadratic;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a");
        double a = scanner.nextDouble();
        System.out.println("Enter the value of b");
        double b = scanner.nextDouble();
        System.out.println("Enter the value of c");
        double c = scanner.nextDouble();
        double[] roots = rootsOfQuadratic(a, b, c);
        System.out.println("Roots of the quadratic equation are:");
        for(int i = 0; i < roots.length; i++){
            System.out.println(roots[i]);
        }
        scanner.close();
    }
}
