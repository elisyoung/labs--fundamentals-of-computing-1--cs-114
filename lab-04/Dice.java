// *****************************************************************************
// Dice.java
//
// Simulates the rolling of a pair of dice.
// *****************************************************************************

import java.util.Random;

public class Dice {
  public static void main(String[] args) {
    Random generator = new Random();
    int die1, die2;

    die1 = generator.nextInt(6) + 1;
    die2 = generator.nextInt(6) + 1;

    System.out.println("the first roll is " + die1);
    System.out.println("the second roll is " + die2);
    System.out.println("the sum of the two rolls is " + (die1 + die2));
  }
}
