import java.util.Scanner;
public class ManualStringLength {
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
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int count = lengthOfText(text);
        System.out.println("Using manual charAt() method: " + count);
        System.out.println("Using built-in length() method: " + text.length());
        System.out.println((text.length()==count)?"Both the methods give same output":"Both the methods give different outputs");
        scanner.close();
    }
}
