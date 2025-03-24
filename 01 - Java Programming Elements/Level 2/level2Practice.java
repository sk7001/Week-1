/*
Problem 1
import java.util.Scanner;
public class level2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt(), number2 = scanner.nextInt();
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2 );
	}
}
*/

/*
Problem 2
import java.util.Scanner;
public class level2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
		float operation1 = a + b * c, operation2 = a * b + c, operation3 = c + (float)a / b, operation4 = a % b + c;
		System.out.println("The results of Int Operations are " + operation1 + "," + operation2 + "," + operation3 + ",and " + operation4 );
	}
}
*/

/*
Problem 3
import java.util.Scanner;
public class level2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
		double operation1 = a + b * c, operation2 = a * b + c, operation3 = c + a / b, operation4 = a % b + c;
		System.out.println("The results of Int Operations are " + operation1 + "," + operation2 + "," + operation3 + ",and " + operation4 );
	}
}
*/

/*
Problem 4
import java.util.Scanner;
public class level2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float celsius = scanner.nextFloat();
		double farhenheit = (celsius * 9/5)+32;
		System.out.println("The " + celsius + " celsius is " + farhenheit + " fahrenheit");
	}
}
*/

/*
Problem 5
import java.util.Scanner;
public class level2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float farhenheit = scanner.nextFloat();
		double celsius = (farhenheit - 32) * 5/9;
		System.out.println("The " + farhenheit + " farhenheit is " + celsius + " celsius");
	}
}
*/

/*
Problem 6
import java.util.Scanner;
public class level2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int salary = scanner.nextInt(), bonus = scanner.nextInt();
		int totalIncome = salary + bonus;
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
	}
}
*/

/*
Problem 7
import java.util.Scanner;
public class level2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt(), number2 = scanner.nextInt();
		System.out.println("The input numbers are " + number1 +" and " + number2);
		number1 = number1+number2-(number2=number1);
		System.out.println("The swapped numbers are " + number1 +" and " + number2);
	}
}
*/

/*
Prroblem 8
import java.util.Scanner;
public class level2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scanner.nextLine();	
		System.out.println("Enter from city");
		String fromCity = scanner.nextLine();		
		System.out.println("Enter via city");
		String viaCity = scanner.nextLine();		
		System.out.println("Enter to city");
		String toCity = scanner.nextLine();
		
		System.out.println("Enter distance from " + fromCity + " to " + viaCity );
		float fromToVia = scanner.nextFloat();
		System.out.println("Enter distance from " + viaCity + " to " + toCity);
		float viaToFinalCity = scanner.nextFloat();		
		
		System.out.println("Enter the total time from " + fromCity + " to " + toCity );
		int totalTime = scanner.nextInt();
		
		float totalDistance = fromToVia + viaToFinalCity;
		
		float averageSpeed = totalDistance/totalTime;

		System.out.println("Traveller : " + name);
		System.out.println("Route : " + fromCity + "--(" + fromToVia +")-->" + viaCity + "--(" + viaToFinalCity +")-->" + toCity);
		System.out.println("Total Distance : " + totalDistance);
		System.out.println("Total Time : " + totalTime);
		System.out.println("Average Speed : " + averageSpeed);
	}
}
*/

/*
Problem 9
import java.util.Scanner;
public class level2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the length of sides of the triangular park:");
		float side1 = scanner.nextFloat(), side2 = scanner.nextFloat(), side3 = scanner.nextFloat();
		float numberOfRounds = 5/(side1 + side2 + side3);
		System.out.println("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km");
	}
}
*/

/*
Problem 10
import java.util.Scanner;
public class level2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int numberOfChocoltes = scanner.nextInt(), numberOfChildren = scanner.nextInt();
		int numberOfChocolatesEachChildGets = numberOfChocoltes/numberOfChildren;
		int numberOfChocolatesRemaining = numberOfChocoltes%numberOfChildren;
		System.out.println("The number of chocolates each child gets is " + numberOfChocolatesEachChildGets + " and the number of remaining chocolates are " + numberOfChocolatesRemaining);
	}
}
*/

/*
Problem 12
import java.util.Scanner;
public class level2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int principle = scanner.nextInt(), rate = scanner.nextInt(), time = scanner.nextInt();
		float simpleInterest = (principle * rate * time)/100;
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principle + ", Rate of Interest " + rate + " and Time " +  time);
	}
}
*/

/*
Problem 12
import java.util.Scanner;
public class level2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the weight in pounds");
		float weightInPounds = scanner.nextInt();
		float weightInKgs = weightInPounds * (float)2.2;
		System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKgs);
	}
}
*/