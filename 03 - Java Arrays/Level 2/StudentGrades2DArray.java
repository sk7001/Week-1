import java.util.Scanner;
public class StudentGrades2DArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        double[][] marks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        char[] grade = new char[numberOfStudents];
        for (int i = 0; i<numberOfStudents ; i++){
            System.out.println("Please enter details of person " + (i+1));
            for(int j=0; j<3; j++){
                if(j==0){
                    System.out.println("Please enter physics marks of student " + (i+1) + " : ");
                    marks[i][j] = scanner.nextDouble();
                }else if(j==1){
                    System.out.println("Please enter chemistry marks of student " + (i+1) + " : ");
                    marks[i][j] = scanner.nextDouble();
                }else{
                    System.out.println("Please enter mathematics marks of student " + (i+1) + " : ");
                    marks[i][j] = scanner.nextDouble();
                    if(marks[i][j-1]<0 || marks[i][j-2]<0 || marks[i][j]<0){
                        System.out.println("Either of these values are negative so please re-enter a positive marks for all the marks.");
                        i--;
                        break;
                    }
                }
            }
        }
        for(int i = 0; i<numberOfStudents;i++){
            percentages[i] = 0;
            for(int j = 0; j<3 ; j++){
                percentages[i] += marks[i][j];
            }
            percentages[i]/=3;
            if(percentages[i]>=80){
                grade[i] = 'A';
            }else if(percentages[i]<80 && percentages[i]>70){
                grade[i] = 'B';
            }else if(percentages[i] <70 && percentages[i]>60){
                grade[i] = 'C';
            }else if(percentages[i] <60 && percentages[i]>50){
                grade[i] = 'D';
            }else if(percentages[i]<50 && percentages[i]>40){
                grade[i] = 'E';
            }else{
                grade[i] = 'R';
            }
        }
        for(int i = 0; i<numberOfStudents; i++){
            for(int j = 0; j<3; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.print(percentages[i] + " ");
            System.out.println(grade[i]);
        }
        scanner.close();
    }
}
