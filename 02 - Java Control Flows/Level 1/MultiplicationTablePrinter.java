import java.util.Scanner;
public class MultiplicationTablePrinter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number renging from 6 to 9:");
        int number = scanner.nextInt();
        if(number>=6 && number<=9){
            for(int i = 1; i <=10; i++){
                System.out.println(number + " x " + i + " = " + (number*i));
            }
        }else{
            System.out.println("The user input number doesn not range from 6 to 9.");
        }
        scanner.close();
    }
}
