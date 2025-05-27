
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

// PalindromeChecker.java
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: "); // Prompt the user for a string.
        String inputString = scanner.nextLine();

        // Remove any non-alphanumeric characters and convert to lowercase.
        String cleanedString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the string reads the same forwards and backwards.
        String reversedCleanedString = new StringBuilder(cleanedString).reverse().toString();

        if (cleanedString.equals(reversedCleanedString)) {
            System.out.println("'" + inputString + "' is a PALINDROME."); // Display the result.
        } else {
            System.out.println("'" + inputString + "' is NOT a palindrome."); // Display the result.
        }

        scanner.close();
    }
}

// Car.java
class Car {
    // Define attributes: make, model, year.
    String make;
    String model;
    int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Implement a method displayDetails() to print car information.
    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

// ClassAndObjectCreation.java
public class ClassAndObjectCreation {
    public static void main(String[] args) {
        // Create objects of the Car class.
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);

        // Call the method.
        System.out.println("Car 1 Details:");
        car1.displayDetails();
        System.out.println("Car 2 Details:");
        car2.displayDetails();
    }
}

// Animal.java
class Animal {
    // Animal class should have a method makeSound().
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog.java
class Dog extends Animal {
    // Dog class should override makeSound() to print "Bark".
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// InheritanceExample.java
public class InheritanceExample {
    public static void main(String[] args) {
        // Instantiate both classes and call their methods.
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();

        System.out.print("Generic Animal: ");
        genericAnimal.makeSound();

        System.out.print("My Dog: ");
        myDog.makeSound();
    }
}

// Playable.java
interface Playable {
    // Define an interface Playable with a method play()[cite: 48].
    void play();
}

// Guitar.java
class Guitar implements Playable {
    // Implement the interface in classes Guitar[cite: 49].
    @Override
    public void play() {
        System.out.println("Guitar plays a melody."); // Each class should provide its own implementation of play()[cite: 49].
    }
}

// Piano.java
class Piano implements Playable {
    // Implement the interface in classes Piano[cite: 49].
    @Override
    public void play() {
        System.out.println("Piano plays a chord."); // Each class should provide its own implementation of play()[cite: 49].
    }
}

// InterfaceImplementation.java
public class InterfaceImplementation {
    public static void main(String[] args) {
        // Instantiate the classes and call the method[cite: 50].
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        System.out.print("Guitar: ");
        guitar.play();

        System.out.print("Piano: ");
        piano.play();
    }
}

// TryCatchExample.java
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: "); // Prompt the user for two integers[cite: 51].
        int numerator = scanner.nextInt();

        System.out.print("Enter denominator: "); // Prompt the user for two integers[cite: 51].
        int denominator = scanner.nextInt();

