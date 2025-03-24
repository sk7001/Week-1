/*
Problem 1
import java.util.Scanner;
public class methodsLevel3Practice{
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
*/

/*
Problem2
import java.util.Scanner;
public class methodsLevel3Practice{
	public static int countOfNumber(long number){
		int count = 0;
		while(number!=0){
			number/=10;
			count++;
		}
		return count;
	}
	public static int[] digits(long number, int count){
		int[] digits = new int[count];
		for(int i = 0; i<count; i++){
			digits[i] = (int)(number%10);
			number/=10;
		}
		return digits;
	}
	public static boolean checkDuckNumber(int[] digits){
		for(int i = 0; i < digits.length-1; i++){
			if(digits[i] == 0 ){
				return true;
			}
		}
		return false;
	}
	public static boolean checkArmstrong(long number, int[] digits){
		long armstrongNumber = 0;
		for(int i = 0; i<digits.length; i++){
			armstrongNumber+=Math.pow(digits[i], digits.length);
		}
		if(number == armstrongNumber){
			return true;
		}else{
			return false;
		}
	}
	public static int[] largestAndSecondLargest(int[] digits){
		int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
		for(int i = 0; i<digits.length;i++){
			if(max<digits[i]){
				secMax = max;
				max=digits[i];
			}
			if(digits[i]<max && secMax<digits[i]){
				secMax = digits[i];
			}
		}
		int[] maxAndSecMax = {max,secMax};
		return maxAndSecMax;
	}
	public static int[] smallestAndSecondSmallest(int[] digits){
		int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
		for(int i = 0; i<digits.length;i++){
			if(min>digits[i]){
				secMin = min;
				min=digits[i];
			}
			if(digits[i]>min && secMin>digits[i]){
				secMin = digits[i];
			}
		}
		int[] minAndSecMin = {min, secMin};
		return minAndSecMin;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		long number = scanner.nextLong();
		int count = countOfNumber(number);
		int[] digits = digits(number, count);
		int[] minAndSecMin = smallestAndSecondSmallest(digits);
		int[] maxAndSecMax = largestAndSecondLargest(digits);
		System.out.println("Count of digits is : " + count);
		for(int i = 0; i<count; i++){
			System.out.println(digits[i] + " ");
		}
		System.out.print("\n");
		System.out.println("Is a duck number ? : " + checkDuckNumber(digits));
		System.out.println("Is a armstrong number ? : " + checkArmstrong(number, digits));
		System.out.println("Minimum and Second minimum values are : ");
		for(int i = 0; i<minAndSecMin.length; i++){
			System.out.println(minAndSecMin[i] + " " );
		}
		System.out.println("Maximum and Second maximum values are : ");
		for(int i = 0; i<maxAndSecMax.length; i++){
			System.out.println(maxAndSecMax[i] + " " );
		}
		scanner.close();
	}
}
*/

