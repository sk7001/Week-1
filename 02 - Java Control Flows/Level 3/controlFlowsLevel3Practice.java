/*
Problem 1
import java.util.Scanner;
public class controlFlowsLevel3Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if(year>=1582){
			if(year%4==0){
				if(year%100==0){
					if(year%400==0){
						System.out.println(year + " is a leap year.");
					}else{
						System.out.println(year + " is not a leap year.");
					}
				}else{
					System.out.println(year + " is a leap year.");
				}
			}else{
				System.out.println(year + " is not a leap year.");
			}
		}else{
			System.out.println("The year input you have given is " + year + " which is not valid.");
		}
		scanner.close();
	}
}
*/

/*
Problem 2
import java.util.Scanner;
public class controlFlowsLevel3Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if( year>=1582 && ((year%4==0 && year%100!=0) || year%400==0)){
			System.out.println(year + " is a leap year.");
		}
		else{
			System.out.println(year + " is not a leap year.");
		}
		scanner.close();
	}
}
*/

/*
Problem 3
import java.util.Scanner;
public class controlFlowsLevel3Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Physics marks");
		float physicsMarks = scanner.nextInt();
		System.out.println("Please enter Chemistry marks");
		float chemistryMarks = scanner.nextInt();
		System.out.println("Please enter Mathematics marks");
		float mathematicsMarks = scanner.nextInt();
		float averageMarks = ( physicsMarks + mathematicsMarks + chemistryMarks ) / 3 ;
		if(averageMarks>=80){
			System.out.println("Grade: A\n(Level 4, above agency-normalized standards)");
		}else if(averageMarks<=79 && averageMarks>=70){
			System.out.println("Grade: A\n(Level 3, at agency-normalized standards)");
		}else if(averageMarks<=69 && averageMarks>=60){
			System.out.println("Grade: A\n(Level 2, below agency-normalized standards)");
		}else if(averageMarks<=59 && averageMarks>=50){
			System.out.println("Grade: A\n(Level 1, well agency-normalized standards)");
		}else if(averageMarks<=49 && averageMarks>=40){
			System.out.println("Grade: A\n(Level -1, too below agency-normalized standards)");
		}else{
			System.out.println("Grade: R\n(Remedial standards)");
		}
		scanner.close();
	}
}
*/

/*
Problem 4
import java.util.Scanner;
public class controlFlowsLevel3Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		boolean check=false;
		if(number <= 1){
			System.out.println(number + " is not a prime number");
		}else{
			for(int i = 2; i <number; i++){
				if(number%i==0){
					check=true;
					break;
				}
			}
		}
		if(check){
			System.out.println(number + " is a prime number.");
		}else{
			System.out.println(number + " is not a prime number.");
		}
		scanner.close();
	}
}	
*/

/*
Problem 5
import java.util.Scanner;
public class controlFlowsLevel3Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(), sum=0, originalNumber = number;
		while(originalNumber!=0){
			sum+=Math.pow(originalNumber%10, 3);
			originalNumber/=10;
		}
		if(number == sum){
			System.out.println(number + " is an armstrong number.");
		}else{
			System.out.println(number + " is not an armstrong number.");
		}
		scanner.close();
	}
}
*/

/*
Problem 6
import java.util.Scanner;
public class controlFlowsLevel3Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(), count = 0;
		while(number!=0){
			number/=10;
			count++;
		}
		System.out.println(count);
		scanner.close();
	}
}
*/

/*
Problem 7
import java.util.Scanner;
public class controlFlowsLevel3Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the weight of the person in kilograms");
		double weight = scanner.nextDouble();
		System.out.println("Please enter the weight of the person in centimeters.");
		double height =scanner.nextDouble();
		double bmi = weight / Math.pow(height / 100,2);
		if(bmi<=18.4){
			System.out.println("Underweight");
		}else if(bmi<=24.9 && bmi>=18.5){
			System.out.println("Normal");
		}else if(bmi<=39.9 && bmi>=25.0){
			System.out.println("Overweight");
		}else{
			System.out.println("Obese");
		}
		scanner.close();
	}
}
*/

/*
Problem 8
import java.util.Scanner;
public class controlFlowsLevel3Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(), sum = 0, originalNumber = number;
		while(originalNumber!=0){
			sum+=originalNumber%10;
			originalNumber/=10;
		}
		if(number%sum==0){
			System.out.println(number + " is a Harshad Number.");
		}else{
			System.out.println(number + " is not a Harshad Number.");
		}
		scanner.close();
	}
}
*/

/*
Problem 10
import java.util.Scanner;
public class controlFlowsLevel3Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(), sum = 0;
		for(int i = 1; i<=12; i++){
			if(number%i==0){
				sum+=i;
			}
		}
		if(sum>number){
			System.out.println( number + " is an Abdunant Number.");
		}else{
			System.out.println( number + " is not an Abdunant Number.");
		}
		scanner.close();
	}
}
*/

/*
Problem 10
import java.util.Scanner;
public class controlFlowsLevel3Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double first = scanner.nextDouble(), second = scanner.nextDouble();
		String op = scanner.next();
		switch(op){
			case "+":
				System.out.println(first+second);
				break;
			case "-":
				System.out.println(first-second);
				break;
			case "*":
				System.out.println(first*second);
				break;
			case "/":
				System.out.println(first/second);
				break;
			default:
				System.out.println("Invalid operator");
		}
		scanner.close();
	}
}
*/

/*
Problem 11
import java.util.Scanner;
public class controlFlowsLevel3Practice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter year");
		int y = scanner.nextInt();
		System.out.println("Please enter month");
		int m = scanner.nextInt();
		System.out.println("Please enter date");		
		if(m<=12){
			int d = scanner.nextInt();
			int yo = y - (14 - m)/12;
			int x = yo + yo/4 - yo/100 + yo/400;
			int mo = m + 12 * ((14 - 3) / 12) - 2;
			int Do = (d + x + 31 * mo / 12) % 7 ;
			System.out.println(Do);
		}else{
			System.out.println("The month you have entered " + m + " is invalid");
		}
		scanner.close();
	}
}
*/