import java.util.Scanner; 
public class HandshakePossibilitiesCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int numberOfStudents = scanner.nextInt(); 
        int possibleHandShakes = (numberOfStudents * (numberOfStudents - 1)) / 2; 
        System.out.println("The possible handshakes are " + possibleHandShakes); 
    } 
} 
