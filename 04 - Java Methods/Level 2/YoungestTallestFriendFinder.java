import java.util.Scanner;
public class YoungestTallestFriendFinder {
    public static int findYoungest(int[] age){
        int youngest = age[0], index = 0;
        for(int i = 0; i < age.length; i++){
            if(youngest > age[i]){
                youngest = age[i];
                index = i;
            }
        }
        return index;
    }
    public static int findTallest(int[] height){
        int tallest = height[0], index = 0;
        for(int i = 0; i < height.length; i++){
            if(tallest < height[i]){
                tallest = height[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[names.length];
        int[] height = new int[names.length];
        for(int i = 0; i < names.length; i++){
            System.out.println("Please enter the age of " + names[i]);
            age[i] = scanner.nextInt();
            System.out.println("Please enter the height of " + names[i]);
            height[i] = scanner.nextInt();
        }
        int indexOfYoungest = findYoungest(age);
        int indexOfTallest = findTallest(height);
        System.out.println("The youngest of all " + names.length + " friends is " + names[indexOfYoungest] + " with an age of " + age[indexOfYoungest]);
        System.out.println("The tallest of all " + names.length + " friends is " + names[indexOfTallest] + " with a height of " + height[indexOfTallest]);
        scanner.close();
    }
}
