import java.util.Scanner;

public class LoveCS {
  public static void main(String[] args) {
    int max, count = 1, sum = 0;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    max = input.nextInt();

    System.out.println();

    while (count <= max) {
      System.out.println(count + ". I love Computer Science!!");
      sum += count;
      count++;
    }

    System.out.println("the message was printed " + (count - 1) + " times");
    System.out.println("the sum of the values is " + sum);
  }
}
