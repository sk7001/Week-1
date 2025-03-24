/*
Problem 1
import java.util.Scanner;
public class extraStringsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase();
        scanner.close();
        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
*/

/*
Problem 2
import java.util.Scanner;
public class extraStringsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed String: " + reversed);
    }
}
*/

/*
Problem 3
import java.util.Scanner;
public class extraStringsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        boolean isPalindrome = true;
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
*/

/*
Problem 4
import java.util.Scanner;
public class extraStringsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        String result = "";
        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println("String after removing duplicates: " + result);
    }
}
*/

/*
Problem 5
import java.util.Scanner;
public class extraStringsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
    }
}
*/

/*
Problem 6
import java.util.Scanner;
public class extraStringsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainStr = scanner.nextLine();
        System.out.print("Enter the substring to count: ");
        String subStr = scanner.nextLine();
        scanner.close();
        int count = 0;
        int index = mainStr.indexOf(subStr);
        while (index != -1) {
            count++;
            index = mainStr.indexOf(subStr, index + subStr.length());
        }
        System.out.println("Occurrences of \"" + subStr + "\": " + count);
    }
}
*/

/*
Problem 7
import java.util.Scanner;
public class extraStringsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        StringBuilder toggledStr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggledStr.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledStr.append(Character.toUpperCase(ch));
            } else {
                toggledStr.append(ch);
            }
        }
        System.out.println("Toggled case string: " + toggledStr);
    }
}
*/

/*
Problem 8
import java.util.Scanner;
public class extraStringsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        scanner.close();
        int minLength = Math.min(str1.length(), str2.length());
        boolean areEqual = true;
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                areEqual = false;
                if (str1.charAt(i) < str2.charAt(i)) {
                    System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
                } else {
                    System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.");
                }
                return;
            }
        }
        if (areEqual) {
            if (str1.length() < str2.length()) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
            } else if (str1.length() > str2.length()) {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.");
            } else {
                System.out.println("Both strings are equal.");
            }
        }
    }
}
*/

/*
Problem 9
import java.util.Scanner;
public class extraStringsPractice {
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
*/

/*
Problem 10
import java.util.Scanner;
public class extraStringsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char chToRemove = scanner.next().charAt(0);
        scanner.close();
        String result = "";
        for (char ch : str.toCharArray()) {
            if (ch != chToRemove) {
                result += ch;
            }
        }
        System.out.println("Modified String: " + result);
    }
}
*/

/*
Problem 11
import java.util.Arrays;
import java.util.Scanner;
public class extraStringsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().toLowerCase().replaceAll("\\s", "");
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().toLowerCase().replaceAll("\\s", "");
        scanner.close();
        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
*/

/*
Problem 12
import java.util.Scanner;
public class extraStringsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.next();
        System.out.print("Enter the new word: ");
        String newWord = scanner.next();
        scanner.close();
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }
}
*/