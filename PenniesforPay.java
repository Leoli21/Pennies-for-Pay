import java.util.Scanner;

public class PenniesforPay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many days? ");
		int days = input.nextInt();
		double numPennies = 0;
		double pennyValue = 0.01;
		for (int i = 0; i < days; i++)
		{
			numPennies = Math.pow(2, days);
		}
		double salary = numPennies * pennyValue;
		System.out.println("The salary for " + days + " days is "  + salary );
 
	}

}
