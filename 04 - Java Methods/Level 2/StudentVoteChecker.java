import java.util.Scanner;
public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if(age < 18 || age < 0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker obj = new StudentVoteChecker();
        int[] ageOfStudents = new int[10];
        System.out.println("Please enter ages of 10 students");
        for(int i = 0; i < ageOfStudents.length; i++){
            ageOfStudents[i] = scanner.nextInt();
        }
        for(int i = 0; i < ageOfStudents.length; i++){
            if(obj.canStudentVote(ageOfStudents[i])){
                System.out.println("Student " + (i+1) + " can vote.");
            }else{
                System.out.println("Student " + (i+1) + " cannot vote.");
            }
        }
        scanner.close();
    }
}
