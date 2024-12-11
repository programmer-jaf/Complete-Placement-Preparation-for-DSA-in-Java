package problems;

import java.util.Scanner;
// GfG link --> https://www.geeksforgeeks.org/problems/second-largest3735/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class arrayProblem02 {
  //* brute-force using sorting like bubble,selection,insertion
  
  // * better-solution
  static int findLargest(int[] arr){
    int largest = arr[0];
      for (int j : arr) {
          if (j > largest) {
              largest = j;
          }
      }
    return largest;
  }
  static int findSecondLargest(int[] arr){
    int largest = findLargest(arr);
    int secondLargest=arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]>secondLargest && arr[i]!= largest){
        secondLargest = arr[i];
      }
    }
    return secondLargest;
  }
  //* Optimized solution
  static int findSecondLargestOptimized(int[] arr){
    int largest = arr[0];
    int secondLargest = -1;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]>largest){
      secondLargest = largest;
      largest =arr[i];
      }
      else if (arr[i]>secondLargest && arr[i]!=largest) {
        secondLargest=arr[i];
      }
    }
    return secondLargest;
  }
  public static void main(String[] args) {
    System.out.println("find the second largest element in an array");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the elements : ");
    for (int i = 0; i < size; i++) {
      
      arr[i] = sc.nextInt();
    }
    int result = findSecondLargest(arr);
    System.out.println("The second largest value "+result);
    int optimizedResult = findSecondLargestOptimized(arr);
    System.out.println("find second largest using optimized result "+optimizedResult);
    sc.close();
  }
}
