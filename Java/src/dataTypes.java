public class dataTypes {
  public static void main(String[] args) {
    System.out.println("Learn about data types in java");
    // * what is datatype?
    // ? ans : datatype store different types of data with different values
    /*
    There are two types of datatype in java
    1. primitive
      1. byte
      2. short
      3. int
      4. float
      5. double
      6. long
      7. char
      8. boolean
    2. non-primitive
      1. Array
      2. String
      3. Class
      4. Objects
      5. Interface
    */
    //* 1. primitive
    // byte
    byte byteValue = 127;
    System.out.println("The byte value is "+byteValue);
    // short
    short shortValue = 32000;
    System.out.println("The short value is "+shortValue);
    // int
    int intValue = 112445644;
    System.out.println("The int value is "+intValue);
    // float
    float floatValue = 1245.1541f;
    System.out.println("The float value is "+floatValue);
    // double
    double doubleValue = 124.054164545;
    System.out.println("The double value is "+doubleValue);
    // long
    long longValue = 124854642324L;
    System.out.println("The long value is "+longValue);
    // char
    char charValue = 'a';
    System.out.println("The char value is "+charValue);
    // boolean 
    boolean booleanValue = true;
    System.out.println("The boolean value is "+booleanValue);

    //* 2. non-primitive
    // ! Classes, Objects and Interfaces will cover when it will be in future
    // String
    String StringValue = "Hello world";
    System.out.println("The String value is "+StringValue);
    // Array
    int[] arr = {5,24,4,6,47,8};
    System.out.println("The array's first value is "+arr[0]);
  }
}
