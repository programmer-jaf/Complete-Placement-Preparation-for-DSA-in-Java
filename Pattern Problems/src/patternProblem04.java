public class patternProblem04 {

  public static void main(String[] args) {
    System.out.println("print Pyramid Pattern");
    // * solution
    for (int i = 0; i < 4; i++) {
      for (int j = 4-i; j >0; j--) {
        System.out.print("  ");
      }
      for (int j = 0; j <= 2*i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
