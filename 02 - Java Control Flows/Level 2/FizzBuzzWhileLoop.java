import java.util.Scanner;
public class FizzBuzzWhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>0){
            while(number!=0){
                if(number % 3 ==0 && number % 5 == 0){
                    System.out.println("FizzBuzz");
                }
                else if (number % 3 == 0){
                    System.out.println("Fizz");
                }
                else if (number % 5 == 0){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(number);
                }
                number--;
            }
        }else{
            System.out.println("The entered number is not a positive integer.");
        }
        scanner.close();
    }
}
