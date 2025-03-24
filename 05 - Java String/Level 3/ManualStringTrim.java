import java.util.Scanner;
public class ManualStringTrim {
    public static int[] getStartAndEnd(String text){
        int start = 0, end = 0;
        for(int i = 0; i<text.length(); i++){
            if((text.charAt(i)>='a' && text.charAt(i)<='z')||(text.charAt(i)>='A' && text.charAt(i)<='Z')){
                start = i;
                break;
            }
        }
        for(int i = text.length()-1; i>=0; i--){
            if((text.charAt(i)>='a' && text.charAt(i)<='z')||(text.charAt(i)>='A' && text.charAt(i)<='Z')){
                end = i;
                break;
            }
        }
        return new int[] {start,end};
    }
    public static String trimFromStartToEnd(String text){
        int[] startAndEnd = getStartAndEnd(text);
        String trimmedText = "";
        for(int i = startAndEnd[0]; i<=startAndEnd[1]; i++){
            trimmedText+=text.charAt(i);
        }
        return trimmedText;
    }
    public static boolean compareBoth(String text){
        String trimmedText = trimFromStartToEnd(text);
        return trimmedText.equals(text.trim());
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Are both the methods give same output ? " + compareBoth(text));
    }
}
