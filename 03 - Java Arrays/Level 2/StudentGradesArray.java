import java.util.Scanner;
public class StudentGradesArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of Students:");
        int numberOfStudents = scanner.nextInt();
        double[] physics = new double[numberOfStudents];
        double[] chemistry = new double[numberOfStudents];
        double[] mathematics = new double[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];
        for(int i = 0; i<numberOfStudents; i++){
            System.out.println("Please enter the Physics marks of student " + (i+1) + ": ");
            physics[i]=scanner.nextInt();
            System.out.println("Please enter the Chemistry marks of student " + (i+1) + ": ");
            chemistry[i]=scanner.nextInt();
            System.out.println("Please enter the Mathematics marks of student " + (i+1) + ": ");
            mathematics[i]=scanner.nextInt();
            if(physics[i]<0 || chemistry[i]<0 || mathematics[i]<0){
                System.out.println("Either of the marks for student " + (i+1) + " entered negative, so please check and re-enter the students's marks correctly.");
                i--;
            }
            percentages[i] = (physics[i]+chemistry[i]+mathematics[i])/3;
            if(percentages[i]>=80){
                grades[i] = 'A';
            }else if(percentages[i]<80 && percentages[i]>=70){
                grades[i] = 'B';
            }else if(percentages[i]<70 && percentages[i]>=60){
                grades[i] = 'C';
            }else if(percentages[i] <60 && percentages[i]>=50){
                grades[i] = 'D';
            }else if(percentages[i]<50 && percentages[i]>=40){
                grades[i] = 'E';
            }else{
                grades[i] = 'R';
            }
        }
        for(int i = 0; i<numberOfStudents ; i++){
            System.out.println("Details of student " + (i+1));
            System.out.println("Physics marks of student " + (i+1) + ": " + physics[i]);
            System.out.println("Chemistry marks of student " + (i+1) + ": " + chemistry[i]);
            System.out.println("Mathematics marks of student " + (i+1) + ": " + mathematics[i]);
            System.out.println("Percentage of student " + (i+1) + ": " + percentages[i] + "%");
            System.out.println("Grade of student " + (i+1) + ": " + grades[i]);
        }
        scanner.close();
    }
}
