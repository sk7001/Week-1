/*
Problem 1
import java.util.Scanner;

public class stringsLevel2Practice {
    public static int lengthOfText(String text){
        int count = 0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(IndexOutOfBoundsException e){
            return count;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int count = lengthOfText(text);
        System.out.println("Using manual charAt() method: " + count);
        System.out.println("Using built-in length() method: " + text.length());
        System.out.println((text.length()==count)?"Both the methods give same output":"Both the methods give different outputs");
        scanner.close();
    }
}
 */

/*
Problem 2
import java.util.Scanner;
public class stringsLevel2Practice {
    public static int lengthOfText(String text){
        int count = 0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(IndexOutOfBoundsException e){
            return count;
        }
    }
    public static String[] splitTextToWords(String text){
        int countOfLetters = lengthOfText(text);
        int countOfWords=1;
        for(int i = 0; i<countOfLetters; i++){
            if(text.charAt(i)==' '){
                countOfWords++;
            }
        }
        String[] words = new String[countOfWords];
        int start = 0, index = 0;
        for(int i = 0; i<countOfLetters; i++) {
            if(text.charAt(i)==' '){
                words[index++]=text.substring(start,i);
                start = i+1;
            }
        }
        words[index]=text.substring(start);
        return words;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = splitTextToWords(text);
        for (String word : words) {
            System.out.println(word);
        }
        scanner.close();
    }
}
 */

/*
Problem 3
import java.util.Scanner;
public class stringsLevel2Practice {
    public static int lengthOfText(String text){
        int count = 0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(IndexOutOfBoundsException e){
            return count;
        }
    }
    public static String[][] splitTextToWords(String text){
        int countOfLetters = lengthOfText(text);
        int countOfWords=1;
        for(int i = 0; i<countOfLetters; i++){
            if(text.charAt(i)==' '){
                countOfWords++;
            }
        }
        String[][] words = new String[countOfWords][2];
        int start = 0, index = 0;
        for(int i = 0; i<countOfLetters; i++) {
            if(text.charAt(i)==' '){
                words[index][0]=text.substring(start,i);
                words[index][1]=String.valueOf(lengthOfText(words[index][0]));
                index++;
                start = i+1;
            }
        }
        words[index][0]=text.substring(start);
        words[index][1]= String.valueOf(lengthOfText(words[index][0]));
        return words;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[][] words = splitTextToWords(text);
        for (String[] word : words) {
            for (int j = 0; j < 2; j++) {
                System.out.print(word[j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
*/

/*
Problem 4
import java.util.Scanner;
public class stringsLevel2Practice {
    public static int lengthOfText(String text){
        int count = 0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(IndexOutOfBoundsException e){
            return count;
        }
    }
    public static String[][] splitTextToWords(String text){
        int countOfLetters = lengthOfText(text);
        int countOfWords=1;
        for(int i = 0; i<countOfLetters; i++){
            if(text.charAt(i)==' '){
                countOfWords++;
            }
        }
        String[][] words = new String[countOfWords][2];
        int start = 0, index = 0;
        for(int i = 0; i<countOfLetters; i++) {
            if(text.charAt(i)==' '){
                words[index][0]=text.substring(start,i);
                words[index][1]=String.valueOf(lengthOfText(words[index][0]));
                index++;
                start = i+1;
            }
        }
        words[index][0]=text.substring(start);
        words[index][1]= String.valueOf(lengthOfText(words[index][0]));
        return words;
    }
    public static String[] shortestAndLongest(String text){
        String[][] words = splitTextToWords(text);
        String[] shortestAndLongest = new String[2];
        int indexOfLongest = 0, indexOfShortest = 0;
        int longest = Integer.parseInt(words[0][1]), shortest = Integer.parseInt(words[0][1]);
        for (int i = 0; i<words.length;i++ ) {
            if(longest<Integer.parseInt(words[i][1])){
                longest = Integer.parseInt(words[i][1]);
                indexOfLongest = i;
            }
            if(shortest>Integer.parseInt(words[i][1])){
                shortest = Integer.parseInt(words[i][1]);
                indexOfShortest = i;
            }
        }
        shortestAndLongest[0]=words[indexOfShortest][0];
        shortestAndLongest[1]=words[indexOfLongest][0];
        return shortestAndLongest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] shortestAndLongest = shortestAndLongest(text);
        System.out.println("Shortest : " + shortestAndLongest[0]);
        System.out.println("Longest : " + shortestAndLongest[1]);
        scanner.close();
    }
}
 */

