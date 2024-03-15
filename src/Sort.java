// write a java program to sort a numeric array, and calculate the sum and average value of array elements
import java.util.Arrays;
import java.util.Scanner;
//import 
public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		System.out.println("Sorted array: " + Arrays.toString(arr));
		System.out.println("Sum of array elements: " + sum);
		System.out.println("Average of array elemants: " + (sum / (arr.length)));
	}
}
