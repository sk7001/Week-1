/*
Problem 1
import java.util.Scanner;
public class arraysLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double[] oldSalary = new double[10];
		double[] serviceYears = new double[10];
		double[] totalBonus = new double[10];
		double[] newSalary = new double[10];
		for(int i =0; i<10; i++){
			System.out.println("Please enter the Employee " + (i+1) + "'s salary:");
			oldSalary[i] = scanner.nextDouble();
			System.out.println("Please enter the Employee " + (i+1) + "'s  service years:");
			serviceYears[i] = scanner.nextDouble();
			if(serviceYears[i]<0 || oldSalary[i]<0){
				System.out.println("Invalid Number\nPlease enter the details of the Employee " + (i+1) + " again");
				i--;
			}
		}
		for(int i=0; i <10; i++){
			if(serviceYears[i]>5){
				totalBonus[i]=oldSalary[i]*5/100;
			}else{
				totalBonus[i]=oldSalary[i]*2/100;
			}
			newSalary[i] = oldSalary[i]+totalBonus[i];
		}
		for(int i =0; i<10; i++){
			System.out.println("Employee" + (i+1) + ":");
			System.out.println("Old Salary: " + oldSalary[i]);
			System.out.println("Total bonus: " + totalBonus[i]);
			System.out.println("New Salary: " + newSalary[i]);
		}
		scanner.close();
	}
}
*/

/*
Problem 2
import java.util.Scanner;
public class arraysLevel2Practice{
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
*/

/*
Problem 3
import java.util.Scanner;
public class arraysLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(), maxDigit = 10, index = 0;
		int[] digits = new int[maxDigit];
		while(number!=0){
			digits[index] = number%10;
			index++;
			if(index==maxDigit){
				break;
			}
			number/=10;
		}
		int largest = 0, secondLargest = 0; 
		for(int i =0; i<maxDigit;i++){
			if(largest<digits[i]){
				largest = digits[i];
			}
			if(secondLargest<digits[i] && digits[i]<largest){
				secondLargest = digits[i];
			}
		}
		System.out.println(largest + " is the largest digit from the given number");
		System.out.println(secondLargest + " is the second largest digit from the given number");
		scanner.close();
	}
}
*/

/*
Problem 4
import java.util.Scanner;
public class arraysLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong(); 
		int maxDigit = 10, index = 0;
		int[] digits = new int[maxDigit];
		while(number!=0){
			if(index==maxDigit){
				maxDigit+=10;
				int[] temp = new int[maxDigit];
				for(int j=0; j<index; j++){
					temp[j] = digits[j];
				}
				digits = temp;
			};
			digits[index] = (int)(number%10);
			number/=10;
			index++;
		}
		int largest = -1, secondLargest = -1; 
		for(int i =0; i<index;i++){
			if(largest<digits[i]){
				secondLargest = largest;
				largest = digits[i];
			}
			if(secondLargest<digits[i] && digits[i]<largest){
				secondLargest = digits[i];
			}
		}
		System.out.println(largest + " is the largest digit from the given number");
		System.out.println(secondLargest + " is the second largest digit from the given number");
		scanner.close();
	}
}
*/

/*
Problem 5
import java.util.Scanner;
public class arraysLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();
		long originalNumber = number;
		int	count = 0;
		while(number!=0){
			number/=10;
			count++;
		}
		int[] reverseDigits = new int[count];
		for(int i = 0; i<count; i++){
			reverseDigits[i] = (int)(originalNumber%10);
			originalNumber/=10;
		}
		for(int i = 0; i<count; i++){
			System.out.print(reverseDigits[i]);
		}
		scanner.close();
	}
}
*/

