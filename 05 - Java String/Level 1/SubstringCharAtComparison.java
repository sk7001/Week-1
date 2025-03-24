import java.util.Scanner;
public class SubstringCharAtComparison {
    public static String createSubstring(String text, int start, int end){
        String subString = "";
        for(int i = start; i<end; i++ ){
            subString+=text.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String subString = createSubstring(text, start, end);
        String subStringUsingSubstring = text.substring(start, end);
        System.out.println("The substring created using charAt is " + subString);
        System.out.println("The substring created using substring is " + subStringUsingSubstring);
        System.out.println((subString.equals(subStringUsingSubstring))?"Both the methods display the same result":"Both the methods don't display the same result");
        scanner.close();
    }
}
