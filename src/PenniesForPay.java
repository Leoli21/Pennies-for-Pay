import java.util.Scanner;

public class PenniesForPay {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many days? ");
		int daysWorked = input.nextInt();
		double finalSalary = 0;
		double pennyValue = 0.01;
		for (int days = 1; days <= daysWorked; days++)
		{
			System.out.println("Day: " + days + "\t \t \t \tSalary: " + pennyValue);
			finalSalary += pennyValue;
			pennyValue = pennyValue * 2;
		}
		System.out.println("The salary for " + daysWorked + " days is "  + finalSalary);
		 
		}

}


