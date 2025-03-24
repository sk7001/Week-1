import java.util.Scanner;
public class DayOfWeekCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year");
        int y = scanner.nextInt();
        System.out.println("Please enter month");
        int m = scanner.nextInt();
        System.out.println("Please enter date");
        if(m<=12){
            int d = scanner.nextInt();
            int yo = y - (14 - m)/12;
            int x = yo + yo/4 - yo/100 + yo/400;
            int mo = m + 12 * ((14 - m) / 12) - 2;
            int Do = (d + x + 31 * mo / 12) % 7 ;
            System.out.println(Do);
        }else{
            System.out.println("The month you have entered " + m + " is invalid");
        }
        scanner.close();
    }
}
