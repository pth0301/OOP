// Calculate sum, difference, product, and quotient of 2 double numbers
import java.util.Scanner;
public class DoubleNumbers {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double sum = a + b;
		System.out.println("Sum of 2 numbers: " + sum);
		double difference = a - b;
		System.out.println("Difference of 2 numbers: " + difference);
		double product = a * b;
		System.out.println("Product of 2 numbers: " + product);
		double quotient = a % b;
		if (b != 0) {
			System.out.println("Quotient of 2 numbers: " + quotient);
			
		}
		else {
			System.out.println("Not divide by zero");
		}
		
	}

}
