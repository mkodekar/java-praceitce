import java.util.Scanner;

public class Practice2 {

	// User input
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("your favorite number: ");

		if (userInput.hasNextInt()) {

			int numberEntered = userInput.nextInt();

			int numEnteredTimes2 = numberEntered + numberEntered;

			System.out.println(numberEntered + " + " + numberEntered + " = "
					+ numEnteredTimes2);

			int numEnteredMinus2 = numberEntered - 2;

			System.out.println(numberEntered + " - 2 " + " = "
					+ numEnteredMinus2);
			
			int numEnteredMultiply2 = numberEntered * 2;

			System.out.println(numberEntered + " * 2 " + " = "
					+ numEnteredMultiply2);
			
			int numEnteredDivide2 = numberEntered / 2;

			System.out.println(numberEntered + " / 2 " + " = "
					+ numEnteredDivide2);
			
			int numEnteredModulas2 = numberEntered % 2;

			System.out.println(numberEntered + " % 2 " + " = "
					+ numEnteredModulas2);
			
			numberEntered +=2;
			numberEntered -=2;
			numberEntered--;
			numberEntered++;
			
			int numberAbs = Math.abs(numberEntered);
			
			System.out.println(numberAbs);
			
			int whichIsBigger = Math.max(numEnteredMinus2, numEnteredMultiply2);
			
			System.out.println("The Bigger number is : " + whichIsBigger);
			
			
			int whichIsSmaller = Math.min(numEnteredMinus2, numEnteredDivide2);
			
			System.out.println("The Smaller number is : " + whichIsSmaller);
			
			int numberCieling = (int) Math.ceil(numEnteredModulas2);
			
			int numberFloor = (int) Math.floor(numEnteredModulas2);
			
			int numberRound = (int) Math.round(numEnteredModulas2);
			
			double numberSqrt  = Math.sqrt(numberEntered);
			
			
			int randomRumber = (int) (Math.random() * numberEntered);
			
			System.out.println(numberCieling);
			System.out.println(numberFloor);
			System.out.println(numberRound);
			System.out.println(numberSqrt);

			System.out.println("You entered " + numberEntered);
			
		} else {
			System.out.println("Enter an Integer next time");
		}
	}

}