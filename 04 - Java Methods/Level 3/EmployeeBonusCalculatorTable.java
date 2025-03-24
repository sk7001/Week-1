import java.util.Random;
public class EmployeeBonusCalculatorTable {
    public static double[][] generateEmployeeData(int numEmployees) {
        double[][] employeeData = new double[numEmployees][2];
        Random random = new Random();
        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000);
            employeeData[i][1] = random.nextInt(11);
        }
        return employeeData;
    }
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3];
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
        return updatedData;
    }
    public static void displayEmployeeDetails(double[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.printf("%-10s %-15s %-10s %-15s %-15s\n", "Emp ID", "Old Salary", "Years", "Bonus", "New Salary");
        for (int i = 0; i < employeeData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];
            totalNewSalary += updatedData[i][2];
            System.out.printf("%-10d %-15.2f %-10.0f %-15.2f %-15.2f\n",
                (i + 1), updatedData[i][0], employeeData[i][1], updatedData[i][1], updatedData[i][2]);
        }
        System.out.printf("%-10s %-15.2f %-10s %-15.2f %-15.2f\n", "Total", totalOldSalary, "", totalBonus, totalNewSalary);
    }
    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displayEmployeeDetails(employeeData, updatedData);
    }
}