/*
Problem 6
import java.util.Scanner;
public class arraysLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of persons:");
		int number = scanner.nextInt();
		double[] weight = new double[number];
		double[] height = new double[number];
		double[] bmi= new double[number];
		String[] weightStatus = new String[number];
		for (int i = 0 ; i<number ; i++){
			System.out.println("PLease enter details of person " + (i+1) + ":");
			System.out.println("Weight of person " + (i+1) + " in kilograms:");
			weight[i] = scanner.nextDouble();			
			System.out.println("Height of person " + (i+1) + " in centimeters:");
			height[i] = scanner.nextDouble();			
			bmi[i] = (weight[i]/(Math.pow((height[i]/100), 2)));
			if(bmi[i]>=40.0){
				weightStatus[i] = "Obese";
			}else if(bmi[i]<=39.9 && bmi[i]>=25.0){
				weightStatus[i] = "Overweight";
			}else if(bmi[i]<=24.9 && bmi[i]>=18.5){
				weightStatus[i] = "Normal";
			}else if(bmi[i]<=18.4){
				weightStatus[i] = "Underweight";
			}
		}
		for(int i = 0; i<number; i++){
			System.out.println("Person " + (i+1) + " details:");
			System.out.println("Height :" + height[i]);
			System.out.println("Weight :" + weight[i]);
			System.out.println("BMI :" + bmi[i]);
			System.out.println("Weight Status :" + weightStatus[i]);
		}
		scanner.close();
	}
}
*/

/*
Problem 7
import java.util.Scanner;
public class arraysLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of persons:");
		int number = scanner.nextInt();
		double[][] personData = new double[number][3];
		String[] weightStatus = new String[number];
		for (int i = 0 ; i<number ; i++){
			System.out.println("Please enter details of person " + (i+1));
			for(int j=0; j<3; j++){
				if(j==0){
					System.out.println("Please enter weight of person "  + (i+1) + " in kilograms");
					personData[i][j] = scanner.nextDouble();
				}else if(j==1){
					System.out.println("Please enter height of person "  + (i+1) + " in centimeters");
					personData[i][j] = scanner.nextDouble();
				}else{
					if(personData[i][j-1]<0 || personData[i][j-2]<0 ){
						System.out.println("Either of these values are negative so please re-enter a positive value for both.");
						i--;
						break;
					}
					personData[i][j] = (personData[i][j-2]/(Math.pow((personData[i][j-1]/100), 2)));
					if(personData[i][j]>=40.0){
						weightStatus[i] = "Obese";
					}else if(personData[i][j]<=39.9 && personData[i][j]>=25.0){
						weightStatus[i] = "Overweight";
					}else if(personData[i][j]<=24.9 && personData[i][j]>=18.5){
						weightStatus[i] = "Normal";
					}else if(personData[i][j]<=18.4){
						weightStatus[i] = "Underweight";
					}
				}
			}
		}
		for(int i = 0; i<number; i++){
			for(int j = 0; j<3; j++){
				System.out.print(personData[i][j] + " ");
			}
			System.out.println(weightStatus[i]);
		}
		scanner.close();
	}
}
*/

/*
Problem 8
import java.util.Scanner;
public class arraysLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of Students:");
		int numberOfStudents = scanner.nextInt();
		double[] physics = new double[numberOfStudents];
		double[] chemistry = new double[numberOfStudents];
		double[] mathematics = new double[numberOfStudents];
		double[] percentages = new double[numberOfStudents];
		char[] grades = new char[numberOfStudents];
		for(int i = 0; i<numberOfStudents; i++){
			System.out.println("Please enter the Physics marks of student " + (i+1) + ": ");
			physics[i]=scanner.nextInt();			
			System.out.println("Please enter the Chemistry marks of student " + (i+1) + ": ");
			chemistry[i]=scanner.nextInt();			
			System.out.println("Please enter the Mathematics marks of student " + (i+1) + ": ");
			mathematics[i]=scanner.nextInt();
			if(physics[i]<0 || chemistry[i]<0 || mathematics[i]<0){
				System.out.println("Either of the marks for student " + (i+1) + "entered negative, so please check and re-enter the students's marks correctly.");
				i--;
			}
			percentages[i] = (physics[i]+chemistry[i]+mathematics[i])/3;
			if(percentages[i]>=80){
				grades[i] = 'A';
			}else if(percentages[i]<80 && percentages[i]>=70){
				grades[i] = 'B';
			}else if(percentages[i]<70 && percentages[i]>=60){
				grades[i] = 'C';
			}else if(percentages[i]<60 && percentages[i]>=50){
				grades[i] = 'D';
			}else if(percentages[i]<50 && percentages[i]>=40){
				grades[i] = 'E';
			}else{
				grades[i] = 'R';
			}
		}
		for(int i = 0; i<numberOfStudents ; i++){
			System.out.println("Details of student " + (i+1));
			System.out.println("Physics marks of student " + (i+1) + ": " + physics[i]);
			System.out.println("Chemistry marks of student " + (i+1) + ": " + chemistry[i]);
			System.out.println("Mathematics marks of student " + (i+1) + ": " + mathematics[i]);
			System.out.println("Percentage of student " + (i+1) + ": " + percentages[i]  + "%");
			System.out.println("Grade of student " + (i+1) + ": " + grades[i]);
		}
		scanner.close();
	}
}
*/

