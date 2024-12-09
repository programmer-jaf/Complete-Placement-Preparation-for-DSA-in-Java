package problem;
import java.util.Scanner;

// Gfg link --> https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1

public class arrayProblem04 {
	static boolean isArraySorted(int[] arr){
		for (int i = 1; i < arr.length-1; i++) {
			if (arr[i] >= arr[i-1]) {
			}
			else{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("check if the array is sorted");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.print("Enter the elements : ");
		for (int i = 0; i < size; i++) {

			array[i] = sc.nextInt();
		}
	boolean result= isArraySorted(array);
	System.out.println("Is the array is sorted is it "+result);
	sc.close();
	}
}
