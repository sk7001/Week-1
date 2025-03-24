import java.util.Scanner;
public class FootballTeamHeightStats {
    public static double sumOfHeights(double[] heights){
        double sum = 0;
        for(int i = 0; i<heights.length; i++){
            sum+=heights[i];
        }
        return sum;
    }
    public static double meanOfHeights(double[] heights){
        double mean = 0;
        for(int i = 0; i<heights.length; i++){
            mean+=heights[i];
        }
        return mean/heights.length;
    }
    public static double minOfHeights(double[] heights){
        double min = heights[0];
        for(int i = 0; i<heights.length; i++){
            min = Math.min(min, heights[i]);
        }
        return min;
    }
    public static double maxOfHeights(double[] heights){
        double max = heights[0];
        for(int i = 0; i<heights.length; i++){
            max = Math.max(max, heights[i]);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double min=150, max=250;
        double[] heights = new double[11];
        for(int i = 0; i<heights.length; i++){
            heights[i] = min + Math.random()*((max-min+1));
        }
        double sumOfHeights = sumOfHeights(heights);
        double meanOfHeights = meanOfHeights(heights);
        double minOfHeights = minOfHeights(heights);
        double maxOfHeights = maxOfHeights(heights);
        System.out.println("Sum of heights are " + sumOfHeights);
        System.out.println("Mean of heights are " + meanOfHeights);
        System.out.println("Minimum of heights are " + minOfHeights);
        System.out.println("Maximum of heights are " + maxOfHeights);
        scanner.close();
    }
}
