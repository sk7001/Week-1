import java.util.Scanner;
public class BMICalculatorArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of persons:");
        int number = scanner.nextInt();
        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi= new double[number];
        String[] weightStatus = new String[number];
        for (int i = 0 ; i<number ; i++){
            System.out.println("PLease enter details of person " + (i+1) + ":");
            System.out.println("Weight of person " + (i+1) + " in kilograms:");
            weight[i] = scanner.nextDouble();
            System.out.println("Height of person " + (i+1) + " in centimeters:");
            height[i] = scanner.nextDouble();
            bmi[i] = (weight[i]/(Math.pow((height[i]/100), 2)));
            if(bmi[i]>=40.0){
                weightStatus[i] = "Obese";
            }else if(bmi[i]<=39.9 && bmi[i]>=25.0){
                weightStatus[i] = "Overweight";
            }else if(bmi[i]<=24.9 && bmi [i]>=18.5){
                weightStatus[i] = "Normal";
            }else if(bmi[i]<=18.4){
                weightStatus[i] = "Underweight";
            }
        }
        for(int i = 0; i<number; i++){
            System.out.println("Person " + (i+1) + " details:");
            System.out.println("Height :" + height[i]);
            System.out.println("Weight :" + weight[i]);
            System.out.println("BMI :" + bmi[i]);
            System.out.println("Weight Status :" + weightStatus[i]);
        }
        scanner.close();
    }
}
