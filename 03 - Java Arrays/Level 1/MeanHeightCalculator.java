import java.util.Scanner;
public class MeanHeightCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        for(int i = 0; i < heights.length; i++){
            heights[i] = scanner.nextDouble();
        }
        for(int i = 0; i < heights.length; i++){
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.println(mean);
        scanner.close();
    }
}