/*
Problem 5
import java.util.Scanner;
public class stringsLevel2Practice{
    public static String checkVowelOrConsonant(char letter) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        if (!((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z'))) {
            return "Not a Letter";
        }
        if (letter <= 'Z') {
            letter+=32;
        }
        for(char c:vowels) {
            if (c == (char)letter ){
                return "Vowel";
            }
        }
        return "Consonant";
    }
    public static int[] countOfVowelsAndConsonants(String text){
        int countVowels = 0, countConsonants = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(int i = 0; i <text.length(); i++){
            if(checkVowelOrConsonant(text.charAt(i)).equals("Vowel")){
                countVowels++;
            }else if(checkVowelOrConsonant(text.charAt(i)).equals("Not a Letter")){

            }else{
                countConsonants++;
            }
        }
        return new int[]{countVowels, countConsonants};
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int[] count = countOfVowelsAndConsonants(text);
        System.out.println("Vowels : " + count[0]);
        System.out.println("Consonants : " + count[1]);
    }
}
 */

/*
Problem 6
import java.util.Scanner;
public class stringsLevel2Practice{
    public static String checkVowelOrConsonant(char letter) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        if (!((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z'))) {
            return "Not a Letter";
        }
        if (letter <= 'Z') {
            letter+=32;
        }
        for(char c:vowels) {
            if (c == (char)letter ){
                return "Vowel";
            }
        }
        return "Consonant";
    }
    public static String[][] outputOfVowelsAndConsonants(String text){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String[][] words = new String[text.length()][2];
        for(int i = 0; i <text.length(); i++){
            if(checkVowelOrConsonant(text.charAt(i)).equals("Vowel")){
                words[i][0]= Character.toString(text.charAt(i));
                words[i][1]= "Vowel";
            }else if(checkVowelOrConsonant(text.charAt(i)).equals("Not a Letter")){
                words[i][0]= Character.toString(text.charAt(i));
                words[i][1]= "Not a Letter";
            }else{
                words[i][0]= Character.toString(text.charAt(i));
                words[i][1]= "Consonant";
            }
        }
        return words;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[][] words = outputOfVowelsAndConsonants(text);
        for(String[] word:words){
            System.out.println(word[0] + " : " + word[1]);
        }
    }
}
*/

/*
Problem 7
import java.util.Scanner;
public class stringsLevel2Practice {
    public static int[] getStartAndEnd(String text){
        int start = 0, end = 0;
        for(int i = 0; i<text.length(); i++){
            if((text.charAt(i)>='a' && text.charAt(i)<='z')||(text.charAt(i)>='A' && text.charAt(i)<='Z')){
                start = i;
                break;
            }
        }
        for(int i = text.length()-1; i>=0; i--){
            if((text.charAt(i)>='a' && text.charAt(i)<='z')||(text.charAt(i)>='A' && text.charAt(i)<='Z')){
                end = i;
                break;
            }
        }
        return new int[] {start,end};
    }
    public static String trimFromStartToEnd(String text){
        int[] startAndEnd = getStartAndEnd(text);
        String trimmedText = "";
        for(int i = startAndEnd[0]; i<=startAndEnd[1]; i++){
            trimmedText+=text.charAt(i);
        }
        return trimmedText;
    }
    public static boolean compareBoth(String text){
        String trimmedText = trimFromStartToEnd(text);
        return trimmedText.equals(text.trim());
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Are both the methods give same output ? " + compareBoth(text));
    }
}
*/

/*
Problem 8
import java.util.Scanner;
public class stringsLevel2Practice {
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
            System.out.format("%2s  %4s\n",checkVote[i][0],checkVote[i][1]);
        }
        scanner.close();
    }
}
 */

/*
Problem 9
import java.util.Scanner;
public class stringsLevel2Practice {
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
        avgAndPercentage[1][2] = String.valueOf( (float)computerWon/numberOfGames*100);
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
    static int userWon = 0;
    static int computerWon = 0;
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
 */

/*
Problem 10
import java.util.Scanner;
public class stringsLevel2Practice {
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
 */
