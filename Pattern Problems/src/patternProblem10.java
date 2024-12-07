import java.util.Scanner;

public class patternProblem10 {
  public static void main(String[] args) {
    System.out.println("🖨️ Floyd's Triangle");
    //* Solution ✅
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    int count=1;
    System.out.println();
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(count+" ");
        count++;
      }
      System.out.println();
    }
    sc.close();
  }
}
