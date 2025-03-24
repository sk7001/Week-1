import java.util.Scanner;
public class StudentScorecardGenerator {
    public static int[][] generateMarks(int numStudents) {
        int[][] marks = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = (int) (Math.random() * 101);
            marks[i][1] = (int) (Math.random() * 101);
            marks[i][2] = (int) (Math.random() * 101);
        }
        return marks;
    }
    public static Object[][] calculateResults(int[][] marks) {
        Object[][] results = new Object[marks.length][5];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0, perc = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(perc * 100.0) / 100.0;
            String grade = getGrade(perc);
            results[i][3] = grade;
            results[i][4] = getRemark(grade);
        }
        return results;
    }
    public static String getGrade(double perc) {
        if (perc >= 80) return "A";
        if (perc >= 70) return "B";
        if (perc >= 60) return "C";
        if (perc >= 50) return "D";
        if (perc >= 40) return "E";
        return "R";
    }
    public static String getRemark(String grade) {
        switch (grade) {
            case "A": return "Level 4 (Above Standards)";
            case "B": return "Level 3 (At Standards)";
            case "C": return "Level 2 (Below Standards)";
            case "D": return "Level 1 (Well Below Standards)";
            case "E": return "Level 1- (Too Below Standards)";
            default: return "Remedial (Needs Improvement)";
        }
    }
    public static void displayScorecard(int[][] marks, Object[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAvg\tPerc\tGrade\tRemarks");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f%%\t%s\t%s\n",
                (i + 1), marks[i][0], marks[i][1], marks[i][2], (int) results[i][0], results[i][1], results[i][2], results[i][3], results[i][4]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        int[][] marks = generateMarks(numStudents);
        Object[][] results = calculateResults(marks);
        displayScorecard(marks, results);
        sc.close();
    }
}
