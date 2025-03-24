import java.util.Scanner;
public class HandshakeCalculatorDuplicate {
    public static int totalHandShakes(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of students : ");
        int numberOfStudents = scanner.nextInt();
        int totalHandShakes = totalHandShakes(numberOfStudents);
        System.out.println("The number of possible hand shakes for " + numberOfStudents + " students are " + totalHandShakes);
        scanner.close();
    }
}