/*
Problem 3
import java.util.Scanner;
public class methodsLevel3Practice{
	public static int countOfNumber(long number){
		int count = 0;
		while(number!=0){
			number/=10;
			count++;
		}
		return count;
	}
	public static int[] digits(long number, int count){
		int[] digits = new int[count];
		for(int i = 0; i<count; i++){
			digits[i] = (int)(number%10);
			number/=10;
		}
		return digits;
	}
	public static int sum(int[] digits){
		int sum = 0;
		for(int i = 0; i<digits.length; i++){
			sum+=digits[i];
		}
		return sum;
	}
	public static int sumOfSquares(int[] digits){
		int sumOfSquares = 0;
		for(int i = 0; i<digits.length; i++){
			sumOfSquares+=Math.pow(digits[i],2);
		}
		return sumOfSquares;
	}
	public static boolean checkHarshadNumber(long number, int sum){
		if(number%(long)sum==0){
			return true;
		}else{
			return false;
		}
	}
	public static int[][] frequency(int[] digits){
		int[][] frequency = new int[10][2];
		for(int i = 0; i<10; i++){
			for(int j = 0; j<2; j++){
				if(j==0){
					frequency[i][j] = i;
				}else{
					for(int k = 0; k<digits.length; k++){
						if(i==digits[k]){
							frequency[i][j]++;
						}
					}
				}
			}
		}		
		return frequency;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();
		int count = countOfNumber(number);
		System.out.println("Count of digits is : " + count);
		int[] digits = digits(number, count);
		for(int i = 0; i<count; i++){
			System.out.println(digits[i]);
		}
		int sum = sum(digits);
		System.out.println("Sum of all the digits is " + sum);
		int sumOfSquares = sumOfSquares(digits);
		System.out.println("Sum of squares of all the digits is " + sumOfSquares);
		if(checkHarshadNumber(number, sum)){
			System.out.println(number + " is a harshad number");
		}else{
			System.out.println(number + " is not a harshad number");
		}
		int[][] frequency = frequency(digits);
		System.out.println("Frequency of Digits are");
		for(int i = 0; i<10; i++){
			for(int j = 0; j<2; j++){
				System.out.print(frequency[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
*/

/*
Problem 4
import java.util.Scanner;
import java.util.Arrays;
public class methodsLevel3Practice{
	public static int countOfNumber(long number){
		int count = 0;
		while(number!=0){
			number/=10;
			count++;
		}
		return count;
	}
	public static int[] digits(long number, int count){
		int[] digits = new int[count];
		for(int i = count-1; i>=0; i--){
			digits[i] = (int)(number%10);
			number/=10;
		}
		return digits;
	}
	public static int[] reverseDigits(int[] digits){
		int[] reverseDigits = new int[digits.length];
		for(int i = 0; i<digits.length; i++){
			reverseDigits[i] = digits[digits.length-1-i];
		}
		return reverseDigits;
	}
	public static boolean checkReverseEqualsOriginal(int[] digits, int[] reverseDigits){
		if(digits.length == reverseDigits.length){
			if(Arrays.equals(frequencyOfReverse, frequencyOfDigits)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	public static boolean checkPanildrome(int[] digits, int[] reverseDigits){
		boolean check = true;
		for(int i = 0; i<digits.length; i++){
			if(digits[i] != reverseDigits[i]){
				check = false;
			}
		}
		return check; 
	}
	public static boolean checkDuckNumber(int[] digits){
		for(int i = 0; i < digits.length-1; i++){
			if(digits[i] == 0 ){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();
		int count = countOfNumber(number);
		System.out.println("Count of digits in number is " + count);
		int[] digits = digits(number, count);
		for(int i = 0; i<count; i++){
			System.out.println(digits[i]);
		}
		int[] reverseDigits = reverseDigits(digits);
		System.out.println("Reversed array is");
		for(int i = 0; i<count; i++){
			System.out.println(reverseDigits[i]);
		}
		if(checkReverseEqualsOriginal(digits, reverseDigits)){
			System.out.println("Both the arrays are equal");
		}else{
			System.out.println("Both the arrays are not equal");
		}
		if(checkPanildrome(digits, reverseDigits)){
			System.out.println("The array is palindrome");
		}else{	
			System.out.println("The array is not palindrome");
		}		
		if(checkDuckNumber(digits)){
			System.out.println("Its is a duck number");
		}else{	
			System.out.println("It is not a duck number");
		}
		scanner.close();
	}
}
*/

