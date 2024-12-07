public class patternProblem03 {
  public static void main(String[] args) {
    System.out.println("print Inverted Right-Angled Triangle");
    // * Solution 
    for (int i = 4; i >0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
