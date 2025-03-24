import java.util.Scanner;
public class CalendarPrinter {
    public static String monthName(int monthNumber) {
        String[] names = {"January", "February", "March", "April", "May", "June",
"July", "August", "September", "October", "November", "December"};
        return names[monthNumber-1];
    }
    public static int daysInMonth(int monthNumber, int yearNumber){
        int[] numberOfDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(yearNumber%4==0 && (yearNumber%100!=0 || yearNumber%400==0)){
            numberOfDays[1]=29;
        }
        return numberOfDays[monthNumber-1];
    }
    public static int getFirstDay(int m, int y){
        int d = 1;
        int yo = y - (14 - m) / 12;
        int x = yo + yo/4 - yo/100 + yo/400;
        int mo = m + 12 * ((14 - m)/12) - 2;
        return (d + x + 31 * mo / 12) % 7;
    }
    public static void displayCalender(int month, int year){
        int numberOfDays = daysInMonth(month,year);
        String monthName = monthName(month);
        int firstDay = getFirstDay(month, year);
        System.out.println(" " + monthName + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        int yearNumber = scanner.nextInt();
        displayCalender(monthNumber, yearNumber);
        scanner.close();
    }
}
