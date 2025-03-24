import java.util.Scanner;
public class SmallestAndLargestOfThreeMethod {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest = number1, largest = number1;
        if(number1<number2 && number1<number3){
            smallest = number1;
        }else if(number2<number3){
            smallest = number2;
        }else{
            smallest = number3;
        }
        if(number1>number2 && number1>number3){
            largest = number1;
        }else if(number2>number3){
            largest = number2;
        }else{
            largest = number3;
        }
        return new int[]{smallest, largest};
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1:");
        int number1 = scanner.nextInt();
        System.out.println("Please enter number 2:");
        int number2 = scanner.nextInt();
        System.out.println("Please enter number 3:");
        int number3 = scanner.nextInt();
        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
        scanner.close();
    }
}