/*
Problem 5
import java.util.Scanner;
public class methodsLevel3Practice{
	public static int countOfNumber(long number){
		int count = 0;
		while(number!=0){
			number/=10;
			count++;
		}
		return count;
	}
	public static int[] digits(long number, int count){
		int[] digits = new int[count];
		for(int i = 0; i<count; i++){
			digits[i] = (int)(number%10);
			number/=10;
		}
		return digits;
	}
	public static boolean checkPrime(long number){
		for(int i = 2; i<number-1; i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
	public static boolean checkNeon(long number){
		long square = (long)Math.pow(number, 2);
		int count = countOfNumber(square);
		int[] digits = digits(square, count);
		int sumOfSquare = 0;
		for(int i = 0; i< count; i++){
			sumOfSquare+=digits[i];
		}
		if(sumOfSquare==number){
			return true;
		}else{
			return false;
		}
	}
	public static boolean checkSpy(long number){
		int count = countOfNumber(number);
		int[] digits = digits(number, count);
		int sum = 0, product = 1;
		for(int i = 0; i<count; i++){
			sum+=digits[i];
			product+=digits[i];
		}
		if(sum==product){
			return true;
		}else{
			return false;
		}
	}
	public static boolean checkAutomorphic(long number){
		long square = (long)Math.pow(number, 2);
		int countOfSquare = countOfNumber(square);
		int[] digitsOfSquare = digits(square, countOfSquare);
		int count = countOfNumber(number);
		int[] digits = digits(number, count);
		boolean check = true;
		for(int i = count-1; i>=0; i--){
			if(digits[i]!=digitsOfSquare[i]){
				check = false;
				break;
			}
		}
		return check;
	}
	public static boolean checkBuzz(long number){
		if(number%10==7 || number%7==0){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();
		System.out.println("Is that a prime number ?" + checkPrime(number));
		System.out.println("Is that a neon number ?" + checkNeon(number));
		System.out.println("Is that a spy number ?" + checkSpy(number));
		System.out.println("Is that an automorphic number ?" + checkAutomorphic(number));
		System.out.println("Is that a buzz number ?" + checkBuzz(number));
		scanner.close();
	}
}
*/

/*
Problem 6
import java.util.Scanner;
public class methodsLevel3Practice{
	public static int countOfNumber(long number){
		int count = 0;
		while(number!=0){
			number/=10;
			count++;
		}
		return count;
	}
	public static int[] digits(long number, int count){
		int[] digits = new int[count];
		for(int i = 0; i<count; i++){
			digits[i] = (int)(number%10);
			number/=10;
		}
		return digits;
	}
	public static int[] factors(long number){
		int countOfFactors = 0;
		for(int i = 0; i<number; i++){
			if(i!=0 && number%i==0){
				countOfFactors++;
			}
		}
		System.out.println(countOfFactors);
		int[] factors = new int[countOfFactors];
		int j = 0;
		for(int i = 1; i<number; i++){
			if(i!=0 && number%i==0){
				factors[j]=i;
				j++;
			}
		}
		return factors;
	}
	public static int greatestFactor(int[] factors){
		int greatestFactor = factors[0];
		for(int i = 0; i<factors.length; i++){
			greatestFactor = Math.max(greatestFactor, factors[i]);
		}
		return greatestFactor;
	}
	public static int sumOfFactors(int[] factors){
		int sum = 0; 
		for(int i = 0; i<factors.length; i++){
			sum+=factors[i];
		}
		return sum;
	}
	public static int productOfFactors(int[] factors){
		int product = 1;
		for(int i = 0; i<factors.length; i++){
			product*=factors[i];
		}
		return product;
	}
	public static int productOFCubeOfFactors(int[] factors){
		int productOfCube = 1;
		for(int i = 0; i<factors.length; i++){
			productOfCube *= Math.pow(factors[i], 3);
		}
		return productOfCube;
	}
	public static boolean checkPerfectNumber(int sumOfFactors, long number){
		if((long)sumOfFactors == number){
			return true;
		}else{
			return false;
		}
	}
	public static boolean checkAbundant(int sumOfFactors, long number){
		if((long)sumOfFactors>number){
			return true;
		}else{
			return false;
		}
	}
	public static boolean checkDeficient(int sumOfFactors, long number){
		if((long)sumOfFactors<number){
			return true;
		}else{
			return false;
		}	}
	public static boolean checkStrong(long number){
		int count = countOfNumber(number);
		int[] digits = digits(number, count);
		int sumOfFactorialOfDigits = 0, factorial = 1;
		for(int i = 0; i<count; i++){
			for(int j = digits[i]; j>=1; j--){
				factorial*=j;
			}
			sumOfFactorialOfDigits+=factorial;
			factorial=1;
		}
		if(sumOfFactorialOfDigits==number){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();
		int[] factors = factors(number);
		System.out.println("Factors of " + number + " are: ");
		for(int i = 0; i<factors.length; i++){
			System.out.println(factors[i]);
		}
		int greatestFactor = greatestFactor(factors);
		System.out.println("Greatest factor among all the factors is " + greatestFactor);
		int sumOfFactors = sumOfFactors(factors);
		System.out.println("Sum of actors is " + sumOfFactors);
		int productOfFactors = productOfFactors(factors);
		System.out.println("Product of factors is " + productOfFactors);
		int productOFCubeOfFactors = productOFCubeOfFactors(factors);
		System.out.println("Product of cube of all the factors is " + productOFCubeOfFactors);
		System.out.println("Is this a perfect number ?" + checkPerfectNumber(sumOfFactors, number));
		System.out.println("Is this a abdundant number ?" + checkAbundant(sumOfFactors, number));
		System.out.println("Is this a deficient number ?" + checkDeficient(sumOfFactors, number));
		System.out.println("Is this a strong number ?" + checkStrong(number));
		scanner.close();
	}
}
*/

