import java.util.Scanner;

public class userInput {
  public static void main(String[] args) {
    System.out.println("Let's learn about user 🖨️ in java");
    // * First import the Scanner class
    // * What is Scanner ?
    // ? ans : Scanner is built in class in java.which located in java.util package.Scanner allows to take inputs from the various resources like keyboards,files and Streams.
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the byte value");
    // byte
    byte byteValue = sc.nextByte();
    System.out.println("The byte value is "+byteValue);
    // short
    System.out.println("Enter the short value");
    short shortValue = sc.nextShort();
    System.out.println("The short value is "+shortValue);
    // int
    System.out.println("Enter the int value");
    int intValue = sc.nextInt();
    System.out.println("The int value is "+intValue);
    // float
    System.out.println("Enter the float value");
    float floatValue = 1245.1541f;
    System.out.println("The float value is "+floatValue);
    // double
    System.out.println("Enter the double value");
    double doubleValue = 124.054164545;
    System.out.println("The double value is "+doubleValue);
    // long
    System.out.println("Enter the long value");
    long longValue = 124854642324L;
    System.out.println("The long value is "+longValue);
    // char
    System.out.println("Enter the char value");
    char charValue = sc.next().charAt(0);
    System.out.println("The char value is "+charValue);
    // boolean 
    System.out.println("Enter boolean value");
    boolean booleanValue = sc.nextBoolean();
    System.out.println("The boolean value is "+booleanValue);
    // String
    sc.nextLine();
    System.out.println("Enter a String");
    String StringValue = sc.nextLine();
    System.out.println("The String value is "+StringValue);
    // ! Best Practice to close the Scanner. it leaks memory.
    sc.close();
  }
}
