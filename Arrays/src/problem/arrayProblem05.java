package problem;

// ? Leetcode Link --> https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// ? Gfg Link --> https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

import java.util.Scanner;

public class arrayProblem05 {
	static int removeDuplicates(int[] arr){
		if(arr.length==0) return 0;
		int i=0;
		for (int j=1;j<arr.length;j++){
			if (arr[j]!=arr[i]){
				i++;
				arr[i] = arr[j];
			}
		}
		return i+1;
	}
	public static void main(String[] args) {
		System.out.println("solve remove Duplicates from a sorted array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.print("Enter the elements : ");
		for (int i = 0; i < size; i++) {

			array[i] = sc.nextInt();
		}
		int result = removeDuplicates(array);
		System.out.println("After removing duplicates there are only  "+result+" values in the array");
		sc.close();
	}
}
