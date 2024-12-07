public class patternProblem02 {
  public static void main(String[] args) {
    System.out.println("print Right-Angled Triangle");
    // * solution
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