/*
Problem 7
public class methodsLevel3Practice{
    public static int otp(){
        return 100000+(int)(Math.random()*900000);
    }
    public static boolean checkOtpUnique(int[] otpArray) {
        for(int i = 0; i<otpArray.length; i++ ){
            for(int j = 0; j<otpArray.length; j++){
        		if(otpArray[j] == otpArray[i] && j!=i){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] otpArray = new int[10];
        for(int i = 0; i<otpArray.length; i++){
            otpArray[i] = otp() ;
        }
        System.out.println("Is all the elements in the array unique?, " + checkOtpUnique(otpArray));
    }
}
*/

/*
Problem 8
import java.util.Scanner;
public class methodsLevel3Practice {
    public static String monthName(int monthNumber) {
        String[] names = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return names[monthNumber-1];
    }
    public static int daysInMonth(int monthNumber, int yearNumber){
        int[] numberOfDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(yearNumber%4==0 && (yearNumber%100!=0 || yearNumber%400==0)){
            numberOfDays[1]=29;
        }
        return  numberOfDays[monthNumber-1];
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
    }
}
*/

/*
Problem 9
import java.util.Scanner;
public class methodsLevel3Practice {
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        if (x1 == x2) {
            System.out.println("The line is vertical, equation: x = " + x1);
            return null;
        }
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        result[0] = m;
        result[1] = b;
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);
        double[] equation = lineEquation(x1, y1, x2, y2);
        if (equation != null) {
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", equation[0], equation[1]);
        }
        scanner.close();
    }
}
*/

/*
Problem 10
import java.util.Scanner;
public class methodsLevel3Practice {
    public static boolean areCollinearUsingSlopes(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();
        boolean collinearBySlope = areCollinearUsingSlopes(x1, y1, x2, y2, x3, y3);
        boolean collinearByArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        if (collinearBySlope && collinearByArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
        scanner.close();
    }
}
*/

