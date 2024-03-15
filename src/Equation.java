import java.util.Scanner;
import math;
public class Equation {
	public static void onevariable(double a, double b) {
		if (a == 0) {
			if (b ==0) {
				System.out.println("countless solutions");
			}
			else {
				System.out.println("No solution");
			}
		}
		else {
			double x = -b / a;
			System.out.println("Solution x: " + x);
		}
	}
	public static void twovariable(int a11, int a12, int a21, int a22, int b1, int b2) {
		int D = a11 * a22 - a21 * a12;
		int D1 = b1 * a22 - b2 * a12;
		int D2 = a11 * b2 - a21 * b1;
		if (D != 0) {
			double x1 = D1/D;
			System.out.println("Solution x1: " + x1);
			double x2 = D2/D;
			System.out.println("Solution x2: " + x2);
		}
	}
	public static void twodegree(double a, double b, double c) {
		if (a == 0) {
			onevariable(b,c);
		}
		else {
			double delta = Math.pow(b,2) - 4*a*c;
			if (delta == 0) {
				double root = -b / (2 * a);
				System.out.println("The equation has a double solution: " + root);
			}
			else if (delta > 0) {
				double root1 = (-b + Math.sqrt(delta)) / (2 * a);
				double root2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("The equation has 2 distinct solutions: " + root1 + " and " + root2);
			}
			else {
				System.out.println("No solution");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		int a11 = sc.nextInt();
		int a12 = sc.nextInt();
		int a21 = sc.nextInt();
		int a22 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		onevariable(a,b);
		twovariable(a11,a12,a21,a22,b1,b2);
		twodegree(a,b,c);
		
	}
	
}
