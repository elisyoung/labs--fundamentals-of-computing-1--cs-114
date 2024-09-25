// *****************************************************************************
// File: Paint.java
//
// Purpose: Determine how much paint is needed to paint the walls of a room
// given its length, width, and height
// *****************************************************************************
import java.util.Scanner;

public class Paint {
  public static void main(String[] args) {
    final int COVERAGE = 350;  //paint covers 350 sq ft/gal
    int length, width, height;
    double totalSqFt, paintNeeded;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the length of the room: ");
    length = scan.nextInt();
    System.out.print("Enter the width of the room: ");
    width = scan.nextInt();
    System.out.print("Enter the height of the room: ");
    height = scan.nextInt();
    totalSqFt = (2 * length * height)+(2 * width * height);
    paintNeeded = totalSqFt / COVERAGE;
    System.out.println("A " + length + "x" + width + "x" + height + " room requires " + paintNeeded + " gallons of paint");

      // Declare integers length, width, and height.
      // Declare double totalSqFt;
      // Declare double paintNeeded;
      // Declare and initialize a Scanner object.
      // Prompt for and read in the length of the room
      // Prompt for and read in the width of the room
      // Prompt for and read in the height of the room
      // Compute the total square feet to be painted — think
      // about the dimensions of each wall.
      // Compute the amount of paint needed.
      // Print the length, width, and height of the room and the
      // number of gallons of paint needed.
  }
}
