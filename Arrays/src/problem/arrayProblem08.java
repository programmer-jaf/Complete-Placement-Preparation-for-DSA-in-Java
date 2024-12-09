package problem;

import java.util.Scanner;

//? Gfg link --> https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class arrayProblem08 {
  static int findMissingNumber(int[] arr) {
    int sum = 0;
    int n = arr.length+1;
    for (int i = 0; i < n-1; i++) {
      sum += arr[i];
    }
    int expectedSum = (n * (n + 1)) / 2;
    return expectedSum - sum;
  }
  public static void main(String[] args) {
    System.out.println("find the missing number in an array problem");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the elements : ");
    for (int i = 0; i < size; i++) {
      
      arr[i] = sc.nextInt();
    }
    int missingNumber = findMissingNumber(arr);
    System.out.println("The missing number is : "+missingNumber);
    sc.close();
  }
}
