import java.util.Scanner;
// File:     Errors.java
// Purpose: A program with lots of syntax errors
// Correct all of the errors (STUDY the program carefully!!)
public class Error2 {
  public static void main (String[] args) {
    String name; // Name of the user
    int number, numSquared;

    Scanner scan = new Scanner(System.in);
    System.out.print ("Enter your name, please: ");
    name = scan.next();
    System.out.print ("What is your favorite number? ");
    number = scan.nextInt();
    numSq = number * number;
    System.out.println (name + ", the square of your number is " + numSquared);
  }
}
