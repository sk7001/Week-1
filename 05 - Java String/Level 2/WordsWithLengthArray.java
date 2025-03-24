import java.util.Scanner;
public class WordsWithLengthArray {
    public static int lengthOfText(String text){
        int count = 0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(IndexOutOfBoundsException e){
            return count;
        }
    }
    public static String[][] splitTextToWords(String text){
        int countOfLetters = lengthOfText(text);
        int countOfWords=1;
        for(int i = 0; i<countOfLetters; i++){
            if(text.charAt(i)==' '){
                countOfWords++;
            }
        }
        String[][] words = new String[countOfWords][2];
        int start = 0, index = 0;
        for(int i = 0; i<countOfLetters; i++) {
            if(text.charAt(i)==' '){
                words[index][0]=text.substring(start,i);
                words[index][1]=String.valueOf(lengthOfText(words[index][0]));
                index++;
                start = i+1;
            }
        }
        words[index][0]=text.substring(start);
        words[index][1]= String.valueOf(lengthOfText(words[index][0]));
        return words;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[][] words = splitTextToWords(text);
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(words[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
