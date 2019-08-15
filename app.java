import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x, y, choices, results;
		
		System.out.println("First Java Calculator ");
		System.out.println("Enter the your numbers ");
		x = input.nextInt();
		y = input.nextInt();
		
		System.out.println("Please enter your chioces :");
		
		choices = input.nextInt();
		
		System.out.println(" 1. Addition");
		System.out.println(" 2. Subtraction");
		System.out.println(" 3. Multiplication");
		System.out.println(" 4. Division");

		
		operations op = new operations();
		if (choices == 1) {
			results = op.add(x, y);
			System.out.println("Your Answers: " + results);
		} else if (choices == 2) {
			results = op.sub(x, y);
			System.out.println("Your Answers: " + results);
		} else if (choices == 3) {
			results = op.multi(x, y);
			System.out.println("Your Answers: " + results);
		} else if (choices == 4) {
			results = op.div(x, y);
			System.out.println("Your Answers: " + results);
		} 
		

	}

}
