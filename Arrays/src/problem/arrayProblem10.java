package problem;

import java.util.Scanner;

// TODO: solve this problem for tomorrow
// *LINK - Gfg link --> https://www.geeksforgeeks.org/linear-search/
public class arrayProblem10 {
  /**
   * A linear search function which will search for a given key in an array,
   * if the key is present in the array then it will return the index of the key
   * else it will return -1
   * @param arr the array to be searched
   * @param key the element to be searched
   * @return index of the key if present else -1
   */
  static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    System.out.println("solve linear search problem");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the elements : ");
    for (int i = 0; i < size; i++) {
      
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter the key to be searched : ");
    int key = sc.nextInt();
    int index = linearSearch(arr, key);
    System.out.println("The index of the key is "+index);
    sc.close();
  }
}