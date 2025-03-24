import java.util.Scanner;
public class RockPaperScissorsStats {
    static int userWon = 0;
    static int computerWon = 0;
    public static int getComputerChoice(){
        return (int)(Math.random()*3);
    }
    public static String checkWin(int userChoice){
        String[] tools = {"rock", "paper", "scissors"};
        String user = tools[userChoice];
        int computerChoice = getComputerChoice();
        String computer = tools[computerChoice];
        System.out.println("User : " + user);
        System.out.println("Computer : " + computer);
        if (user.equals("rock") && computer.equals("scissors")){
            userWon++;
            return "User won";
        } else if (user.equals("rock") && computer.equals("paper")) {
            computerWon++;
            return "Computer won";
        } else if(user.equals("scissors") && computer.equals("paper")){
            userWon++;
            return "User won";
        } else if(user.equals("scissors") && computer.equals("rock")){
            computerWon++;
            return "Computer won";
        } else if (user.equals("paper") && computer.equals("rock")) {
            userWon++;
            return "User won";
        }else if(user.equals("paper") && computer.equals("scissors")){
            computerWon++;
            return "Computer won";
        }else{
            return "Draw";
        }
    }
    public static String[][] averageAndPercentageOfWins(int numberOfGames){
        String[][] avgAndPercentage = new String[2][3];
        avgAndPercentage[0][0] = "User :";
        avgAndPercentage[0][1] = String.valueOf((float)userWon/numberOfGames);
        avgAndPercentage[0][2] = String.valueOf( (float)userWon/numberOfGames*100);
        avgAndPercentage[1][0] = "Computer :";
        avgAndPercentage[1][1] = String.valueOf((float)computerWon/numberOfGames);
        avgAndPercentage[1][2] = String.valueOf((float)computerWon/numberOfGames*100);
        return avgAndPercentage;
    }
    public static void displayResults(int k, int userChoice,int numberOfGames){
        String checkWin = checkWin(userChoice);
        System.out.println("Game " + (k+1) + " : " + checkWin);
        String[][] averageAndPercentageOfWins = averageAndPercentageOfWins(numberOfGames);
        if(k==numberOfGames-1){
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(averageAndPercentageOfWins[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of games you want to play");
        int numberOfGames = scanner.nextInt();
        for(int i = 0; i<numberOfGames; i++) {
            System.out.println("Please enter your input for game " + (i+1));
            System.out.println("0 for Rock, 1 for Paper, 2 for Scissors");
            int userChoice = scanner.nextInt();
            while (true) {
                if (userChoice >= 0 && userChoice <= 2) {
                    break;
                } else {
                    System.out.println("Please enter a valid number between 0 and 2.");
                    System.out.println("0 for Rock, 1 for Paper, 2 for Scissors");
                    userChoice = scanner.nextInt();
                }
            }
            displayResults(i, userChoice, numberOfGames);
        }
        scanner.close();
    }
}
