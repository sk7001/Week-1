/*
Problem 1
import java.util.Scanner;
public class controlFlowsLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner. nextInt();
		if(number > 0){
			for(int i = 1 ; i <= number ; i++){
				if(i%2==0){
					System.out.println( i + " is even number");
				}
				else{
					System.out.println( i + " is even number");
				}
			}
		}
		else{
			System.out.println(number + " is not a natural number" );
		}
		scanner.close();
	}
}
*/

/*
Problem 2
import java.util.Scanner;
public class controlFlowsLevel2Practice{
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
Problem 3
import java.util.Scanner;
public class controlFlowsLevel2Practice{
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

/*
Problem 4
import java.util.Scanner;
public class controlFlowsLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number>0){
			for(int i = 0; i<=number ; i++){
				if(i % 3 ==0){
					System.out.println("Fizz");
				}
				else if ( i % 5 == 0 ){
					System.out.println("Buzz");
				}
				else if ( i % 3 == 0 && i % 5 == 0 ){
					System.out.println("FizzBuzz");
				}
				else{
					System.out.println(i);
				}
			}
		}else{
			System.out.println("The entered number is not a positive integer.");
		}
		scanner.close();
	}
}
*/

/*
Problem 5
import java.util.Scanner;
public class controlFlowsLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number>0){
			while(number!=0){
				if(number % 3 ==0){
					System.out.println("Fizz");
				}
				else if ( number % 5 == 0 ){
					System.out.println("Buzz");
				}
				else if ( number % 3 == 0 && number % 5 == 0 ){
					System.out.println("FizzBuzz");
				}
				else{
					System.out.println(number);
				}
				number--;
			}
		}else{
			System.out.println("The entered number is not a positive integer.");
		}
		scanner.close();
	}
}
*/

/*
Problem 6
import java.util.Scanner;
public class controlFlowsLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the age of Amar");
		int ageOfAmar= scanner.nextInt();
		System.out.println("Please enter the age of Akbar");
		int ageOfAkbar= scanner.nextInt();	
		System.out.println("Please enter the age of Anthony");
		int ageOfAnthony= scanner.nextInt();		
		
		System.out.println("Please enter the height of Amar");
		int heightOfAmar= scanner.nextInt();		
		System.out.println("Please enter the height of Akbar");
		int heightOfAkbar= scanner.nextInt();		
		System.out.println("Please enter the height of Anthony");
		int heightOfAnthony= scanner.nextInt();
		
		if(ageOfAmar<ageOfAkbar && ageOfAmar<ageOfAnthony){
			System.out.println("Amar is smallest of all three friends with an age of " + ageOfAmar);
		}
		else if(ageOfAkbar<ageOfAnthony){
			System.out.println("Akbar is smallest of all three friends with an age of " + ageOfAkbar);
		}
		else{
			System.out.println("Anthony is smallest of all three friends with an age of " + ageOfAnthony);
		}
		
		if(heightOfAmar>heightOfAkbar && heightOfAmar>heightOfAnthony){
			System.out.println("Amar is tallest of all three friends with a height of " + heightOfAmar);
		}
		else if(heightOfAkbar>heightOfAnthony){
			System.out.println("Akbar is tallest of all three friends with a height of " + heightOfAkbar);
		}
		else{
			System.out.println("Anthony is tallest of all three friends with a height of " + heightOfAnthony);
		}
		scanner.close();
	}
}
*/

/*
Problem 7
import java.util.Scanner;
public class controlFlowsLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number= scanner.nextInt();
		for(int i = 1; i<number; i++){
			if(number%i==0){
				System.out.println(i);
			}
		}
		scanner.close();
	}
}
*/

/*
Problem 8
import java.util.Scanner;
public class controlFlowsLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number= scanner.nextInt(), counter=1;
		while(counter!=number){
			if(number%counter==0){
				System.out.println(counter);
			}
			counter++;
		}
		scanner.close();
	}
}
*/

/*
Problem 9
import java.util.Scanner;
public class controlFlowsLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number= scanner.nextInt(), greatestFactor = 1;
		for(int i = number-1; i>=1; i--){
			if(number%i==0){
				greatestFactor=i;
				break;
			}
		}
		System.out.println(greatestFactor + " is the greatest factor of " + number);
		scanner.close();
	}
}
*/

/*
Problem 10
import java.util.Scanner;
public class controlFlowsLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number= scanner.nextInt(), greatestFactor = 1, counter = number-1;
		while(counter>=1){
			if(number%counter==0){
				greatestFactor = counter;
				break;
			}
			counter--;
		}
		System.out.println(greatestFactor + " is the greatest factor of " + number);
		scanner.close();
	}
}
*/

/*
Problem 11
import java.util.Scanner;
public class controlFlowsLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(), multiple = 0;
		if(number > 0 && number < 100){
			for(int i = 100; i>=1 ; i--){
				multiple=number*i;
				if(multiple < 100){
					System.out.println(multiple);
				}
			}
		}
		else{
			System.out.print("Please enter a number greater than 0 or less than 100");
		}
		scanner.close();
	}
}
*/

/*
Problem 12
import java.util.Scanner;
public class controlFlowsLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int number = scanner.nextInt();
		System.out.println("Please enter the power:");
		int	power = scanner.nextInt();
		int powerNumber=1;
		if(number>=0){
			for (int i = 1; i <= power; i++){
				powerNumber *= number;
			}
		}
		System.out.println(powerNumber);
		scanner.close;
	}
}
*/

/*
Problem 13
import java.util.Scanner;
public class controlFlowsLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number= scanner.nextInt(), counter = 100 ;
		if(number<100 && number>0){			
			while(counter>=1 ){
				int multiple = counter * number;
				if(multiple<100){
					System.out.println(multiple);
				}
				counter--;
			}
		}else{
			System.out.println("The entered number is not a positive number or not less than 100.");
		}
		scanner.close();
	}
}
*/

/*
Problem 15
import java.util.Scanner;
public class controlFlowsLevel2Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number= scanner.nextInt(), counter = 0, result = 1;
		System.out.println("Please enter the power");
		int power= scanner.nextInt();
		while(counter!=power){
			result *= number;
			counter++;
		}
		System.out.println(result);
		scanner.close();
	}
}
*/