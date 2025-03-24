import java.util.Scanner; 
public class SquarePerimeterCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int side = scanner.nextInt(); 
        int perimeter = 4 * side; 
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter); 
    } 
} 
