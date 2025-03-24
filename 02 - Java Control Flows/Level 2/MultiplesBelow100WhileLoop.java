import java.util.Scanner;
public class MultiplesBelow100WhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= scanner.nextInt(), counter = 100 ;
        if(number<100 && number>0){
            while(counter>=1 ){
                int multiple = counter * number;
                if(multiple<100){
                    System.out.println(multiple);
                }
                counter--;
            }
        }else{
            System.out.println("The entered number is not a positive number or not less than 100.");
        }
        scanner.close();
    }
}
