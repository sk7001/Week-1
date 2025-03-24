import java.util.Scanner;
public class StringComparisonCharAt {
    public static boolean compareUsingCharAt(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.next();
        String text2 = scanner.next();
        boolean checkUsingcharAt = compareUsingCharAt(text1, text2);
        boolean checkUsingEquals = text1.equals(text2);
        System.out.println("Comparison using charAt: " + checkUsingcharAt);
        System.out.println("Comparison using equals(): " + checkUsingEquals);
        System.out.println((checkUsingEquals==checkUsingcharAt)?"Both the methods display the same result":"Both the methods don't display the same result");
        scanner.close();
    }
}
