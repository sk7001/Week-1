/*
Problem 1
import java.util.Scanner;
public class arraysLevel1Practice{
	public static void main(String[] args0){
		Scanner scanner = new Scanner(System.in);
		int[] ageOfStudents = new int[10];
		for(int i = 0; i <ageOfStudents.length; i++){
			ageOfStudents[i] = scanner.nextInt();
		}		
		for(int i = 0; i <ageOfStudents.length; i++){
			if(ageOfStudents[i]>=18){
				System.out.println("The student with the age " + ageOfStudents[i] + " can vote.");
			}else if(ageOfStudents[i]<0){
				System.out.println("Invalid age");
			}else{
				System.out.println("The student with the age " + ageOfStudents[i] + " cannot vote.");
			}
		}
		scanner.close();
	}
}
*/

/*
Problem 2
import java.util.Scanner;
public class arraysLevel1Practice{
	public static void main(String[] args0){
		Scanner scanner = new Scanner(System.in);
		int[] number = new int[5];
		for (int i = 0; i <number.length; i++){
			number[i] = scanner.nextInt();
		}
		for (int i = 0; i <number.length; i++){
			if(number[i]>0){
				System.out.println("Positive");
			}else if(number[i]<0){
				System.out.println("Negative");
			}else{
				System.out.println("Zero");
			}
		}
		for (int i = 0; i <number.length; i++){
			if(number[i]%2==0){
				System.out.println("Even number");
			}else{
				System.out.println("Odd number");
			}				
		}
		if(number[number.length-1]>number[0]){
			System.out.println("First element is lesser than Last one");
		}else if(number[number.length-1]<number[0]){
			System.out.println("First element is greater than Last one");
		}else{
			System.out.println("First element is equal to Last one");
		}
		scanner.close();
	}
}
*/

/*
Problem 3
import java.util.Scanner;
public class arraysLevel1Practice{
	public static void main(String[] args0){
		Scanner scanner = new Scanner(System.in);
		int[] results = new int[10];
		int number = scanner.nextInt();
		for(int i = 0; i<10; i++){
			results[i]=number*(i+1);
		}
		for(int i = 0; i<10; i++){
			System.out.println(number + " * " + (i+1) + " = " + results[i]);
		}
		scanner.close();
	}
}
*/

/*
Problem 4
import java.util.Scanner;
public class arraysLevel1Practice{
	public static void main(String[] args0){
		Scanner scanner = new Scanner(System.in);
		double[] numbers = new double[10];
		double total = 0.0;
		int i =0;
		while(true){
			double input = scanner.nextDouble(); 
			if( input<=0 || i==numbers.length-1 ){
				break;
			}
			numbers[i] = input;
			i++;
		}
		for(int j = 0; j<numbers.length-1; j++){
			total+=numbers[j];
		}
		System.out.println(total);
		scanner.close();
	}
}
*/

/*
Problem 5
import java.util.Scanner;
public class arraysLevel1Practice{
	public static void main(String[] args0){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number from 6 to 9:");
		int number = scanner.nextInt();
		int[] multiplicationResult = new int[10];
		if(number>=6 && number <=9){
			for (int i = 0; i<multiplicationResult.length; i++){
				multiplicationResult[i] = number * (i+1);
			}
			for (int i = 0; i<multiplicationResult.length; i++){
				System.out.println(number + " * " + (i+1) + " = " + multiplicationResult[i]);
			}
		}else{
			System.out.println("You have entered the number not between 6 and 9.");
		}
		scanner.close();
	}
}
*/

/*
Problem 6
import java.util.Scanner;
public class arraysLevel1Practice{
	public static void main(String[] args0){
		Scanner scanner = new Scanner(System.in);
		double[] heights = new double[11];
		double sum = 0.0;
		for(int i = 0; i<heights.length; i++){
			heights[i] = scanner.nextDouble();
		}
		for(int i = 0; i<heights.length; i++){
			sum+=heights[i];
		}
		double mean = sum/heights.length;
		System.out.println(mean);
		scanner.close();
	}
}
*/

/*
Problem 7
import java.util.Scanner;
public class arraysLevel1Practice{
	public static void main(String[] args0){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] odd = new int[(number/2+1)];
		int[] even = new int[(number/2+1)];
		int j=0, k=0;
		if(number>=1){
			for(int i = 0; i<number ; i++){
				int input = scanner.nextInt();
				if(input%2==0){
					even[j]=input;
					j++;
				}else{
					odd[k]=input;
					k++;
				}
			}
			System.out.println("Odd numbers are:");
			for(int i = 0;i<odd.length;i++){
				System.out.println(odd[i]);
			}
			System.out.println("Even numbers are:");
			for(int i = 0;i<even.length;i++){
				System.out.println(even[i]);
			}
		}else{
			System.out.println("Please enter a natural number.");
		}
		scanner.close();
	}
}
*/

/*
Problem 8
import java.util.Scanner;
public class arraysLevel1Practice{
	public static void main(String[] args0){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(), maxFactor = 10, index = 0;
		int[] factors = new int[maxFactor];
		for(int i = 1; i<=number; i++){
			if(number%i == 0){
				if(index==maxFactor){
					maxFactor*=2;
					int[] temp = new int[maxFactor];
					for(int j = 0; j<index; j++){
						temp[j]=factors[j];
					}
					factors = temp;
				}
				factors[index++] = i;
			}
		}
		System.out.println("Factors of num " + number + " are:");
		for(int i = 0; i<index;i++){
			System.out.print(factors[i]+ " ");
		}
		scanner.close();
	}
}
*/

/*
Problem 9
import java.util.Scanner;
public class arraysLevel1Practice{
	public static void main(String[] args0){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of rows");
		int rows = scanner.nextInt();
		System.out.println("Please enter the number of columns");
		int columns = scanner.nextInt();
		int[][] matrix2D = new int[rows][columns];
		int[] matrix = new int[rows*columns];
		int index = 0;
		for(int i = 0; i<rows; i++){
			System.out.println("Please enter the elements for row " + (i+1) + " of array");
			for(int j = 0; j<columns; j++){
				matrix2D[i][j]=scanner.nextInt();
			}
		}
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<columns; j++){
				matrix[index]=matrix2D[i][j];
				index++;
			}
		}
		System.out.println("The elements of 1D array are:");
		for(int i = 0; i<index; i++){
			System.out.print(matrix[i] + " ");
		}
		scanner.close();
	}
}
*/

/*
Problem 10
import java.util.Scanner;
public class arraysLevel1Practice{
	public static void main(String[] args0){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String[] results = new String[number];
		for(int i= 0; i<number; i++){
			if(i%3==0){
				results[i] = "Fizz";
			}else if(i%5==0){
				results[i] = "Buzz";
			}else if(i%3==0 && i%5==0){
				results[i] = "FizzBuzz";
			}else{
				continue;
			}
		}
		for(int i = 0; i<number ; i++){
			if(i%3==0 || i%5==0 || (i%3==0&&i%5==0)){
				System.out.println("Position " + i + " = " + results[i]);
			}
			else{
				System.out.println("Position " + i + " = " + i);
			}
		}
		scanner.close();
	}
}
*/