        try {
            // Attempt to divide the first by the second[cite: 51].
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Catch any ArithmeticException and display an appropriate message[cite: 52].
            System.out.println("Error: Cannot divide by zero! " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

// InvalidAgeException.java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// CustomExceptionExample.java
import java.util.Scanner;

public class CustomExceptionExample {

    public static void checkAge(int age) throws InvalidAgeException {
        // Throw InvalidAgeException if the user's age is less than 18[cite: 53].
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            // Catch the exception and display a message[cite: 54].
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

// FileWriting.java
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to write to the file: "); // Prompt the user for a string[cite: 55].
        String data = scanner.nextLine();

        String fileName = "output.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data); // Write the string to a file named output.txt[cite: 55].
            System.out.println("Successfully wrote '" + data + "' to " + fileName); // Confirm that the data has been written[cite: 56].
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

// FileReading.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        String fileName = "output.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) { // Open output.txt for reading[cite: 58].
            String line;
            System.out.println("Contents of " + fileName + ":");
            while ((line = reader.readLine()) != null) { // Read each line and display it on the console[cite: 58].
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
// ArrayListExample.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store names[cite: 59].
        List<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("Enter student names (type 'done' to finish):");
        while (true) {
            System.out.print("Name: ");
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            studentNames.add(name); // Allow the user to add names to the list[cite: 60].
        }

        System.out.println("\nAll student names entered:");
        if (studentNames.isEmpty()) {
            System.out.println("No names entered.");
        } else {
            for (String student : studentNames) {
                System.out.println("- " + student); // Display all names entered[cite: 60].
            }
        }

        scanner.close();
    }
}
// HashMapExample.java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values[cite: 61].
        Map<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add student IDs and names (type 'done' for ID to finish adding):");
        while (true) {
            System.out.print("Enter student ID (or 'done'): ");
            String idInput = scanner.nextLine();
            if (idInput.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int id = Integer.parseInt(idInput);
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                studentMap.put(id, name); // Allow the user to add entries[cite: 62].
                System.out.println("Added: ID " + id + " -> " + name);
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID. Please enter a number or 'done'.");
            }
        }

        System.out.println("\nRetrieve student name by ID:");
        while (true) {
            System.out.print("Enter student ID to retrieve (or 'quit'): ");
            String idToRetrieveInput = scanner.nextLine();
            if (idToRetrieveInput.equalsIgnoreCase("quit")) {
                break;
            }
            try {
                int idToRetrieve = Integer.parseInt(idToRetrieveInput);
                String retrievedName = studentMap.get(idToRetrieve); // Retrieve a name based on an entered ID[cite: 62].
                if (retrievedName != null) {
                    System.out.println("Student Name for ID " + idToRetrieve + ": " + retrievedName); // Display a name based on an entered ID[cite: 62].
                } else {
                    System.out.println("Student with ID " + idToRetrieve + " not found.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID. Please enter a number or 'quit'.");
            }
        }

        scanner.close();
    }
}
// MyRunnable.java (Option 1: Implementing Runnable)
class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        // In the run() method, print a message multiple times[cite: 64].
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + ": Message " + i);
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }
}

// MyThread.java (Option 2: Extending Thread)
class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        // In the run() method, print a message multiple times[cite: 64].
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + ": Counting " + i);
            try {
                Thread.sleep(150); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }
}

// ThreadCreation.java
public class ThreadCreation {
    public static void main(String[] args) {
        System.out.println("Main Thread Started.");

        // Create and run two threads[cite: 63].

        // Option 1: Using Runnable (preferred for flexibility)
        // Define a class that extends Thread or implements Runnable[cite: 64].
        Thread thread1 = new Thread(new MyRunnable("RunnableThread"));
        thread1.start(); // Start both threads and observe the output[cite: 65].

        // Option 2: Extending Thread
        // Define a class that extends Thread or implements Runnable[cite: 64].
        MyThread thread2 = new MyThread("ExtendedThread");
        thread2.start(); // Start both threads and observe the output[cite: 65].

        // Main thread continues its execution
        for (int i = 0; i < 3; i++) {
            System.out.println("Main Thread: Still running...");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Main Thread interrupted.");
            }
        }

        System.out.println("Main Thread Finished.");
    }
}
// LambdaExpressions.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {
        // Create a List of strings[cite: 66].
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");
        names.add("David");

        System.out.println("Original List: " + names);

        // Use Collections.sort() with a lambda to sort the list[cite: 67].
        // The lambda (s1, s2) -> s1.compareTo(s2) provides the comparison logic.
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted List (Ascending): " + names); // Display the sorted list[cite: 67].

        // Another example: Sorting in descending order using lambda
        Collections.sort(names, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted List (Descending): " + names);
    }
}
// StreamAPIExample.java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        // Create a List of integers[cite: 68].
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Original List: " + numbers);

        // Use the Stream API to filter even numbers[cite: 69].
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(n -> n % 2 == 0) // Filter logic using lambda
                                            .collect(Collectors.toList()); // Collect the result[cite: 69].

        System.out.println("Even Numbers (using Stream API): " + evenNumbers); // Display the result[cite: 69].

        // Another example: Filter and map
        List<String> doubledStrings = numbers.stream()
                                            .filter(n -> n % 2 != 0) // Filter odd numbers
                                            .map(n -> "Number_" + (n * 2)) // Map to new strings
                                            .collect(Collectors.toList());
        System.out.println("Odd numbers doubled and mapped to strings: " + doubledStrings);
    }
}

