/*
Problem 1
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Is the number " + number + " divisible by 5?");
		if(number%5==0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		scanner.close();
	}
}
*/

/*
Problem 2
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int smallestNumber, number1= scanner.nextInt(), number2 = scanner.nextInt(), number3 = scanner.nextInt();
		if(number1 < number2 && number1 < number3){
			smallestNumber = number1;
			System.out.println("Is the first number the smallest? \nYes");
		}
		else if (number2 < number3){
			smallestNumber = number2;
			System.out.println("Is the first number the smallest? \nNo");
		}
		else{
			smallestNumber = number3;
			System.out.println("Is the first number the smallest? \nNo");
		}
		System.out.println("Smallest number is " + smallestNumber);
		scanner.close();
	}
}
*/

/*
Problem 3
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int largestNumber, number1= scanner.nextInt(), number2 = scanner.nextInt(), number3 = scanner.nextInt();
		if(number1 > number2 && number1 > number3){
			largestNumber = number1;
			System.out.println("Is the first number the largest? \nYes");
			System.out.println("Is the first number the largest? \nNo");
			System.out.println("Is the first number the largest? \nNo");
		}
		else if (number2 > number3){
			largestNumber = number2;
			System.out.println("Is the first number the largest? \nNo");
			System.out.println("Is the first number the largest? \nYes");
			System.out.println("Is the first number the largest? \nNo");		}
		else{
			largestNumber = number3;
			System.out.println("Is the first number the largest? \nNo");
			System.out.println("Is the first number the largest? \nNo");
			System.out.println("Is the first number the largest? \nYes");		}
		System.out.println("Largest number is " + largestNumber);
		scanner.close();
	}
}
*/

/*
Problem 4
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number >= 0){
			int sumOfNaturalNumbers = number * (number + 1 ) / 2;
			System.out.println("The sum of " + number + " natural numbers is " + sumOfNaturalNumbers );
		}
		else{
			System.out.println("The number " + number + " is not a natural number");
		}
		scanner.close();
	}
}
*/

/*
Problem 5
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age>=18){
			System.out.println("The person's age is " + age + " and can vote.");
		}
		else{
			System.out.println("The person's age is " + age + " and cannot  vote.");
		}
		scanner.close();
	}
}
*/

/*
Problem 6
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number > 0){
			System.out.println("Positive");
		}else if(number < 0){
			System.out.println("Negative");
		}else{
			System.out.println("Zero");
		}
		scanner.close();
	}
}
*/

/*
Problem 7
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the date");
		int date = scanner.nextInt();
		System.out.println("Please enter the month");
		int month = scanner.nextInt();
		if ((month == 3 && date > 20) || (month == 6 && date < 20) || (month>3 && month<6)){
			System.out.println("Its a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}
		scanner.close();
	}
}
*/

/*
Problem 8
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int counter = scanner.nextInt();
		while(counter!=0){
			System.out.println(counter);
			--counter;
		}
		scanner.close();
	}
}
*/

/*
Problem 9
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int counter = scanner.nextInt();
		for(int i = counter; i !=0; i--){
			System.out.println(i);
		}
		scanner.close();
	}
}
*/

/*
Problem 10
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double number, addedNumber=0;
		number = scanner.nextDouble();
		while (number != 0){
			number = scanner.nextDouble();
			addedNumber+=number;
		}
		System.out.println("Number added till the input is zero " + addedNumber);
		scanner.close();
	}
}
*/

/*
Problem 11
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double number, addedNumber=0; 
		while(true){
			number = scanner.nextDouble();
			if(number<=0){
				break;
			}
			else{
				addedNumber += number;
			}
		}
		System.out.println("Number added till the input is zero or negative is " + addedNumber);
		scanner.close();
	}
}
*/

/*
Problem 12
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number>0){
			int whileOutput = 0, formulaeOutput = number * ( number + 1 ) / 2;
			System.out.println("The output with formulae is " + formulaeOutput );
			while(number!=0){
				whileOutput+=number;
				number--;
			}
			System.out.println("The output with while loop is " + whileOutput );
			if(whileOutput == formulaeOutput){
				System.out.println("Both the outputs are same.");
			}
			else{
				System.out.println("Both the outputs are not same.");
			}
		}
		else{
			System.out.println("The input number is not a natural number.");
		}
		scanner.close();
	}
}
*/

/*
Problem 13
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number>0){
			int forOutput = 0, formulaeOutput = number * ( number + 1 ) / 2;
			System.out.println("The output with formulae is " + formulaeOutput );
			for(int i = number; i!=0; i--){
				forOutput+=i;
			}
			System.out.println("The output with for loop is " + forOutput );
			if(forOutput == formulaeOutput){
				System.out.println("Both the outputs are same.");
			}
			else{
				System.out.println("Both the outputs are not same.");
			}
		}
		else{
			System.out.println("The input number is not a natural number.");
		}
		scanner.close();
	}
}
*/

/*
Problem 14
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number>0){
			int whileOutput = 1;
			while(number!=0){
				whileOutput*=number;
				--number;
			}
			System.out.println("The output with while loop is " + whileOutput );
		}
		else{
			System.out.println("The input number is not a natural number.");
		}
		scanner.close();
	}
}
*/

/*
Problem 15
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number>0){
			int forOutput = 1;
			for(int i = number; i!=0; i--){
				forOutput*=i;
			}
			System.out.println("The output with for loop is " + forOutput );
		}
		else{
			System.out.println("The input number is not a natural number.");
		}
		scanner.close();
	}
}
*/

/*
Problem 16
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number>0){
			for(int i = 1; i<number; i++){
				if(i%2==0){
					System.out.println(i + " is even number" );
				}
				else{
					System.out.println(i + " is odd number" );
				}
			}
		}
		else{
			System.out.println("The input number is not a natural number.");
		}
		scanner.close();
	}
}
*/

/*
Problem 17
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the present salary");
		int salary = scanner.nextInt();
		System.out.println("Please enter the years of service");
		int serviceYears = scanner.nextInt();
		if(serviceYears>5){
			int bonusAmount = salary * 5 / 100;
			System.out.println("Bonus amount is " + bonusAmount);
		}
		else{
			System.out.println("You dont have enough service years to get the bonus amount.");
		}
		scanner.close();
	}
}
*/

/*
Problem 18
import java.util.Scanner;
public class controlFlowsLevel1Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter any  number renging from 6 to 9:");
		int number = scanner.nextInt();
		if(number>=6 && number<=9){
			for(int i = 1; i <=10; i++){
				System.out.println(number + " x " + i + " = " + (number*i));
			}
		}else{
			System.out.println("The user input number doesn not range from 6 to 9.");
		}
		scanner.close();
	}
}
*/