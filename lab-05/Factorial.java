import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    int userInput, calculatedFactorial = 1;

    Scanner input = new Scanner(System.in);

    System.out.print("please enter a non negative integer: ");
    userInput = input.nextInt();

    while(userInput < 0){
      System.out.print("this value is negative, please enter a valid value: ");
      userInput = input.nextInt();
    }

    if(userInput == 0){
      calculatedFactorial = 1;
    } else {
      for(int count = 1; count <= userInput; count++){
        calculatedFactorial *= count;
      }
    }

    System.out.println(userInput + "! = " + calculatedFactorial);

  }
}
