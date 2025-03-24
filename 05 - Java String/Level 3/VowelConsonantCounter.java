import java.util.Scanner;
public class VowelConsonantCounter{
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
        for(int i = 0; i <text.length(); i++){
            if(checkVowelOrConsonant(text.charAt(i)).equals("Vowel")){
                countVowels++;
            }else if(checkVowelOrConsonant(text.charAt(i)).equals("Not a Letter")){
                continue;
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
