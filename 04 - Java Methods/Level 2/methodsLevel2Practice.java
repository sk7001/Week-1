/*
Problem 1
import java.util.Scanner;
public class methodsLevel2Practice{
	public static int[] factors(int number){
		int count = 0;
		for(int i = 1; i<number; i++){
			if(number%i==0){
				count++;
			}
		}
		int[] factors = new int[count];
		int j=0;
		for(int i =1; i<number; i++){
			if(number%i==0){
				factors[j]=i;
				j++;
			}
		}
		return factors;
	}
	public static int sum(int[] factors){
		int sum = 0;
		for(int i=0; i<factors.length; i++){
			sum+=factors[i];
		}
		return sum;
	}	
	public static int product(int[] factors){
		int product = 1;
		for(int i=0; i<factors.length; i++){
			product*=factors[i];
		}
		return product;
	}
	public static int sumOfSquares(int[] factors){
		int sumOfSquares = 0;
		for(int i=0; i<factors.length; i++){
			sumOfSquares+=Math.pow(factors[i], 2);
		}
		return sumOfSquares;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = scanner.nextInt();
		int[] results = factors(number);
		System.out.println("The factors are of " + number + "are: ");
		for(int i = 0; i<results.length; i++){
			System.out.println(results[i] + " ");
		}
		int sum = sum(results);
		System.out.println("The sum of factors is " + sum);		
		int product = product(results);
		System.out.println("The product of factors is " + product);		
		int sumOfSquares = sumOfSquares(results);
		System.out.println("The sum of squares of factors is " + sumOfSquares);
		scanner.close();
	}
}
*/

/*
Problem 2
import java.util.Scanner;
public class methodsLevel2Practice{
	public static int sumOfNaturalNumbersUsingRecursion(int number){
		if(number==0){
			return 0;
		}
		return number+sumOfNaturalNumbersUsingRecursion(number-1);
	}
	public static int sumOfNaturalNumbersUsingFormulae(int number){
		int sum = number * (number + 1)/2;
		return sum;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = scanner.nextInt();
		int sumOfNaturalNumbersUsingRecursion = sumOfNaturalNumbersUsingRecursion(number);
		int sumOfNaturalNumbersUsingFormulae = sumOfNaturalNumbersUsingFormulae(number);
		System.out.println("Sum of natural numbers using recursion method : " + sumOfNaturalNumbersUsingRecursion);
		System.out.println("Sum of natural numbers using formulae : " + sumOfNaturalNumbersUsingFormulae);
		if(sumOfNaturalNumbersUsingFormulae==sumOfNaturalNumbersUsingRecursion){
			System.out.println("Both are same");
		}else{
			System.out.println("Both are not same");
		}
		scanner.close();
	}
}
*/

/*
Problem 3
import java.util.Scanner;
public class methodsLevel2Practice{
	public static boolean checkLeapYear(int year){
		if(year>=1582 && (year%4==0 && (year%100!=0 || year%400==0))){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if(checkLeapYear(year)){
			System.out.println( year + " is a leap year");
		}else{
			System.out.println( year + " is not a leap year");
		}
		scanner.close();
	}
}
*/

/*
Problem 4
import java.util.Scanner;
public class methodsLevel2Practice{
	public static double convertKmToMiles(double km){
		double km2miles = 0.621371;
		return km*km2miles;
	}
	public static double convertMilesToKm(double miles){
		double miles2km = 1.60934;
		return miles*miles2km;
	}
	public static double convertMetersToFeet(double meters){
		double meters2feet = 3.28084;	
		return meters*meters2feet;
	}	
	public static double convertFeetToMeters(double feet){
		double feet2meters = 0.3048;	
		return feet*feet2meters;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter kilometers to convert to miles");
		double km = scanner.nextDouble();
		double resultkm2miles = convertKmToMiles(km);
		System.out.println( km + " kilometers converted to miles is " + resultkm2miles);

		System.out.println("Please enter miles to convert to kilometers");
		double miles = scanner.nextDouble();
		double resultmiles2km = convertMilesToKm(miles);
		System.out.println( miles + " miles converted to kilometers is " + resultmiles2km);

		System.out.println("Please enter meters to convert to feet");
		double meters = scanner.nextDouble();
		double resultmeters2feet = convertMetersToFeet(meters);
		System.out.println( meters + " meters converted to feet is " + resultmeters2feet);

		System.out.println("Please enter feet to convert to meters");
		double feet = scanner.nextDouble();
		double resultfeet2meters = convertFeetToMeters(feet);
		System.out.println( feet + " feet converted to meters is " + resultfeet2meters);
		scanner.close();
	}
}
*/

