// Write a program to display the number of days of a month
import java.util.Scanner;
public class DaysOfMonth {
	public static boolean is_leap_year(int b) {
		if ((b % 4 == 0 && b % 100 != 0) || (b % 400 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void month(int a, int b) {
		if (a % 2 != 0) {
			System.out.println("The number of days: " + 31);
		}
		else if (a == 2) {
			if (is_leap_year(b)) {
				System.out.println("The number of days: " + 29);
			}
			else {
				System.out.println("The number of days: " + 28);
			}
		}
		else {
			System.out.println("The number of days: " + 30);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a < 1 || a > 13) {
			System.out.println("Invalid month. Please enter again ");
		}
		boolean validyear = false;
		while (!validyear) {
			if (sc.hasNextInt()) {
				int b = sc.nextInt();
				if (b < 1) {
					System.out.println("Invalid year. Please enter a positive year: ");
				}
				else {
					validyear = true;
					month(a,b);
				}
			}
			else{
				System.out.println("Invalid year. Please enter again: ");
				sc.next();
			}
			
		}
		sc.close();
	}

}
