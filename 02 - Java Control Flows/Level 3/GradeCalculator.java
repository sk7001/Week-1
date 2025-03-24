import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Physics marks");
        float physicsMarks = scanner.nextInt();
        System.out.println("Please enter Chemistry marks");
        float chemistryMarks = scanner.nextInt();
        System.out.println("Please enter Mathematics marks");
        float mathematicsMarks = scanner.nextInt();
        float averageMarks = ( physicsMarks + mathematicsMarks + chemistryMarks ) / 3 ;
        System.out.println("Average Marks: " + averageMarks);
        if(averageMarks>=80){
            System.out.println("Grade: A\n(Level 4, above agency-normalized standards)");
        }else if(averageMarks<=79 && averageMarks>=70){
            System.out.println("Grade: B\n(Level 3, at agency-normalized standards)");
        }else if(averageMarks<=69 && averageMarks>=60){
            System.out.println("Grade: C\n(Level 2, below, but approaching agency-normalized standards)");
        }else if(averageMarks<=59 && averageMarks>=50){
            System.out.println("Grade: D\n(Level 1, well below agency-normalized standards)");
        }else if(averageMarks<=49 && averageMarks>=40){
            System.out.println("Grade: E\n(Level 1-, too below agency-normalized standards)");
        }else{
            System.out.println("Grade: R\n(Remedial standards)");
        }
        scanner.close();
    }
}
