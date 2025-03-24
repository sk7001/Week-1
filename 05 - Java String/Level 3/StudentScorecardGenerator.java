import java.util.Scanner;
public class StudentScorecardGenerator {
    public static int[][] scoresOfStudents(int number){
        int[][] studentScore = new int[number][3];
        for(int i = 0; i < number; i++){
            for(int j = 0; j < 3; j++){
                studentScore[i][j]=(int)(Math.random()*100);
            }
        }
        return studentScore;
    }
    public static int[][] calculateTotalAveragePercentage(int[][] studentScore){
        int[][] totAvgPer = new int[studentScore.length][3];
        for(int i = 0; i<totAvgPer.length; i++){
            for(int j = 0; j<3; j++){
                if(j==0){
                    for(int k = 0; k<3; k++){
                        totAvgPer[i][j]+=studentScore[i][k];
                    }
                }else if(j==1){
                    totAvgPer[i][j]=Math.round((float)totAvgPer[i][j-1]/3);
                }else {
                    totAvgPer[i][j]= Math.round((float)totAvgPer[i][j-2]/3);
                }
            }
        }
        return totAvgPer;
    }
    public static String[][] calGrade(int[][] totAvgPer){
        String[][] grades = new String[totAvgPer.length][2];
        for(int i = 0; i< grades.length; i++){
            if(totAvgPer[i][2]>=80){
                grades[i][0]="A";
                grades[i][1]="Level 4, above agency-normalized standards";
            }else if(totAvgPer[i][2]<80&&totAvgPer[i][2]>=70){
                grades[i][0]="B";
                grades[i][1]="Level 3, at agency-normalized standards";
            }else if(totAvgPer[i][2]<70&&totAvgPer[i][2]>=60){
                grades[i][0]="C";
                grades[i][1]="Level 2, below, but approaching agency-normalized standards";
            }else if(totAvgPer[i][2]<60&&totAvgPer[i][2]>=50){
                grades[i][0]="D";
                grades[i][1]="Level 1, well below agency-normalized standards";
            }else if(totAvgPer[i][2]<50&&totAvgPer[i][2]>=40){
                grades[i][0]="E";
                grades[i][1]="Level -1, too below agency-normalized standards";
            }else {
                grades[i][0]="R";
                grades[i][1]="Remedial standards";
            }
        }
        return grades;
    }
    public static void displayScoreCard(int numberOfStudents){
        int[][] scoresOfStudents = scoresOfStudents(numberOfStudents);
        int[][] totAvgPer = calculateTotalAveragePercentage(scoresOfStudents);
        String[][] calGrade = calGrade(totAvgPer);
        System.out.format("%-7s %-10s %-10s %-10s %-10s %-10s %-10s %-6s %-6s\n","Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade", "Remark");
        for(int i = 0; i<numberOfStudents; i++){
            System.out.format("%-7d ",(i+1));
            for(int j = 0; j<3; j++){
                System.out.format("%-10d ",scoresOfStudents[i][j]);
            }
            for(int j = 0; j<3; j++){
                System.out.format("%-10d ",totAvgPer[i][j]);
            }
            for(int j = 0; j<2; j++){
                System.out.format("%-6s ",calGrade[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        displayScoreCard(numberOfStudents);
    }
}
