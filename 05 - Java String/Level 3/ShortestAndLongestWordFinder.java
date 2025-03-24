import java.util.Scanner;
public class ShortestAndLongestWordFinder {
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
    public static String[] shortestAndLongest(String text){
        String[][] words = splitTextToWords(text);
        String[] shortestAndLongest = new String[2];
        int indexOfLongest = 0, indexOfShortest = 0;
        int longest = Integer.parseInt(words[0][1]), shortest = Integer.parseInt(words[0][1]);
        for (int i = 0; i<words.length;i++ ) {
            if(longest<Integer.parseInt(words[i][1])){
                longest = Integer.parseInt(words[i][1]);
                indexOfLongest = i;
            }
            if(shortest>Integer.parseInt(words[i][1])){
                shortest = Integer.parseInt(words[i][1]);
                indexOfShortest = i;
            }
        }
        shortestAndLongest[0]=words[indexOfShortest][0];
        shortestAndLongest[1]=words[indexOfLongest][0];
        return shortestAndLongest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] shortestAndLongest = shortestAndLongest(text);
        System.out.println("Shortest : " + shortestAndLongest[0]);
        System.out.println("Longest : " + shortestAndLongest[1]);
        scanner.close();
    }
}
