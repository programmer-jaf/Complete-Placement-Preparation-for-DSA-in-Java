package problem;

import java.util.Scanner;
// TODO: solve the problem on leetcode and Gfg as well
//? Leetcode link --> https://leetcode.com/problems/rotate-array/description/
//? Gfg link --> https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
public class arrayProblem07 {
  static void reverse(int[] array,int start,int end){
    while(start<end){
      int temp=array[start];
      array[start]=array[end];
      array[end]=temp;
      start++;
      end--;
    }
  }
  static void rotateArrayByDPlace(int[] array, int rotate) {
    int n = array.length-1;
    rotate = rotate % n;
    reverse(array, 0, rotate-1);
    reverse(array, rotate, n-1);
    reverse(array, 0, n);
  }
  
  public static void main(String[] args) {
    System.out.println("left rotate an array by D places");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the elements : ");
    for (int i = 0; i < size; i++) {
      
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter the number of rotations : ");
    int rotate = sc.nextInt();
    rotateArrayByDPlace(arr,rotate);
    System.out.println("Rotated array : ");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i]+" ");
    }
    sc.close();
  }
}
