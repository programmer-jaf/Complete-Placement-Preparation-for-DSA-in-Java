public class Loop {
  public static void main(String[] args) {
    System.out.println("Learn about Loop ➿ in java");
    // * what is loop ?
    // ? ans : loop is a block of code which runs continuously until a condition become false
    //* There are 4 types of loops in java
        // 1. for loop
        // 2. while loop
        // 3. do-while loop
    // Syntax of for loop
    /*
     * for(initialization,condition,updation){
     *  // code 
     * }
     */
    for (int i = 0; i < 15; i++) {
      System.out.print(i+" ");
    }
    // Syntax of while loop
    /*
     * while(condition){
        //* code
     * }
     */
    System.out.println();
    int i =0;
    while (i<15) {
      System.out.print(i+" ");
      i++;
    }
    // * do-while loop ❗ do-while loop run at-least one time if condition become false
    System.out.println();
    int j =15;
    do {
      System.out.print(j+" ");
      j++;
    } while (j<10);

    //* for-each loop it will be cover in the arrays section
  }
}
