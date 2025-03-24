import java.util.Scanner;
public class BMICalculatorArray {
    public static double bmi(double weight, double height){
        return weight / Math.pow(height / 100, 2);
    }
    public static String[] bmiStatus(double[][] personDetails){
        String[] bmiStatus = new String[10];
        for(int i = 0; i < 10; i++){
            if(personDetails[i][2] <= 18.4){
                bmiStatus[i] = "Underweight";
            }else if(personDetails[i][2] > 18.4 && personDetails[i][2] < 25){
                bmiStatus[i] = "Normal";
            }else if(personDetails[i][2] > 25 && personDetails[i][2] < 40){
                bmiStatus[i] = "Overweight";
            }else{
                bmiStatus[i] = "Obese";
            }
        }
        return bmiStatus;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[][] personDetails = new double[10][3];
        String[] bmiStatus = new String[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Please enter the details of person " + (i+1));
            for(int j = 0; j < 3; j++){
                if(j == 0){
                    System.out.println("Please enter weight of person " + (i+1) + " in kilograms");
                    personDetails[i][j] = scanner.nextDouble();
                }else if(j == 1){
                    System.out.println("Please enter height of person " + (i+1) + " in centimeters");
                    personDetails[i][j] = scanner.nextDouble();
                }else{
                    personDetails[i][j] = bmi(personDetails[i][j-2], personDetails[i][j-1]);
                }
            }
        }
        bmiStatus = bmiStatus(personDetails);
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(personDetails[i][j] + " ");
            }
            System.out.println(bmiStatus[i]);
        }
        scanner.close();
    }
}
