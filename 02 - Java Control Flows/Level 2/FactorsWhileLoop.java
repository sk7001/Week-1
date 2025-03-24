import java.util.Scanner;
public class FactorsWhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= scanner.nextInt(), counter=1;
        while(counter!=number){
            if(number%counter==0){
                System.out.println(counter);
            }
            counter++;
        }
        scanner.close();
    }
}
