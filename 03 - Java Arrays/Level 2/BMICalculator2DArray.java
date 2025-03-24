import java.util.Scanner;
public class BMICalculator2DArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of persons:");
        int number = scanner.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i<number; i++){
            System.out.println("Please enter details of person " + (i+1));
            for(int j=0; j<3; j++){
                if(j==0){
                    System.out.println("Please enter weight of person " + (i+1) + " in kilograms");
                    personData[i][j] = scanner.nextDouble();
                }else if(j==1){
                    System.out.println("Please enter height of person " + (i+1) + " in centimeters");
                    personData[i][j] = scanner.nextDouble();
                }else{
                    if(personData[i][j-1]<0 || personData[i][j-2]<0){
                        System.out.println("Either of these values are negative so please re-enter a positive value for both.");
                        i--;
                        break;
                    }
                    personData[i][j] = (personData[i][j-2]/(Math.pow((personData[i][j-1]/100), 2)));
                    if(personData[i][j]>=40.0){
                        weightStatus[i] = "Obese";
                    }else if(personData[i][j]<=39.9 && personData[i][j]>=25.0){
                        weightStatus[i] = "Overweight";
                    }else if(personData[i][j]<=24.9 && personData[i][j]>=18.5){
                        weightStatus[i] = "Normal";
                    }else if(personData[i][j]<=18.4){
                        weightStatus[i] = "Underweight";
                    }
                }
            }
        }
        for(int i = 0; i<number; i++){
            for(int j = 0; j<3; j++){
                System.out.print(personData[i][j] + " ");
            }
            System.out.println(weightStatus[i]);
        }
        scanner.close();
    }
}
