import java.util.Scanner;
public class FactorsArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(), maxFactor = 10, index = 0;
        int[] factors = new int[maxFactor];
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                if(index == maxFactor){
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for(int j = 0; j < index; j++){
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        System.out.println("Factors of num " + number + " are:");
        for(int i = 0; i < index; i++){
            System.out.print(factors[i] + " ");
        }
        scanner.close();
    }
}
