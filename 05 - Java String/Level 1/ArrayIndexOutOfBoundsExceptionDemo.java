import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void generateException(String[] names, int index) {
        System.out.println(names[index]);
    }
    public static void handleException(String[] names, int index) {
        try {
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Index is out of bounds");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: An unexpected error occurred");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];
        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.next();
        }
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        scanner.close();
        generateException(names, index);
        handleException(names, index);
    }
}
