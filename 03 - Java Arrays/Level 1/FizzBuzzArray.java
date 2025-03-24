import java.util.Scanner;
public class FizzBuzzArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String[] results = new String[number];
        for(int i = 0; i < number; i++){
            if(i % 3 == 0 && i % 5 == 0){
                results[i] = "FizzBuzz";
            }else if(i % 3 == 0){
                results[i] = "Fizz";
            }else if(i % 5 == 0){
                results[i] = "Buzz";
            }else{
                results[i] = Integer.toString(i);
            }
        }
        for(int i = 0; i < number; i++){
            System.out.println("Position " + i + " = " + results[i]);
        }
        scanner.close();
    }
}
