import java.util.Scanner;
public class MultiplesBelow100ForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(), multiple = 0;
        if(number > 0 && number < 100) {
            for(int i = 100; i>=1; i--){
                multiple=number*i;
                if(multiple < 100){
                    System.out.println(multiple);
                }
            }
        }
        else{
            System.out.print("Please enter a number greater than 0 or less than 100");
        }
        scanner.close();
    }
}