/*
Problem 5
import java.util.Scanner;
public class methodsLevel2Practice{
	public static double convertYardsToFeet(double yards){
		double yards2feet  = 3;
		return yards*yards2feet;
	}
	public static double convertFeetToYards(double feet){
		double feet2yards = 0.333333;
		return feet*feet2yards;
	}
	public static double convertMetersToInches(double meters){
		double meters2inches = 39.3701;	
		return meters*meters2inches ;
	}	
	public static double convertInchesToMeters(double inches){
		double inches2meters = 0.0254;	
		return inches*inches2meters;
	}	
	public static double convertInchesToCentimeters(double inches){
		double inches2cm = 2.54;	
		return inches*inches2cm ;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter yards to convert to feet");
		double yards = scanner.nextDouble();
		double resultyards2feet = convertYardsToFeet(yards);
		System.out.println( yards + " yards converted to feet is " + resultyards2feet);

		System.out.println("Please enter feet to convert to yards");
		double feet = scanner.nextDouble();
		double resultfeet2yards = convertFeetToYards(feet);
		System.out.println( feet + " feet converted to yards is " + resultfeet2yards);

		System.out.println("Please enter meters to convert to inches");
		double meters = scanner.nextDouble();
		double resultmeters2inches= convertMetersToInches(meters);
		System.out.println( meters + " meters converted to inches is " + resultmeters2inches);

		System.out.println("Please enter inches to convert to meters");
		double inches = scanner.nextDouble();
		double resultinches2meters = convertInchesToMeters(inches);
		System.out.println( inches + " inches converted to meters is " + resultinches2meters);
				
		System.out.println("Please enter inches to convert to centimeters");
		double inches2 = scanner.nextDouble();
		double resultinches2cm = convertInchesToCentimeters(inches2);
		System.out.println( inches2 + " inches converted to centimeters is " + resultinches2cm);

		scanner.close();
	}
}
*/

/*
Problem 6
import java.util.Scanner;
public class methodsLevel2Practice{
	public static double convertfarhenheit2celsius(double farhenheit){
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;	
		return farhenheit2celsius;
	}
	public static double convertcelsius2farhenheit(double celsius){
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
	}
	public static double convertpounds2kilograms(double pounds){
		double pounds2kilograms = 0.453592*pounds;	
		return pounds2kilograms ;
	}	
	public static double convertkilograms2pounds(double kilograms){
		double kilograms2pounds = 2.20462*kilograms; 	
		return kilograms2pounds;
	}	
	public static double convertgallons2liters(double gallons){
		double gallons2liters = 3.78541*gallons; 	
		return gallons2liters ;
	}	
	public static double convertliters2gallons(double liters){
		double liters2gallons = 0.264172*liters; 	
		return liters2gallons ;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter farhenheit to convert to celsius");
		double farhenheit = scanner.nextDouble();
		double resultfarhenheit2celsius  = convertfarhenheit2celsius(farhenheit);
		System.out.println( farhenheit + " farhenheit converted to celsius is " + resultfarhenheit2celsius);

		System.out.println("Please enter celsius to convert to farhenheit");
		double celsius = scanner.nextDouble();
		double resultcelsius2farhenheit  = convertcelsius2farhenheit (celsius);
		System.out.println( celsius + " celsius converted to farhenheit  is " + resultcelsius2farhenheit);

		System.out.println("Please enter pounds to convert to kilograms");
		double pounds = scanner.nextDouble();
		double resultpounds2kilograms = convertpounds2kilograms (pounds);
		System.out.println( pounds + " pounds converted to kilograms is " + resultpounds2kilograms );

		System.out.println("Please enter gallons to convert to liters");
		double gallons = scanner.nextDouble();
		double resultgallons2liters = convertgallons2liters (gallons);
		System.out.println( gallons + " gallons converted to liters is " + resultgallons2liters );
				
		System.out.println("Please enter liters to convert to gallons");
		double liters = scanner.nextDouble();
		double resultliters2gallons = convertliters2gallons (liters);
		System.out.println( liters + " liters converted to gallons is " + resultliters2gallons);

		scanner.close();
	}
}
*/

/*
Problem 7
import java.util.Scanner;
public class methodsLevel2Practice{
	public boolean canStudentVote(int age) {
		if(age<18 || age<0){
			return false;
		}else{
			return true;
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		methodsLevel2Practice obj = new methodsLevel2Practice();
		int[] ageOfStudents = new int[10];
		System.out.println("Please enter ages of 10 students");
		for(int i = 0; i<ageOfStudents.length; i++){
			ageOfStudents[i] = scanner.nextInt();
		}
		for(int i = 0; i<ageOfStudents.length; i++){
			if(obj.canStudentVote(ageOfStudents[i])){
				System.out.println("Student " + (i+1) + " can vote.");
			}else{
				System.out.println("Student " + (i+1) + " cannot vote.");
			}
		}
		scanner.close();
	}
}
*/

/*
Problem 8
import java.util.Scanner; 
public class methodsLevel2Practice{
	public static int findYoungest(int[] age){
		int youngest = age[0], index = 0;
		for(int i =0; i<age.length; i++){
			if(youngest > age[i]){
				youngest = age[i];
				index = i;
			}
		}
		return index;
	}
	public static int findTallest(int[] height){
		int tallest = height[0], index = 0;
		for(int i =0; i<height.length; i++){
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
		for(int i = 0; i<names.length; i++){
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
*/

