/*
Problem 1
import java.util.Random;
import java.util.Scanner;
public class builtInFunctions {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int generatedNumber = random.nextInt(100);
        System.out.println("Please enter a number of your choice:");
        int userNumber = scanner.nextInt();
        while(generatedNumber!=userNumber){
            if(generatedNumber>userNumber){
                System.out.println("The input is lower than generated number.");
                userNumber=scanner.nextInt();
            }else {
                System.out.println("The input is higher than generated number.");
                userNumber = scanner.nextInt();
            }
        }
        System.out.println("Correct answer.");
    }
}
*/

/*
Problem 2
import java.util.Scanner;

public class builtInFunctions {
    public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int num1 = getInput(scanner, "Enter first number: ");
        int num2 = getInput(scanner, "Enter second number: ");
        int num3 = getInput(scanner, "Enter third number: ");
        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
    }
}
*/

/*
Problem 3
import java.util.Scanner;

public class builtInFunctions {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = scanner.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
*/

/*
Problem 5
import java.util.Scanner;

public class builtInFunctions {
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;
        System.out.println("Fibonacci Sequence up to " + terms + " terms:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            generateFibonacci(terms);
        }
    }
}
*/

/*
Problem 5
import java.util.Scanner;
public class builtInFunctions {
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }
    public static boolean isPalindrome(String text) {
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversed);
    }
    public static void displayResult(String text, boolean result) {
        if (result) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}
*/

/*
Problem 6
import java.util.Scanner;
public class builtInFunctions {
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        return scanner.nextInt();
    }
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    public static void displayResult(int n, long factorial) {
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
    public static void main(String[] args) {
        int number = getInput();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = calculateFactorial(number);
            displayResult(number, result);
        }
    }
}
*/

/*
Problem 7
import java.util.Scanner;

public class builtInFunctions {
    public static int gcdCalculation(int num1, int num2){
        int gcd=Math.min(num1,num2);
        while(true){
            if(num1%gcd==0 && num2%gcd==0){
                return gcd;
            }
            gcd--;
        }
    }
    public static int[] lcmCalculation(int num1, int num2){
        int gcd = gcdCalculation(num1,num2), lcm;
        lcm = num1*num2/gcd;
        return new int[] {gcd, lcm};
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();
        int[] gcdLcm = lcmCalculation(num1, num2);
        System.out.println("Greatest common divisor is :" + gcdLcm[0]);
        System.out.println("Largest common multiple is :" + gcdLcm[1]);
    }
}
*/

/*
Problem 8
import java.util.Scanner;
public class builtInFunctions {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
*/

/*
Problem 10
import java.util.Scanner;
public class builtInFunctions {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println("Result: " + result);
    }
}
*/