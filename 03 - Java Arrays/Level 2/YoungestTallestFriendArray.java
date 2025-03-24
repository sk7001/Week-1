import java.util.Scanner;
public class YoungestTallestFriendArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];
        for(int i = 0; i <3; i++){
            System.out.println("Please enter the age of " + names[i]);
            ages[i] = scanner.nextInt();
            System.out.println("Please enter the height of " + names[i]);
            heights[i] = scanner.nextInt();
        }
        int smallestAge = ages[0], maxHeight = heights[0], indexOfsmallAge=0, indexOfMaxHeight=0;
        for(int i = 0; i<3; i++){
            if(ages[i]<smallestAge){
                smallestAge=ages[i];
                indexOfsmallAge = i;
            }
            if(heights[i]>maxHeight){
                maxHeight=heights[i];
                indexOfMaxHeight = i;
            }
        }
        System.out.println(names[indexOfsmallAge] + " is the youngest of all three");
        System.out.println(names[indexOfMaxHeight] + " is the tallest of all three");
        scanner.close();
    }
}
