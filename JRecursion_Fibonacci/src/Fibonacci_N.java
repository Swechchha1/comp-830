import java.util.Scanner;

public class Fibonacci_N {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		while (true) {

			System.out.println("Enter a number:\n");
			 int input = reader.nextInt();

			System.out.println("Nth Fibonacci number : " + getFib(input));
			
		}
		//reader.close();
	}
	 
	private static int getFib(int n) {
		if (n == 1)
			return 0;

		if (n == 2)
			return 1;

		if (n == 3)
			return 1;

		else
			return getFib(n - 1) + getFib(n - 2);
	}

}
