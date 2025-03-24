import java.util.Arrays;
import java.util.Scanner;
public class StringToCharArrayComparison {
    public static char[] stringToChar(String text){
        char[] letters = new char[text.length()];
        for(int i = 0; i<text.length(); i++){
            letters[i] = text.charAt(i);
        }
        return letters;
    }
    public static boolean checkSame(String text) {
        char[] letters = stringToChar(text);
        char[] lettersUsingBuiltIn = text.toCharArray();
        return Arrays.equals(letters, lettersUsingBuiltIn);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(checkSame(text)?"Both are same":"Both are different");
        scanner.close();
    }
}
