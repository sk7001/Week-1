import java.util.Scanner;
public class YoungestAndTallestFriendFinder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the age of Amar");
        int ageOfAmar= scanner.nextInt();
        System.out.println("Please enter the age of Akbar");
        int ageOfAkbar= scanner.nextInt();
        System.out.println("Please enter the age of Anthony");
        int ageOfAnthony= scanner.nextInt();
        System.out.println("Please enter the height of Amar");
        int heightOfAmar= scanner.nextInt();
        System.out.println("Please enter the height of Akbar");
        int heightOfAkbar= scanner.nextInt();
        System.out.println("Please enter the height of Anthony");
        int heightOfAnthony= scanner.nextInt();
        if(ageOfAmar<ageOfAkbar && ageOfAmar<ageOfAnthony){
            System.out.println("Amar is smallest of all three friends with an age of " + ageOfAmar);
        }
        else if(ageOfAkbar<ageOfAnthony){
            System.out.println("Akbar is smallest of all three friends with an age of " + ageOfAkbar);
        }
        else{
            System.out.println("Anthony is smallest of all three friends with an age of " + ageOfAnthony);
        }
        if(heightOfAmar>heightOfAkbar && heightOfAmar>heightOfAnthony){
            System.out.println("Amar is tallest of all three friends with a height of " + heightOfAmar);
        }
        else if(heightOfAkbar>heightOfAnthony){
            System.out.println("Akbar is tallest of all three friends with a height of " + heightOfAkbar);
        }
        else{
            System.out.println("Anthony is tallest of all three friends with a height of " + heightOfAnthony);
        }
        scanner.close();
    }
}
