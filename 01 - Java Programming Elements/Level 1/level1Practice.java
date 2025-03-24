/*
Problem 1
public class level1Practice{
	public static void main(String[] args){
		int harryBirthYear = 2000, currentYear = 2024;
		int harryAge = currentYear - harryBirthYear;
		System.out.println("Age of Harry is "+harryAge);
	}
}
*/

/*
Problem 2
public class level1Practice{
	public static void main(String[] args){
		int maths = 94, physics = 95, chemistry = 96;
		float averageMarks = (maths+physics+chemistry)/3;
		System.out.println("Sam's average marks is "+averageMarks);
	}
}
*/

/*
Problem 3
public class level1Practice{
	public static void main(String[] args){
		double kilometer = 10.8;
		double miles = kilometer * 0.6213711922;
		System.out.println("The distance "+ kilometer +" km in miles is " + miles +" miles");
	}
}
*/

/*
Problem 4
public class level1Practice{
	public static void main(String[] args){
		int costPrice = 129, sellingPrice = 191;
		int profit =  sellingPrice - costPrice ;
		double profitPercentage = (double)profit/costPrice*100;
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
		System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}
*/


/*
Problem 5
public class level1Practice{
	public static void main(String[] args){
		int totalPens = 14, totalStudents = 3;
		int pensEachStudent = totalPens/totalStudents;
		int remainingPens = totalPens%totalStudents;
		System.out.println("The Pen Per Student is " + pensEachStudent + " and the remaining pen not distributed is " + remainingPens );
	}
}
*/

/*
Problem 6
public class level1Practice{
	public static void main(String[] args){
		int fee = 125000, discountPercent = 10;
		float discount = (float) fee * discountPercent / 100;
		float discountedFee = fee - discount;
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee );
	}
}
*/

/*
Problem 7
public class level1Practice{
	public static double volumeOfEarth(double radiusOfEarth){
		return (4.0/3.0)* Math.PI * Math.pow(radiusOfEarth, 3);
	}
	
	public static void main(String[] args){
		double radiusOfEarthInKm = 6378;
		double radiusOfEarthInMiles = radiusOfEarthInKm *0.6213711922;
		double volumeOfEarthInKm = volumeOfEarth(radiusOfEarthInKm);
		double volumeOfEarthInMiles = volumeOfEarth(radiusOfEarthInMiles);
		System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthInKm + " and cubic miles is " + volumeOfEarthInMiles );
	}
}
*/

/*
Problem 8
import java.util.Scanner;
public class level1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int kilometers = scanner.nextInt();
		double miles = kilometers * 0.6213711922;
		System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
	}
}
*/

/*
Problem 9
import java.util.Scanner;
public class level1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int fee = scanner.nextInt(), discountPercent = scanner.nextInt();
		float discount = (float) fee * discountPercent / 100;
		float discountedFee = fee - discount;
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee );
	}
}
*/

/*
Problem 10
import java.util.Scanner;
public class level1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float cm = scanner.nextFloat();
		double inch = cm * 0.393701;
		double foot = inch * 0.0833333;
		System.out.println("Your Height in cm is " + cm + " while in feet is " + foot + " and inches is " + inch );
	}
}
*/

/*
Problem 11
import java.util.Scanner;
public class level1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float number1 = scanner.nextFloat(), number2 = scanner.nextFloat();
		float addition = number1 + number2;
		float subtraction = number1 - number2;
		double multiplication =  number1 * number2;
		double division = number1 / number2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + "," + subtraction + "," + multiplication +",and " + division);
	}
}
*/

/*
Problem 12
import java.util.Scanner;
public class level1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double heightInCm = scanner.nextFloat(), baseInCm = scanner.nextFloat();
		double heightInInches = heightInCm * 0.393701, baseIninches = baseInCm * 0.393701;
		double areaInCm = 1.0/2.0*(baseInCm*heightInCm), areaInInches = 1.0/2.0*(baseIninches*heightInInches);
		System.out.println("The area of Triangle with base " + baseInCm + " and height " + heightInCm + " is " + areaInCm + " in square cm and " + areaInInches + " in square inches");
	}
}
*/


/*
Problem 13
import java.util.Scanner;
public class level1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int side = scanner.nextInt();
		int perimeter = 4 * side;
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
	}
}
*/

/*
Problem 14
import java.util.Scanner;
public class level1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int feets = scanner.nextInt();
		double yards = feets * 0.333333;
		double miles = yards * 0.000568182;
		System.out.println("The distance in feets is " + feets + " while the distance in yards is " + yards + " and miles is " + miles);
	}
}
*/

/*
Problem 15
import java.util.Scanner;
public class level1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float unitPrice = scanner.nextFloat(), quantity = scanner.nextFloat();
		float totalPrice = unitPrice * quantity;
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
	}
}
*/

/*
Problem 16
import java.util.Scanner;
public class level1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int numberOfStudents = scanner.nextInt();
		int possibleHandShakes = (numberOfStudents*(numberOfStudents-1))/2;
		System.out.println("The possible handshakes are " + possibleHandShakes);
	}
}
*/