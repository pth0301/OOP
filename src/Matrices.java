// Write a java program to add two matrices of the same size
import java.util.Scanner;
public class Matrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr1 = new int[m][n];
		int[][] arr2 = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		for (int k = 0; k < m; k++) {
			for (int l = 0; l < n; l++) {
				System.out.print((arr1[k][l] + arr2[k][l]) + " ");
			}
			System.out.println();
		}
	}

}
