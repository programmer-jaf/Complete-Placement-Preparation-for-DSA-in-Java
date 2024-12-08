package problem;

import java.util.Scanner;

//* GfG link --> https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

public class arrayProblem03 {
  // * find smallest
  static int findSmallest(int[] arr){
  int smallest = Integer.MAX_VALUE;
  for (int i = 0; i < arr.length; i++) {
    if(arr[i]<smallest){
      smallest=arr[i];
    }
  }
  return smallest;
  }
  // * find secondSmallest
  static int findSecondSmallest(int[] arr){
    int smallest = findSmallest(arr);
    int secondSmallest = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]<secondSmallest && arr[i]!=smallest) {
        secondSmallest= arr[i];
      }
    }
    return secondSmallest;
  }
  public static void main(String[] args) {
    System.out.println("solve find the smallest and second smallest element in an array");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the elements : ");
    for (int i = 0; i < size; i++) {
      
      arr[i] = sc.nextInt();
    }
    int smallest = findSmallest(arr);
    int secondSmallest = findSecondSmallest(arr);
    System.out.println("the smallest value is "+smallest);
    System.out.println("the second smallest value is "+secondSmallest);
    sc.close();
  }
}