// RecordsExample.java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecordsExample {
    public static void main(String[] args) {
        // Create instances of the Person record[cite: 72].
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Charlie", 16);
        Person person4 = new Person("David", 40);

        // Print them (toString() is automatically generated)[cite: 72].
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
        System.out.println("Person 3: " + person3);
        System.out.println("Person 4: " + person4);

        // Accessing components using generated accessor methods
        System.out.println("Person 1 Name: " + person1.name());
        System.out.println("Person 2 Age: " + person2.age());

        // Use records in a List[cite: 72].
        List<Person> people = Arrays.asList(person1, person2, person3, person4);

        System.out.println("\nAll people: " + people);

        // Filter based on age using Streams[cite: 72].
        List<Person> adults = people.stream()
                                    .filter(Person::isAdult) // Using the custom method
                                    .collect(Collectors.toList());

        System.out.println("Adults (age >= 18): " + adults);
    }
}
import java.sql.*;

public class DatabaseOperations {
    // IMPORTANT: Replace with your actual database URL, username, and password
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database_name?useSSL=false&serverTimezone=UTC";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            System.out.println("Successfully connected to the database!");

            // 1. Create Table (if not exists)
            createTable(connection);

            // 2. Insert Data
            insertUser(connection, "Alice");
            insertUser(connection, "Bob");
            insertUser(connection, "Charlie");

            // 3. Select Data
            System.out.println("\n--- All Users ---");
            selectUsers(connection);

            // 4. Update Data
            updateUser(connection, 1, "Alicia"); // Assuming Alice was ID 1

            System.out.println("\n--- Users after update ---");
            selectUsers(connection);

            // 5. Delete Data
            deleteUser(connection, 2); // Assuming Bob was ID 2

            System.out.println("\n--- Users after deletion ---");
            selectUsers(connection);

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            // In a real application, you'd log the full stack trace: e.printStackTrace();
        }
    }

    private static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS users ("
                   + "id INT AUTO_INCREMENT PRIMARY KEY,"
                   + "name VARCHAR(255) NOT NULL"
                   + ")";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Table 'users' ensured to exist.");
        }
    }

    private static void insertUser(Connection conn, String name) throws SQLException {
        String sql = "INSERT INTO users (name) VALUES (?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted for user: " + name);
        }
    }

    private static void selectUsers(Connection conn) throws SQLException {
        String sql = "SELECT id, name FROM users";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        }
    }

    private static void updateUser(Connection conn, int id, String newName) throws SQLException {
        String sql = "UPDATE users SET name = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, id);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated for ID: " + id);
        }
    }

    private static void deleteUser(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) deleted for ID: " + id);
        }
    }
}
import java.io.*;
import java.net.*;

public class SimpleServer {
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started on port " + PORT);
            System.out.println("Waiting for a client...");

            // Server listens for a client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Setup input and output streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // true for auto-flush

            String clientMessage;
            while ((clientMessage = in.readLine()) != null) {
                System.out.println("Client says: " + clientMessage);
                if (clientMessage.equalsIgnoreCase("bye")) {
                    break;
                }
                out.println("Server received: " + clientMessage);
            }

