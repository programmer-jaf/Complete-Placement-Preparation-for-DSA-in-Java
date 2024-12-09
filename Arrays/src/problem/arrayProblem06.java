package problem;

import java.util.Scanner;

// ? Gfg link --> https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
public class arrayProblem06 {
// *brute-force
	static int[] rotateOne(int[] arr){
		int temp= arr[0];
		int[] array= new int[arr.length];
		int index=0;
		for (int i = 1; i < arr.length; i++) {
			array[index++] = arr[i];
		}
		array[array.length-1] = temp;
		return array;
	}
	public static void main(String[] args) {
		System.out.println("Left rotate an array by One Place");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.print("Enter the elements : ");
		for (int i = 0; i < size; i++) {

			array[i] = sc.nextInt();
		}
//  call method
		int[] arr = rotateOne(array);
		for(int i : arr){
			System.out.print(+i+" ");
		}
	}
}
