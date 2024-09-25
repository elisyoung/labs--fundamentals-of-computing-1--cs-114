// *****************************************************************************
// Distance.java
//
// Computes the distance between two points.
// *****************************************************************************

import java.util.Scanner;

public class Distance {
  public static void main (String[] args) {
    double x1, y1, x2, y2; // The coordinates of two points
    double distance;       // The distance between the points

    Scanner input = new Scanner (System.in);

    // Read in the two points
    System.out.print ("Enter the coordinates of the first point " +
      "(put a space between them): ");
    x1 = input.nextDouble();
    y1 = input.nextDouble();

    System.out.print ("Enter the coordinates of the second point: ");
    x2 = input.nextDouble();
    y2 = input.nextDouble();

    // Compute the distance
    distance = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));

    // Print out the answer
    System.out.println("the distance between the points is " + distance);

    input.close();
  }
}