/*
Problem 9
import java.util.Scanner;
public class arraysLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of students:");
		int numberOfStudents = scanner.nextInt();
		double[][] marks = new double[numberOfStudents][3];
		double[] percentages = new double[numberOfStudents];
		char[] grade = new char[numberOfStudents];
		for (int i = 0 ; i<numberOfStudents ; i++){
			System.out.println("Please enter details of person " + (i+1));
			for(int j=0; j<3; j++){
				if(j==0){
					System.out.println("Please enter physics marks of student "  + (i+1) + " : ");
					marks[i][j] = scanner.nextDouble();
				}else if(j==1){
					System.out.println("Please enter chemistry marks of student "  + (i+1) + " : ");
					marks[i][j] = scanner.nextDouble();
				}else{
					System.out.println("Please enter mathematics marks of student "  + (i+1) + " : ");
					marks[i][j] = scanner.nextDouble();
					if( marks[i][j-1]<0 || marks[i][j-2]<0 || marks[i][j]<0 ){
						System.out.println("Either of these values are negative so please re-enter a positive marks for all the marks.");
						i--;
						break;
					}
				}
			}
		}
		for(int i = 0;i<numberOfStudents;i++){
			percentages[i] = 0;
			for(int j = 0; j<3 ; j++){
				percentages[i] += marks[i][j];
			}
			percentages[i]/=3;
			if(percentages[i]>=80){
				grade[i] = 'A';
			}else if(percentages[i]<80 && percentages[i]>70){
				grade[i] = 'B';
			}else if(percentages[i]<70 && percentages[i]>60){
				grade[i] = 'C';
			}else if(percentages[i]<60 && percentages[i]>50){
				grade[i] = 'D';
			}else if(percentages[i]<50 && percentages[i]>40){
				grade[i] = 'E';
			}else{
				grade[i] = 'R';
			}
		}
		for(int i = 0; i<numberOfStudents; i++){
			for(int j = 0; j<3; j++){
				System.out.print(marks[i][j] + " ");
			}
			System.out.print(percentages[i] + " ");
			System.out.println(grade[i]);
		}
		scanner.close();
	}
}
*/

/*
Problem 10
import java.util.Scanner;
public class arraysLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong(), originalNumber = number;
		int count = 0;
		while(number!=0){
			count++;
			number/=10;
		}
		int[] digits = new int[count];
		int[] frequency = new int[10];
		number = originalNumber;
		for(int i = 0; i<count ; i++){
			digits[i] = (int)(number%10);
			number/=10;
		}
		for(int i= 0; i<10 ; i++){
			for(int j =0; j<count; j++){
				if(i==digits[j]){
					frequency[i]++;
				}
			}
		}
		for(int i = 0; i<10; i++){
			System.out.println(i + " : " + frequency[i]);
		}
		scanner.close();
	}
}
*/