            System.out.println("Client disconnected.");
            clientSocket.close(); // Close client socket
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpServer {
    private static final int PORT = 9876;
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        try (DatagramSocket serverSocket = new DatagramSocket(PORT)) {
            System.out.println("UDP Server started on port " + PORT);
            byte[] receiveBuffer = new byte[BUFFER_SIZE];

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                serverSocket.receive(receivePacket); // Blocks until a packet is received

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                System.out.println("Received from " + clientAddress + ":" + clientPort + ": " + message);

                // Send a response back to the client
                String responseMessage = "Server received: " + message;
                byte[] sendBuffer = responseMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);

                if (message.equalsIgnoreCase("bye")) {
                    System.out.println("Client requested to exit. Server shutting down.");
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("UDP Server error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class WebContentFetcher {
    public static void main(String[] args) {
        String urlString = "http://example.com"; // Replace with a URL you want to fetch

        try {
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection(); // Open a connection

            // Set a user-agent to avoid being blocked by some sites
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3");

            // Get the input stream from the connection and read content
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                System.out.println("Content from " + urlString + ":\n");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error fetching web content: " + e.getMessage());
            // e.printStackTrace(); // For detailed error
        }
    }
}
mport java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Make the annotation available at runtime
@Target(ElementType.METHOD) // Can be applied to methods
public @interface MyCustomAnnotation {
    String author() default "Unknown";
    int revision() default 1;
    String description() default "No description provided.";
}
AnnotatedService.java

Java

public class AnnotatedService {

    @MyCustomAnnotation(author = "Jane Doe", revision = 2, description = "This method processes user data.")
    public void processUserData() {
        System.out.println("Processing user data...");
    }

    @MyCustomAnnotation(author = "John Smith") // Using default values for revision and description
    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void unannotatedMethod() {
        System.out.println("This method is not annotated.");
    }
}
AnnotationProcessor.java

Java

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) {
        try {
            Class<?> clazz = AnnotatedService.class;
            Object serviceInstance = clazz.newInstance(); // Create an instance of the class

            System.out.println("Inspecting methods of " + clazz.getName() + ":\n");

            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println("Method Name: " + method.getName());

                // Check if the method has our custom annotation
                if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
                    MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);

                    System.out.println("  -> Annotated with MyCustomAnnotation:");
                    System.out.println("     Author: " + annotation.author());
                    System.out.println("     Revision: " + annotation.revision());
                    System.out.println("     Description: " + annotation.description());

                    // Optionally, invoke the annotated method
                    method.invoke(serviceInstance);
                } else {
                    System.out.println("  -> Not annotated with MyCustomAnnotation.");
                }
                System.out.println("---");
            }

        } catch (Exception e) {
            System.err.println("Error processing annotations: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
36. HTTP Client (Java 11+)
This requires Java 11 or newer.

HttpClientExample.java

Java

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.time.Duration;

public class HttpClientExample {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        // --- GET Request Example ---
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/todos/1")) // A public API for testing
                .GET()
                .build();

        System.out.println("--- Sending GET Request ---");
        try {
            HttpResponse<String> getResponse = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println("GET Status Code: " + getResponse.statusCode());
            System.out.println("GET Response Body:\n" + getResponse.body());
        } catch (IOException | InterruptedException e) {
            System.err.println("Error during GET request: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n--- Sending POST Request ---");

        // --- POST Request Example ---
        String postBody = "{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}";
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(postBody))
                .build();

        try {
            HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println("POST Status Code: " + postResponse.statusCode());
            System.out.println("POST Response Body:\n" + postResponse.body());
        } catch (IOException | InterruptedException e) {
            System.err.println("Error during POST request: " + e.getMessage());
            e.printStackTrace();
        }
        public class MySimpleClass {
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        MySimpleClass obj = new MySimpleClass();
        System.out.println("Sum: " + obj.add(5, 7));
    }
}
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class MyReflectedClass {
    private String privateField = "I am private";
    public String publicField = "I am public";

    public MyReflectedClass() {
        // Default constructor
    }

    public MyReflectedClass(String msg) {
        this.privateField = msg;
    }

    public void publicMethod(String param) {
        System.out.println("Public method called with: " + param);
    }

    private String privateMethod(int number) {
        return "Private method result: " + (number * 2);
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // 1. Get Class object
            Class<?> clazz = Class.forName("MyReflectedClass"); // Use Class.forName()

            System.out.println("--- Class Information ---");
            System.out.println("Class Name: " + clazz.getName());
            System.out.println("Is Public: " + Modifier.isPublic(clazz.getModifiers()));

            // 2. Get Constructors
            System.out.println("\n--- Constructors ---");
            for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
                System.out.println("Constructor: " + constructor.getName() + " (Parameters: " + constructor.getParameterCount() + ")");
            }

            // 3. Get Methods
            System.out.println("\n--- Methods ---");
            // getDeclaredMethods() returns all methods declared in the class (public, private, protected, default)
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println("Method Name: " + method.getName());
                System.out.println("  Return Type: " + method.getReturnType().getName());
                System.out.print("  Parameters: ");
                for (Class<?> paramType : method.getParameterTypes()) {
                    System.out.print(paramType.getName() + " ");
                }
                System.out.println();
            }

            // 4. Invoke a public method dynamically
            System.out.println("\n--- Invoking Public Method ---");
            Object instance = clazz.newInstance(); // Create an instance
            Method publicMethod = clazz.getMethod("publicMethod", String.class);
            publicMethod.invoke(instance, "Dynamic Call");

            // 5. Access and manipulate a private method (requires setAccessible)
            System.out.println("\n--- Invoking Private Method ---");
            Method privateMethod = clazz.getDeclaredMethod("privateMethod", int.class);
            privateMethod.setAccessible(true); // Allow access to private method
            String privateResult = (String) privateMethod.invoke(instance, 10);
            System.out.println(privateResult);

            // 6. Access and manipulate fields
            System.out.println("\n--- Accessing Fields ---");
            Field publicField = clazz.getField("publicField");
            System.out.println("Public Field Value: " + publicField.get(instance));
            publicField.set(instance, "New Public Value");
            System.out.println("New Public Field Value: " + publicField.get(instance));

            Field privateField = clazz.getDeclaredField("privateField");
            privateField.setAccessible(true); // Allow access to private field
            System.out.println("Private Field Value: " + privateField.get(instance));
            privateField.set(instance, "New Private Value");
            System.out.println("New Private Field Value: " + privateField.get(instance));

        } catch (Exception e) {
            System.err.println("Reflection error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
        import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class VirtualThreadsExample {

    private static void performTask(int id) {
        // Simulate some work, like an I/O operation
        try {
            Thread.sleep(Duration.ofMillis(10)); // Simulate a blocking operation
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread " + id + " interrupted.");
        }
        // System.out.println("Thread " + id + " finished."); // Uncomment for more detailed output
    }

    public static void main(String[] args) throws InterruptedException {
        int numberOfTasks = 100_000; // Launch 100,000 tasks

        System.out.println("--- Running with Virtual Threads ---");
        Instant startVirtual = Instant.now();
        // Use Executors.newVirtualThreadPerTaskExecutor() for easy virtual thread creation
        try (ExecutorService virtualExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, numberOfTasks).forEach(i ->
                virtualExecutor.submit(() -> performTask(i))
            );
        } // virtualExecutor is automatically shut down by try-with-resources
        Instant endVirtual = Instant.now();
        System.out.println("Virtual threads took: " + Duration.between(startVirtual, endVirtual).toMillis() + " ms");
        System.out.println("Total tasks completed: " + numberOfTasks);


        System.out.println("\n--- Running with Platform Threads (Fixed Thread Pool) ---");
        // For comparison, let's use a fixed thread pool (a typical platform thread approach)
        // Adjust pool size based on your CPU cores for realistic comparison
        int numCores = Runtime.getRuntime().availableProcessors();
        System.out.println("Using fixed thread pool with " + numCores + " threads.");
        Instant startPlatformFixed = Instant.now();
        try (ExecutorService fixedExecutor = Executors.newFixedThreadPool(numCores)) {
            IntStream.range(0, numberOfTasks).forEach(i ->
                fixedExecutor.submit(() -> performTask(i))
            );
        }
        Instant endPlatformFixed = Instant.now();
        System.out.println("Fixed thread pool took: " + Duration.between(startPlatformFixed, endPlatformFixed).toMillis() + " ms");
        System.out.println("Total tasks completed: " + numberOfTasks);


        // Optional: Running with platform threads (cached pool - can create many threads)
        // This can lead to OutOfMemoryError for very large numbers of tasks depending on OS/JVM limits
        /*
        System.out.println("\n--- Running with Platform Threads (Cached Thread Pool) ---");
        Instant startPlatformCached = Instant.now();
        try (ExecutorService cachedExecutor = Executors.newCachedThreadPool()) {
            IntStream.range(0, numberOfTasks).forEach(i ->
                cachedExecutor.submit(() -> performTask(i))
            );
        }
        Instant endPlatformCached = Instant.now();
        System.out.println("Cached thread pool took: " + Duration.between(startPlatformCached, endPlatformCached).toMillis() + " ms");
        System.out.println("Total tasks completed: " + numberOfTasks);
        */

        System.out.println("\nComparison complete.");
    }
}
        import java.util.concurrent.Callable;

public class TaskCallable implements Callable<String> {
    private String taskName;
    private long sleepTimeMillis;

    public TaskCallable(String taskName, long sleepTimeMillis) {
        this.taskName = taskName;
        this.sleepTimeMillis = sleepTimeMillis;
    }

    @Override
    public String call() throws Exception {
        System.out.println(taskName + " starting on thread: " + Thread.currentThread().getName());
        Thread.sleep(sleepTimeMillis); // Simulate work
        String result = taskName + " completed on thread: " + Thread.currentThread().getName();
        System.out.println(result);
        return result; // Return a result
    }
}
