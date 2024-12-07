import java.util.Scanner;

public class patternProblem09 {
  public static void main(String[] args) {
    System.out.println("Print Inverted Number Triangle 📐");
    // * Solution ✅
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of row");
    int row = sc.nextInt();
    for (int i = row; i >0; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
