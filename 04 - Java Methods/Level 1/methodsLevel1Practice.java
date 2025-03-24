/*
Problem 1
import java.util.Scanner;
public class methodsLevel1Practice{
	public static double simpleInterest(double principle, double rate, double time){
		return (principle * rate * time)/100;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the principle amount");
		double principle = scanner.nextDouble();
		System.out.println("Please enter the rate of interest: ");
		double rate = scanner.nextDouble();
		System.out.println("Please enter the time: ");
		double time = scanner.nextDouble();
		double simpleInterest = simpleInterest(principle, rate, time);
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principle + ", Rate of Interest " + rate + " and Time " + time );
		scanner.close();
	}
}
*/

/*
Problem 2 and 3
import java.util.Scanner;
public class methodsLevel1Practice{
	public static int totalHandShakes(int n){
		return (n*(n-1))/2;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of students : ");
		int numberOfStudents = scanner.nextInt();
		int totalHandShakes = totalHandShakes(numberOfStudents);
		System.out.println("The number of possible hand shakes for " + numberOfStudents + " students are " + totalHandShakes);
		scanner.close();
	}
}
*/

/*
Problem 4
import java.util.Scanner;
public class methodsLevel1Practice{
	public static double numberOfRounds(double side1, double side2, double side3){
		double perimeterOfTriangle = side1+side2+side3;
		return (5.0/perimeterOfTriangle);
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the length of side 1 : ");
		double side1 = scanner.nextDouble();
		System.out.println("Please enter the length of side 2 : ");
		double side2 = scanner.nextDouble();
		System.out.println("Please enter the length of side 3 : ");
		double side3 = scanner.nextDouble();
		double numberOfRounds = numberOfRounds(side1, side2, side3);
		System.out.println("The number of rounds are " + numberOfRounds);
		scanner.close();
	}
}
*/

/*
Problem 5
import java.util.Scanner;
public class methodsLevel1Practice{
	public static int checkNumber(int number){
		if(number>0){
			return 1;
		}else if(number<0){
			return -1;
		}else{
			return 0;
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number ");
		int number = scanner.nextInt();
		int checkNumber = checkNumber(number);
		System.out.println(checkNumber);
		scanner.close();
	}
}
*/

/*
Problem 6
import java.util.Scanner;
public class methodsLevel1Practice{
	public static void checkSpring(int month, int date){
		if(month > 3 && month < 6 || month == 3 && date >= 20 || month == 6 && date <= 20){
			System.out.println("It's a spring season.");			
		}else{
			System.out.println("Not a spring season.");
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of month ");
		int month = scanner.nextInt();
		System.out.println("Please enter the number of date ");
		int date = scanner.nextInt();
		checkSpring(month, date);
		scanner.close();
	}
}
*/

/*
Problem 7
import java.util.Scanner;
public class methodsLevel1Practice{
	public static void sumOfNaturalNumbers(int number){
		int sum = 0;
		for(int i = 0; i<=number; i++){
			sum += i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = scanner.nextInt();
		sumOfNaturalNumbers(number);
		scanner.close();
	}
}
*/

/*
Problem 8
import java.util.Scanner;
public class methodsLevel1Practice{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int smallest = number1, largest = number1;
		if(number1<number2 && number1<number3){
			smallest = number1;
		}else if(number2<number3){
			smallest = number2;
		}else{
			smallest = number3;
		}
		if(number1>number2 && number1>number3){
			largest = number1;
		}else if(number2>number3){
			largest = number2;
		}else{
			largest = number3;
		}
		
		return new int[]{smallest, largest};
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number 1:");
		int number1 = scanner.nextInt();
		System.out.println("Please enter number 2:");
		int number2 = scanner.nextInt();
		System.out.println("Please enter number 3:");
		int number3 = scanner.nextInt();
		int[] result = findSmallestAndLargest(number1, number2, number3);
		System.out.println("Smallest: " + result[0]);
		System.out.println("Largest: " + result[1]);
		scanner.close();
	}
}
*/

/*
Problem 9
import java.util.Scanner;
public class methodsLevel1Practice{
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int quotient = number/divisor;
		int remainder = number%divisor;
		return new int[]{quotient, remainder};
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = scanner.nextInt();
		System.out.println("Please enter the divisor");
		int divisor = scanner.nextInt();
		int[] results = findRemainderAndQuotient(number, divisor);
		System.out.println("Quotient :" + results[0]);
		System.out.println("Remainder :" + results[1]);
		scanner.close();
	}
}
*/

/*
Problem 10
import java.util.Scanner;
public class methodsLevel1Practice{
	public static int[] findRemainderAndQuotient(int chocolates, int students){
		int quotient = chocolates/students;
		int remainder = chocolates%students;
		return new int[]{quotient, remainder};
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of chocolates");
		int chocolates = scanner.nextInt();
		System.out.println("Please enter the number of students");
		int students = scanner.nextInt();
		int[] results = findRemainderAndQuotient(chocolates, students);
		System.out.println("Each child gets " + results[0] + " chocolates");
		System.out.println("Remaining chocolates : " + results[1]);
		scanner.close();
	}
}
*/

/*
Problem 11
import java.util.Scanner;
public class methodsLevel1Practice{
	public static double calculateWindChill(double temperature, double windSpeed){
		double calculateWindChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
		return calculateWindChill;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please give the temperature");
		double temperature = scanner.nextDouble();		
		System.out.println("Please give the wind speed");
		double windSpeed = scanner.nextDouble();
		double calculateWindChill = calculateWindChill(temperature, windSpeed);
		System.out.println("The wind chill temperature is " + calculateWindChill);
		scanner.close();
	}
}
*/

/*
Problem 12
import java.util.Scanner;
public class methodsLevel1Practice{
	public static double[] calculateTrigonometricFunctions(double angle){
		double radAngle = Math.toRadians(angle);
		double sine = Math.sin(radAngle);
		double cose = Math.cos(radAngle);
		double tangent = Math.tan(radAngle);
		return new double[] {sine, cose, tangent};
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the angle in degrees");
		double angle = scanner.nextDouble();
		double[] result = calculateTrigonometricFunctions(angle);
		System.out.println("Sine : " + result[0]);
		System.out.println("Cose : " + result[1]);
		System.out.println("Tangent : " + result[2]);
		scanner.close();
	}
}
*/