import java.util.Scanner;
public class AthleteRoundsCalculator {
    public static double numberOfRounds(double side1, double side2, double side3){
        double perimeterOfTriangle = side1+side2+side3;
        return (5.0/perimeterOfTriangle);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of side 1 : ");
        double side1 = scanner.nextDouble();
        System.out.println("Please enter the length of side 2 : ");
        double side2 = scanner.nextDouble();
        System.out.println("Please enter the length of side 3 : ");
        double side3 = scanner.nextDouble();
        double numberOfRounds = numberOfRounds(side1, side2, side3);
        System.out.println("The number of rounds are " + numberOfRounds);
        scanner.close();
    }
}
