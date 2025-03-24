import java.util.Scanner;
public class MatrixManipulation {
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int) (Math.random() * 10);
        return matrix;
    }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, common = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }
    public static int[][] transposeMatrix(int[][] A) {
        int rows = A.length, cols = A[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = A[i][j];
        return transposed;
    }
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) return null;
        double[][] inverse = {
                {matrix[1][1] / (double) det, -matrix[0][1] / (double) det},
                {-matrix[1][0] / (double) det, matrix[0][0] / (double) det}
        };
        return inverse;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row)
                System.out.print(elem + "\t");
            System.out.println();
        }
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double elem : row)
                System.out.printf("%.2f\t", elem);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for matrices: ");
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] A = generateMatrix(rows, cols);
        int[][] B = generateMatrix(rows, cols);
        System.out.println("\nMatrix A:");
        displayMatrix(A);
        System.out.println("\nMatrix B:");
        displayMatrix(B);
        System.out.println("\nAddition:");
        displayMatrix(addMatrices(A, B));
        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrices(A, B));
        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(A));
        if (rows == cols && (rows == 2 || rows == 3)) {
            if (rows == 2) {
                System.out.println("\nDeterminant of A: " + determinant2x2(A));
                double[][] inverse = inverse2x2(A);
                if (inverse != null) {
                    System.out.println("\nInverse of A:");
                    displayMatrix(inverse);
                } else {
                    System.out.println("\nMatrix A is non-invertible.");
                }
            } else {
                System.out.println("\nDeterminant of A: " + determinant3x3(A));
            }
        }
        sc.close();
    }
}
