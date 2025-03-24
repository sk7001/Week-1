import java.util.Scanner;
public class VotingEligibilityRandomAges {
    public static int[] randomAgeOfStudents(int number){
        int[] age = new int[number];
        for(int i=0;i<age.length;i++){
            age[i]=10+(int)(Math.random()*90);
        }
        return age;
    }
    public static String[][] checkVote(int[] age){
        String[][] array = new String[age.length][2];
        for(int i = 0; i<age.length;i++) {
            if (age[i] > 0) {
                array[i][0] = String.valueOf(age[i]);
                array[i][1] = String.valueOf(age[i] >= 18);
            }else{
                array[i][0] = String.valueOf(age[i]);
                array[i][1] = "false";
            }
        }
        return array;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] age = randomAgeOfStudents(number);
        String[][] checkVote = checkVote(age);
        for(int i = 0; i<number; i++){
            System.out.format("%2s %4s\n",checkVote[i][0],checkVote[i][1]);
        }
    }
}
