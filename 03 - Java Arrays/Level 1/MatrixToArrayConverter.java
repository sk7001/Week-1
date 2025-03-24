import java.util.Scanner;
public class MatrixToArrayConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows");
        int rows = scanner.nextInt();
        System.out.println("Please enter the number of columns");
        int columns = scanner.nextInt();
        int[][] matrix2D = new int[rows][columns];
        int[] matrix = new int[rows * columns];
        int index = 0;
        for(int i = 0; i < rows; i++){
            System.out.println("Please enter the elements for row " + (i+1) + " of array");
            for(int j = 0; j < columns; j++){
                matrix2D[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[index] = matrix2D[i][j];
                index++;
            }
        }
        System.out.println("The elements of 1D array are:");
        for(int i = 0; i < index; i++){
            System.out.print(matrix[i] + " ");
        }
        scanner.close();
    }
}
