import java.util.Scanner;

public class operators {
  public static void main(String[] args) {
    System.out.println("Let's learn about operators 🔣");
    // * What is an Operator?
    // ? ans : Operators is a programming keyword which perform one or more operation to produce a result.
    /* There are 6 Types of Operators in java
      * Assignment Operator
      * Arithmetic Operator
      * Relational Operator
      * Logical Operator
      * Bitwise Operator
      * Ternary Operator
    */

    Scanner sc = new Scanner(System.in);
    // * Assignment Operator
    // 🟰
    int one = 1;
    System.out.println("The value of one 🟰 "+one);
    // ➕🟰
    one+=5;
    System.out.println("The value of one ➕🟰 "+one);
    // ➖🟰
    one-=5;
    System.out.println("The value of one ➖🟰 "+one);
    // ✖️🟰
    one*=5;
    System.out.println("The value of one ✖️🟰 "+one);
    // ➗🟰 
    one/=5;
    System.out.println("The value of one ➗🟰 "+one);
    // Modulo (🔢🟰)
    one%=5;
    System.out.println("The value of one 🔢🟰 "+one);

    // * Arithmetic Operator
    System.out.println("Enter number one");
    int numberOne = sc.nextInt();
    System.out.println("Enter number two");
    int numberTwo = sc.nextInt();
    // ➕ Operator
    System.out.println("The sum of numberOne ➕ numberTwo is "+(numberOne+numberTwo));
    // ➖ Operator
    System.out.println("The sum of numberOne ➖ numberTwo is "+(numberOne-numberTwo));
    // ✖️ Operator
    System.out.println("The sum of numberOne ✖️ numberTwo is "+(numberOne*numberTwo));
    // ➗ Operator
    System.out.println("The sum of numberOne ➗ numberTwo is "+(numberOne/numberTwo));
    // 🔢 Operator
    System.out.println("The sum of numberOne 🔢 numberTwo is "+(numberOne%numberTwo));

    // * Relational Operator
    int numTwo = 8;
    int numOne = 15;
    // greater than(➡️ >)
    System.out.println("is 15 is > 8 is it "+(numOne>numTwo));
    // greater than or equal(🔼 >=)
    System.out.println("is 15 is >= 8 is it "+(numOne>=numTwo));
    // less than(⬅️ <)
    System.out.println("is 15 is < 8 is it "+(numOne<numTwo));
    // less than or equal(🔽 <=)
    System.out.println("is 15 is <= 8 is it "+(numOne<=numTwo));
    // equals to (🟰🟰)
    System.out.println("is 15 🟰🟰 8 is it "+(numOne==numTwo));
    // Not equals ❗🟰
    System.out.println("is 15 ❗🟰  8 is it "+(numOne!=numTwo));

    // * Logical Operator

    // Logical and (&&) --> ❗ if both condition becomes true
    System.out.println("is 15 ❗🟰 10 && 15 > 10 "+((numOne!=10) && (numOne>numTwo)));
    
    // Logical Or (||) --> ❗ if one condition becomes true
    System.out.println("is 15 ❗🟰 10 || 15 > 10 "+((numOne!=10) || (numOne>numTwo)));
    // Not Operator(❗)
    System.out.println("❗ Operator convert true to false and false to "+(!true));

    // * Ternary Operator
    String result = (numOne>numTwo) ? "Num one is greater " : "Num two is greater";
    System.out.println("The result is "+result);


    sc.close();
  }
}
