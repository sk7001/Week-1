import java.util.Scanner;
public class RandomArrayStats {
    public static int[] generate4DigitRandomArray(int size){
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = (int)(Math.random() * 10000);
        }
        return array;
    }
    public double[] findAverageMinMax(int[] numbers){
        double average = 0, min = numbers[0], max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            average += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        average /= numbers.length;
        double[] results = {average, min, max};
        return results;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        RandomArrayStats obj = new RandomArrayStats();
        int size = scanner.nextInt();
        int[] results = obj.generate4DigitRandomArray(size);
        double[] averageMinMax = obj.findAverageMinMax(results);
        for(int i = 0; i < averageMinMax.length; i++){
            System.out.println(averageMinMax[i] + " ");
        }
        scanner.close();
    }
}
