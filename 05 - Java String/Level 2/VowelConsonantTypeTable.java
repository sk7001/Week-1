import java.util.Scanner;
public class VowelConsonantTypeTable{
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
        String[][] words = new String[text.length()][2];
        for(int i = 0; i <text.length(); i++){
            words[i][0]= Character.toString(text.charAt(i));
            words[i][1]= checkVowelOrConsonant(text.charAt(i));
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
