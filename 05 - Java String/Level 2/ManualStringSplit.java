import java.util.Scanner;
public class ManualStringSplit {
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static String[] splitText(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        String[] words = new String[count];
        int start = 0, index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start);
        return words;
    }
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] manualSplit = splitText(text);
        String[] builtInSplit = text.split(" ");
        for (String word : manualSplit) {
            System.out.println(word);
        }
        System.out.println(compareStringArrays(manualSplit, builtInSplit) ? "Both methods produce the same result" : "Methods produce different results");
        scanner.close();
    }
}
