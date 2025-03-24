import java.util.Scanner;
public class ArrayNumberAnalysis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++){
            number[i] = scanner.nextInt();
        }
        for (int i = 0; i < number.length; i++){
            if(number[i]>0){
                System.out.println("Positive");
            }else if(number[i]<0){
                System.out.println("Negative");
            }else{
                System.out.println("Zero");
            }
        }
        for (int i = 0; i < number.length; i++){
            if(number[i]%2==0){
                System.out.println("Even number");
            }else{
                System.out.println("Odd number");
            }
        }
        if(number[number.length-1] > number[0]){
            System.out.println("First element is lesser than Last one");
        }else if(number[number.length-1] < number[0]){
            System.out.println("First element is greater than Last one");
        }else{
            System.out.println("First element is equal to Last one");
        }
        scanner.close();
    }
}
