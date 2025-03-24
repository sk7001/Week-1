import java.util.Scanner;
public class MostFrequentCharacterFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        int[] freq = new int[256];
        char mostFrequentChar = str.charAt(0);
        int maxCount = 0;
        for (char ch : str.toCharArray()) {
            freq[ch]++;
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequentChar = ch;
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}
