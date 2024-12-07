public class patternProblem05 {
  public static void main(String[] args) {
    System.out.println("print Diamond Star Pattern");
    // * Solution
    // ✅ for Upper Bound
    int row = 4;
    for (int i = 0; i <row; i++) {
      // print spaces
      for (int j = row-i; j>1 ; j--) {
        System.out.print(" ");
      }
      // print star
      for (int j = 0; j <= 2*i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // ✅ now for lower bound
    for (int i = row-2; i >=0; i--) {
    // print spaces
      for (int j = row-i; j >1; j--) {
        System.out.print(" ");
      }
    // print star
      for (int j = 0; j<=2*i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
  
}
