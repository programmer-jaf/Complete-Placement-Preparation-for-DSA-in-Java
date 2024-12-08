package problem;

import java.util.Scanner;

public class arrayProblem02 {
  //* brute-force using sorting like bubble,selection,insertion
  
  // * better-solution
  static int findLargest(int[] arr){
    int largest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]>largest){
        largest=arr[i];
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
    sc.close();
  }
}
