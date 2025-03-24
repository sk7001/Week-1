/*
Problem 1
import java.util.Scanner;
public class stringsLevel3Practice {
    public static String[][] calculateBmiAndStatus(double[][] data) {
        String[][] bmiData = new String[10][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100; // Convert cm to meters
            double bmi = weight / (heightM * heightM); // BMI formula
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            bmiData[i][0] = String.valueOf((int) heightCm);
            bmiData[i][1] = String.valueOf((int) weight);
            bmiData[i][2] = String.format("%.2f", bmi);
            bmiData[i][3] = status;
        }
        return bmiData;
    }
    public static void displayBmiTable(String[][] bmiData) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-------------------------------------------");
        for (String[] row : bmiData) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = scanner.nextDouble();
        }
        String[][] bmiData = calculateBmiAndStatus(data);
        displayBmiTable(bmiData);
        scanner.close();
    }
}
*/

/*
Problem 2
import java.util.Scanner;
public class stringsLevel3Practice {
    public static int findLength(String text) {
        int length = 0;
        try {
            while (text.charAt(length) != '\0') length++;
        } catch (Exception e) {}
        return length;
    }
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < length; j++) {
                if (i != j && text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) uniqueChars[uniqueCount++] = currentChar;
        }
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] uniqueChars = findUniqueCharacters(input);
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) System.out.print(c + " ");
        scanner.close();
    }
}
*/

/*
Problem 3
import java.util.Scanner;
public class stringsLevel3Practice {
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char result = findFirstNonRepeatingCharacter(input);
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
        scanner.close();
    }
}
*/

/*
Problem 4
import java.util.Scanner;
public class stringsLevel3Practice {
    public static String[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        String[][] result = new String[256][2];
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[count][0] = String.valueOf((char) i);
                result[count][1] = String.valueOf(frequency[i]);
                count++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] frequencies = findCharacterFrequencies(input);
        System.out.println("Character frequencies:");
        for (String[] frequency : frequencies) {
            if (frequency[0] != null) {
                System.out.println(frequency[0] + " : " + frequency[1]);
            }
        }
        scanner.close();
    }
}
 */

/*
Problem 5
import java.util.Scanner;
public class stringsLevel3Practice {
    public static char[] uniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }
    public static String[][] findCharacterFrequencies(String text) {
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uniqueChars[i]) {
                    count++;
                }
            }
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(count);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] frequencies = findCharacterFrequencies(input);
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i][0] != null) {
                System.out.println(frequencies[i][0] + " : " + frequencies[i][1]);
            }
        }
        scanner.close();
    }
}
*/

/*
Problem 6
import java.util.Scanner;
public class stringsLevel3Practice {
    public static char[] uniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }
    public static String[][] findCharacterFrequencies(String text) {
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uniqueChars[i]) {
                    count++;
                }
            }
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(count);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] frequencies = findCharacterFrequencies(input);
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i][0] != null) {
                System.out.println(frequencies[i][0] + " : " + frequencies[i][1]);
            }
        }
        scanner.close();
    }
}
*/

/*
Problem 7
import java.util.Scanner;
public class stringsLevel3Practice {
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    public static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return new String(original).equals(new String(reversed));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text to check if it's a palindrome: ");
        String input = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Normalize input
        boolean result1 = isPalindromeIterative(input);
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean result3 = isPalindromeCharArray(input);
        System.out.println("Using Iterative Method: " + (result1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursive Method: " + (result2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Character Array Method: " + (result3 ? "Palindrome" : "Not a Palindrome"));
    }
}
*/

/*
Problem 8
import java.util.Scanner;
public class stringsLevel3Practice {
    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        int[] charCount = new int[256];
        for (char c : text1.toCharArray()) {
            charCount[c]++;
        }
        for (char c : text2.toCharArray()) {
            charCount[c]--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String text1 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        System.out.print("Enter second text: ");
        String text2 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        scanner.close();
        System.out.println(areAnagrams(text1, text2) ? "Anagrams" : "Not Anagrams");
    }
}
*/

/*
Problem 9
import java.util.Scanner;
public class stringsLevel3Practice {
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }
    public static void displayCalendar(int month, int year) {
        System.out.println("\n  " + getMonthName(month) + " " + year);
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%5d", day);
            if ((firstDay + day) % 7 == 0 || day == daysInMonth) {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.close();
        displayCalendar(month, year);
    }
}
*/

/*
Problem 10
import java.util.Random;
import java.util.Scanner;
public class stringsLevel3Practice {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardIndex = i + random.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardIndex];
            deck[randomCardIndex] = temp;
        }
    }
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards * numPlayers > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }
        String[][] players = new String[numPlayers][numCards];
        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }
    public static void printPlayersCards(String[][] players) {
        if (players == null) return;
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Enter number of cards per player: ");
        int numCards = scanner.nextInt();
        scanner.close();
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] players = distributeCards(deck, numCards, numPlayers);
        printPlayersCards(players);
    }
}
*/