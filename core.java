
// Java Programs: Module 3 - Core Java Exercises

// 1. Hello World Program
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// 2. Simple Calculator
import java.util.Scanner;
class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double result = 0;
        boolean valid = true;
        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = (num2 != 0) ? num1 / num2 : Double.NaN; break;
            default: valid = false;
        }
        System.out.println(valid ? "Result: " + result : "Invalid operator.");
    }
}

// 3. Even or Odd Checker
class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }
}

// 4. Leap Year Checker
class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        System.out.println(isLeap ? "Leap Year" : "Not a Leap Year");
    }
}

// 5. Multiplication Table
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

// 6. Data Type Demonstration
class DataTypeDemo {
    public static void main(String[] args) {
        int i = 10;
        float f = 5.5f;
        double d = 20.123;
        char c = 'A';
        boolean b = true;
        System.out.println("int: " + i);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + b);
    }
}

// 7. Type Casting Example
class TypeCasting {
    public static void main(String[] args) {
        double d = 10.5;
        int i = (int) d;
        int x = 25;
        double y = x;
        System.out.println("Double to int: " + i);
        System.out.println("Int to double: " + y);
    }
}

// 8. Operator Precedence
class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        System.out.println("Result without parentheses: " + result1);
        System.out.println("Result with parentheses: " + result2);
    }
}


// 9. Grade Calculator
class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks out of 100: ");
        int marks = sc.nextInt();
        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else if (marks >= 60) grade = 'D';
        else grade = 'F';
        System.out.println("Grade: " + grade);
    }
}

// 10. Number Guessing Game
import java.util.Random;
class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1, guess;
        do {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();
            if (guess < target) System.out.println("Too low!");
            else if (guess > target) System.out.println("Too high!");
        } while (guess != target);
        System.out.println("Correct!");
    }
}

// 11. Factorial Calculator
class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial: " + fact);
    }
}

// 12. Method Overloading
class MethodOverloading {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println("Add int: " + obj.add(2, 3));
        System.out.println("Add double: " + obj.add(2.5, 3.5));
        System.out.println("Add three int: " + obj.add(1, 2, 3));
    }
}

// 13. Recursive Fibonacci
class RecursiveFibonacci {
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number: " + fibonacci(n));
    }
}

// 14. Array Sum and Average
class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = (double) sum / n;
        System.out.println("Sum: " + sum + ", Average: " + avg);
    }
}

// 15. String Reversal
class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed: " + sb.reverse().toString());
    }
}
