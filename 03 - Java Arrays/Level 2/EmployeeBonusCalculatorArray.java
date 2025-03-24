import java.util.Scanner;
public class EmployeeBonusCalculatorArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] oldSalary = new double[10];
        double[] serviceYears = new double[10];
        double[] totalBonus = new double[10];
        double[] newSalary = new double[10];
        for(int i = 0; i<10; i++){
            System.out.println("Please enter the Employee " + (i+1) + "'s salary:");
            oldSalary[i] = scanner.nextDouble();
            System.out.println("Please enter the Employee " + (i+1) + "'s service years:");
            serviceYears[i] = scanner.nextDouble();
            if(serviceYears[i] < 0 || oldSalary[i]<0){
                System.out.println("Invalid Number\nPlease enter the details of the Employee " + (i+1) + " again");
                i--;
            }
        }
        for(int i=0; i <10; i++){
            if(serviceYears[i]>5){
                totalBonus[i]=oldSalary[i]*5/100;
            }else{
                totalBonus[i]=oldSalary[i]*2/100;
            }
            newSalary[i] = oldSalary[i]+totalBonus[i];
        }
        for(int i = 0; i<10; i++){
            System.out.println("Employee" + (i+1) + ":");
            System.out.println("Old Salary: " + oldSalary[i]);
            System.out.println("Total bonus: " + totalBonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
        }
        scanner.close();
    }
}
