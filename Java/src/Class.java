class Dog {
  String name = "Pit-bull";
  int legs = 4;
}
public class Class {
  public static void main(String[] args) {
    System.out.println("learn about classes");
    // * What is class ?
    // ? ans : class is a user defined blueprint with some properties and behavior attached.
    // * How to create a class ?
    // ? ans :
    /*
       Syntax :
     *  access-modifier class name-of-the-class{
        * properties and behavior
     * }
     */
    //* How to call a class ?
    // ? ans:
    Dog pitBull = new Dog();
    /*
     * Break down this line --> Dog pitBull = new Dog();
      * Dog --> the name of the class
      * pitBull --> variable name. you can use what ever you want.
      * new --> if you don't use new keyword it might not be store as an Object in Heap Memory
      * Dog() --> Dog() is a constructor.It's Default constructor.
     */
    // Access properties
    System.out.println("The name of the Dog is "+pitBull);
    System.out.println(pitBull.legs);
  }
}
