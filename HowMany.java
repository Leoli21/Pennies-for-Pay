import java.util.Random;
import java.util.Scanner;

public class HowMany {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("How many times do you want to roll the die? ");
		int numTimes = input.nextInt();
		int countOne, countTwo, countThree, countFour, countFive, countSix;
		countOne = countTwo = countThree = countFour = countFive = countSix = 0;
		for (int i = 0; i < numTimes; i++)
		{
			int randomNumber = rand.nextInt(6) + 1;
			System.out.println("Number rolled: " + randomNumber);
			if (randomNumber == 1)
			{
				countOne += 1;
			}
			else if (randomNumber == 2)
			{
				countTwo += 1;
			}
			else if (randomNumber == 3)
			{
				countThree += 1;
			}
			else if (randomNumber == 4) {
				countFour += 1;
			}
			else if (randomNumber ==5)
			{
				countFive += 1;
			}
			else
			{
				countSix += 1;
			}
		}
		System.out.println("One: " + countOne);
		System.out.println("Two: " + countTwo);
		System.out.println("Three: " + countThree);
		System.out.println("Four: " + countFour);
		System.out.println("Five: " + countFive);
		System.out.println("Six: " + countSix);
	}

}
