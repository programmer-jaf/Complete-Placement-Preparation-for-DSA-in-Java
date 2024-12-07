import java.util.Scanner;

public class patternProblem07 {
  public static void main(String[] args) {
    System.out.println("print Hollow Right-Angled Triangle");
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= i; j++) {
        if (j==1 || j==i || i==row) {
          System.out.print("* ");
        }else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