/*
Problem 9
import java.util.Scanner; 
public class methodsLevel2Practice{
	public static boolean isPositive(int number){
		if(number>0){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isEven(int number){
		if(number%2==0){
			return true;
		}else{
			return false;
		}
	}
	public static int compare(int number1, int number2){
		if(number1>number2){
			return 1;
		}else if(number2>number1){
			return -1;
		}else{
			return 0;
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] number = new int[5];
		for(int i = 0; i<number.length; i++){
			number[i] = scanner.nextInt();
		}
		for(int i = 0; i<number.length; i++){
			System.out.println((isPositive(number[i])) ? number[i] + " is a positive integer": number[i] + " is a negative integer");
			System.out.println((isEven(number[i])) ? number[i] + " is an even number": number[i] + " is an odd number");
		}
		if(compare(number[0], number[number.length-1])==1) {
			System.out.println("First number is greater than last number");
		}else if(compare(number[0], number[number.length-1])==0){
			System.out.println("First number is equal to last number");
		}else{
			System.out.println("First number is less than last number");
		}
		scanner.close();
	}
}
*/

/*
Problem 10
import java.util.Scanner;
public class methodsLevel2Practice{
	public static double bmi(double weight, double height){
		return weight/Math.pow(height/100,2);
	}
	public static String[] bmiStatus( double[][] personDetails){
		String[] bmiStatus = new String[10];
		for(int i = 0; i<10; i++){
			if(personDetails[i][2]<=18.4){
				bmiStatus[i] = "Underweight";
			}else if(personDetails[i][2]>18.4 && personDetails[i][2]<25){
				bmiStatus[i] = "Normal";
			}else if(personDetails[i][2]>25 && personDetails[i][2]<40){
				bmiStatus[i] = "Overweight";
			}else{
				bmiStatus[i] = "Obese";
			}
		}
		return bmiStatus;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double [][] personDetails = new double[10][3];
		String[] bmiStatus = new String[10];
		for(int i = 0; i<10; i++){
			System.out.println("Please enter the details of person " + (i+1));
			for(int j = 0; j<3; j++){
				if(j==0){
					System.out.println("Please enter weight of person " + (i+1) + " in kilograms");
					personDetails[i][j] = scanner.nextDouble();
				}
				else if(j==1){
					System.out.println("Please enter height of person " + (i+1) + " in centimeters");
					personDetails[i][j] = scanner.nextDouble();
				}else{
					personDetails[i][j] = bmi(personDetails[i][j-2], personDetails[i][j-1]);
				}
			}
		}
		bmiStatus = bmiStatus(personDetails);
		for(int i = 0; i<10; i++){
			for(int j = 0; j<3 ; j++){
				System.out.print(personDetails[i][j] + " ");
			}
			System.out.println(bmiStatus[i]);
		}
		scanner.close();
	}
}
*/

/*
Problem 11
import java.util.Scanner;
public class methodsLevel2Practice{
	public static double[] rootsOfQuadratic(double a, double b, double c){
		double delta = Math.pow(b,2) - 4 * a * c ;
		if(delta>0){
			double[] rootsOfQuadratic = {((-b+Math.sqrt(delta))/(2*a)),((-b-Math.sqrt(delta))/(2*a))};
			return rootsOfQuadratic;
		}else if(delta==0){
			double[] rootsOfQuadratic = {-b/(2*a)};
			return rootsOfQuadratic;
		}else{
			double[] rootsOfQuadratic = {};
			return rootsOfQuadratic;
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = scanner.nextDouble();
		System.out.println("Enter the value of b");
		double b = scanner.nextDouble();
		System.out.println("Enter the value of c");
		double c = scanner.nextDouble();
		double[] roots = rootsOfQuadratic(a,b,c);
		System.out.println("Roots of the quadratic equation are:");
		for(int i = 0; i<roots.length; i++){
			System.out.println(roots[i]);
		}
		scanner.close();
	}
}
*/

/*
Problem 12
import java.util.Scanner;
public class methodsLevel2Practice{
	public static int[] generate4DigitRandomArray(int size){
		int[] array = new int[size];
		for(int i = 0; i<size; i++){
			array[i] = (int)(Math.random()*10000);
		}
		return array;
	}
	public double[] findAverageMinMax(int[] numbers){
		double average = 0, min = numbers[0], max = numbers[0];
		for(int  i = 0; i<numbers.length; i++){
			average+=numbers[i];
			min = Math.min(min,numbers[i]);
			max = Math.max(max,numbers[i]);
		}
		average/=numbers.length;
		double[] results = {average, min, max};
		return results;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		methodsLevel2Practice obj = new methodsLevel2Practice();
		int size = scanner.nextInt();
		int[] results = obj.generate4DigitRandomArray(size);
		double[] averageMinMax = obj.findAverageMinMax(results);
		for(int i = 0; i<averageMinMax.length; i++){
			System.out.println(averageMinMax[i] + " ");
		}
		scanner.close();
	}
}
*/

