import java.util.Scanner;
public class CountdownWhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        while(counter!=0){
            System.out.println(counter);
            --counter;
        }
        scanner.close();
    }
}
