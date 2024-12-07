import java.util.Scanner;

public class patternProblem06 {
  public static void main(String[] args) {
    System.out.println("print Hollow Square Pattern");
    //* Solution
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of row");
    int row = sc.nextInt();
    System.out.println("Enter the number of col");
    int col = sc.nextInt();
    for (int i = 0; i <row ; i++) {
      for (int j = 0; j < col; j++) {
        if (i==0 || i==row-1 || j==0 || j==col-1) {
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
