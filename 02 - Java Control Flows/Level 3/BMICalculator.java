import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the weight of the person in kilograms");
        double weight = scanner.nextDouble();
        System.out.println("Please enter the height of the person in centimeters.");
        double height =scanner.nextDouble();
        double bmi = weight / Math.pow(height / 100,2);
        if(bmi<=18.4){
            System.out.println("Underweight");
        }else if(bmi<=24.9 && bmi>=18.5){
            System.out.println("Normal");
        }else if(bmi<=39.9 && bmi>=25.0){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
        scanner.close();
    }
}
