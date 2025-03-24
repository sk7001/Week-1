/*
Problem 1
import java.util.Scanner;
public class stringsLevel1Practice {
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
*/

/*
Problem 2
import java.util.Scanner;
public class stringsLevel1Practice {
   public static String createSubstring(String text, int start, int end){
       String subString = “”;
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
      String sunStringUsingSubstring = text.substring(start, end);
      System.out.println("The substring created using chatAt is " + subString);
      System.out.println("The substring created using chatAt is " + sunStringUsingSubstring);
      System.out.println((subString.equals(sunStringUsingSubstring))?"Both the methods display the same result":"Both the methods don't display the same result");
      scanner.close();
  }
}
*/

/*
Problem 3
import java.util.Arrays;
import java.util.Scanner;
public class stringsLevel1Practice {
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
        System.out.println(checkSame(text)?"Both are same":"Both ar different");
    }
}
 */

/*
Problem 4
public class stringsLevel1Practice {
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
    }
    public static void main(String[] args) {
        generateException();
        handleException();
    }
}
*/

/*
Problem 5
import java.util.Scanner;
public class stringsLevel1Practice {
    public static void generateException(String input) {
        System.out.println(input.charAt(input.length()));
    }
    public static void handleException(String input) {
        try {
            System.out.println(input.charAt(input.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: Invalid index access");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        scanner.close();
        generateException(userInput);
        handleException(userInput);
    }
}
 */

/*
Problem 6
import java.util.Scanner;
public class stringsLevel3Practice {
    public static void generateException(String input) {
        System.out.println("Generating exception...");
        if (5 > 2) {
            throw new IllegalArgumentException("Start index cannot be greater than end index.");
        }
        System.out.println(input.substring(5, 2));
    }
    public static void handleException(String input) {
        try {
            System.out.println("Handling exception...");
            if (5 > 2) {
                throw new IllegalArgumentException("Start index cannot be greater than end index.");
            }
            System.out.println(input.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: An unexpected error occurred.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        scanner.close();
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        handleException(userInput);
    }
}
*/

/*
Problem 7
import java.util.Scanner;
public class stringsLevel1Practice {
    public static void generateException(String input) {
        System.out.println(Integer.parseInt(input));
    }
    public static void handleException(String input) {
        try {
            System.out.println(Integer.parseInt(input));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Input is not a valid integer");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: An unexpected error occurred");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = scanner.next();
        scanner.close();
        generateException(userInput);
        handleException(userInput);
    }
}
*/

/*
Problem 8
import java.util.Scanner;
public class stringsLevel1Practice {
    public static void generateException(String[] names, int index) {
        System.out.println(names[index]);
    }
    public static void handleException(String[] names, int index) {
        try {
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Index is out of bounds");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: An unexpected error occurred");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];
        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.next();
        }
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        scanner.close();
        generateException(names, index);
        handleException(names, index);
    }
}
*/

/*
Problem 9
import java.util.Scanner;
public class stringsLevel1Practice {
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();
        scanner.close();
        String manualUppercase = convertToUpperCase(userInput);
        String builtInUppercase = userInput.toUpperCase();
        boolean isEqual = compareStrings(manualUppercase, builtInUppercase);
        System.out.println("Converted Text: " + manualUppercase);
        System.out.println("Built-in Converted Text: " + builtInUppercase);
        System.out.println("Are both results same? " + isEqual);
    }
}
 */

/*
Problem 10
import java.util.Scanner;
public class stringsLevel1Practice {
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();
        scanner.close();
        String manualLowercase = convertToLowerCase(userInput);
        String builtInLowercase = userInput.toLowerCase();
        boolean isEqual = compareStrings(manualLowercase, builtInLowercase);
        System.out.println("Converted Text: " + manualLowercase);
        System.out.println("Built-in Converted Text: " + builtInLowercase);
        System.out.println("Are both results same? " + isEqual);
    }
}
 */