/*
Problem 11
import java.util.Random;
public class methodsLevel3Practice {
    public static double[][] generateEmployeeData(int numEmployees) {
        double[][] employeeData = new double[numEmployees][2];
        Random random = new Random();
        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000);
            employeeData[i][1] = random.nextInt(11);
        }
        return employeeData;
    }
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3];
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
        return updatedData;
    }
    public static void displayEmployeeDetails(double[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.printf("%-10s %-15s %-10s %-15s %-15s\n", "Emp ID", "Old Salary", "Years", "Bonus", "New Salary");
        for (int i = 0; i < employeeData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];
            totalNewSalary += updatedData[i][2];
            System.out.printf("%-10d %-15.2f %-10.0f %-15.2f %-15.2f\n",
                    (i + 1), updatedData[i][0], employeeData[i][1], updatedData[i][1], updatedData[i][2]);
        }
        System.out.printf("%-10s %-15.2f %-10s %-15.2f %-15.2f\n", "Total", totalOldSalary, "", totalBonus, totalNewSalary);
    }
    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displayEmployeeDetails(employeeData, updatedData);
    }
}
*/

/*
Problem 11
import java.util.Scanner;
public class methodsLevel3Practice {
    public static int[][] generateMarks(int numStudents) {
        int[][] marks = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = (int) (Math.random() * 101);
            marks[i][1] = (int) (Math.random() * 101);
            marks[i][2] = (int) (Math.random() * 101);
        }
        return marks;
    }
    public static Object[][] calculateResults(int[][] marks) {
        Object[][] results = new Object[marks.length][5];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0, perc = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(perc * 100.0) / 100.0;
            String grade = getGrade(perc);
            results[i][3] = grade;
            results[i][4] = getRemark(grade);
        }
        return results;
    }
    public static String getGrade(double perc) {
        if (perc >= 80) return "A";
        if (perc >= 70) return "B";
        if (perc >= 60) return "C";
        if (perc >= 50) return "D";
        if (perc >= 40) return "E";
        return "R";
    }
    public static String getRemark(String grade) {
        switch (grade) {
            case "A": return "Level 4 (Above Standards)";
            case "B": return "Level 3 (At Standards)";
            case "C": return "Level 2 (Below Standards)";
            case "D": return "Level 1 (Well Below Standards)";
            case "E": return "Level 1- (Too Below Standards)";
            default: return "Remedial (Needs Improvement)";
        }
    }
    public static void displayScorecard(int[][] marks, Object[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAvg\tPerc\tGrade\tRemarks");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f%%\t%s\t%s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], (int) results[i][0], results[i][1], results[i][2], results[i][3], results[i][4]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        int[][] marks = generateMarks(numStudents);
        Object[][] results = calculateResults(marks);
        displayScorecard(marks, results);
        sc.close();
    }
}
*/

/*
Problem 12
import java.util.Scanner;
public class methodsLevel3Practice {
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int) (Math.random() * 10);
        return matrix;
    }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, common = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }
    public static int[][] transposeMatrix(int[][] A) {
        int rows = A.length, cols = A[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = A[i][j];
        return transposed;
    }
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) return null;
        double[][] inverse = {
                {matrix[1][1] / (double) det, -matrix[0][1] / (double) det},
                {-matrix[1][0] / (double) det, matrix[0][0] / (double) det}
        };
        return inverse;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row)
                System.out.print(elem + "\t");
            System.out.println();
        }
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double elem : row)
                System.out.printf("%.2f\t", elem);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for matrices: ");
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] A = generateMatrix(rows, cols);
        int[][] B = generateMatrix(rows, cols);
        System.out.println("\nMatrix A:");
        displayMatrix(A);
        System.out.println("\nMatrix B:");
        displayMatrix(B);
        System.out.println("\nAddition:");
        displayMatrix(addMatrices(A, B));
        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrices(A, B));
        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(A));
        if (rows == cols && (rows == 2 || rows == 3)) {
            if (rows == 2) {
                System.out.println("\nDeterminant of A: " + determinant2x2(A));
                double[][] inverse = inverse2x2(A);
                if (inverse != null) {
                    System.out.println("\nInverse of A:");
                    displayMatrix(inverse);
                } else {
                    System.out.println("\nMatrix A is non-invertible.");
                }
            } else {
                System.out.println("\nDeterminant of A: " + determinant3x3(A));
            }
        }
        sc.close();
    }
}
*/