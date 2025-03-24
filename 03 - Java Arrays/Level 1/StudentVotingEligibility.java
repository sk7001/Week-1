import java.util.Scanner;
public class StudentVotingEligibility {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] ageOfStudents = new int[10];
        for(int i = 0; i < ageOfStudents.length; i++){
            ageOfStudents[i] = scanner.nextInt();
        }
        for(int i = 0; i < ageOfStudents.length; i++){
            if(ageOfStudents[i] >= 18){
                System.out.println("The student with the age " + ageOfStudents[i] + " can vote.");
            }else if(ageOfStudents[i] < 0){
                System.out.println("Invalid age");
            }else{
                System.out.println("The student with the age " + ageOfStudents[i] + " cannot vote.");
            }
        }
        scanner.close();
    }
}
