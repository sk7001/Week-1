import java.util.Scanner;
public class ArrayNumberAnalysisMethods {
    public static boolean isPositive(int number){
        return number > 0;
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static int compare(int number1, int number2){
        if(number1 > number2){
            return 1;
        }else if(number2 > number1){
            return -1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
        for(int i = 0; i < number.length; i++){
            number[i] = scanner.nextInt();
        }
        for(int i = 0; i < number.length; i++){
            System.out.println((isPositive(number[i])) ? number[i] + " is a positive integer" : number[i] + " is a negative integer");
            System.out.println((isEven(number[i])) ? number[i] + " is an even number" : number[i] + " is an odd number");
        }
        if(compare(number[0], number[number.length-1]) == 1){
            System.out.println("First number is greater than last number");
        }else if(compare(number[0], number[number.length-1]) == 0){
            System.out.println("First number is equal to last number");
        }else{
            System.out.println("First number is less than last number");
        }
        scanner.close();
    }
}
