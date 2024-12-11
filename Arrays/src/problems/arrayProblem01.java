package problems;
import java.util.Scanner;
// GfG Link --> https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0
public class arrayProblem01 {
  // * brute-force using sorting like bubble,selection,insertion.
  // ? Optimized
  static int findLargest(int[] arr){
    int largest=arr[0];
      for (int j : arr) {
          if (j > largest) {
              largest = j;
          }
      }
    return largest;
  }
  public static void main(String[] args) {
    System.out.println("find the largest element in an array");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the elements : ");
    for (int i = 0; i < size; i++) {
      
      arr[i] = sc.nextInt();
    }
    int result= findLargest(arr);
    System.out.println("The largest element of an array is "+result);
    sc.close();
  }
}
