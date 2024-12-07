import java.util.Scanner;

public class conditional {
  public static void main(String[] args) {
    System.out.println("learn about conditionals");
    //* What is conditionals ?
    //? ans: conditionals is a programming construct that executes a block of code if a conditions is evaluate to true.
    /* Syntax of if conditionals
      if(condition){
        * code
      }
    */
    // * When else-if condition will be execute ?
      // ? ans: When if condition becomes false then else-if will be execute
    /* Syntax of else-if conditionals
      else if(condition){
        * code
      }
    */

    // * When else condition will be execute ?
      // ? ans: When if and else-if condition becomes false then else will be execute
    /* Syntax of else-if conditionals
      else{
        * code
      }
    */
    // ! write a program that takes your age as an input and define your age into baby,teen,adult,old
      // ? ans:
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your age : ");
      int age = sc.nextInt();
      if (age>0 && age<10) {
        System.out.println("You are a baby 👶"); 
      } else if(age>11 && age < 18){
        System.out.println("You are a teen 👦");
      }else if(age>=18 && age<=60){
        System.out.println("You are an adult 🙍‍♂️");
      }else if(age>60 && age<150){
        System.out.println("You are an old person 👴");
      }else{
        System.out.println("Your age is not valid");
      }

    // ! write a program that you are eligible to drive or not
    if(age>=18 && age<=65) {
      System.out.println("You are eligible to drive a 🚗");
    }else{
      System.out.println("You are not eligible to drive a 🚗");
    }
      sc.close();
  }
}
