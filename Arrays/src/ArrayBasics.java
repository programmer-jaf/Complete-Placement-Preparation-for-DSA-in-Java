public class ArrayBasics {
  public static void main(String[] args) {
    //! What is an array ?
    // * ans --> An Array is a collection similar types of datatype of data in contiguous way
    System.out.print("Array basics ");
    // *NOTE - There are 3 way to create an array
    // ? 01.
    int[] arr = new int[5];
    arr[0] = 5;
    arr[1] = 7;
    arr[2] = 3;
    arr[3] = 9;
    System.out.println(arr[0]);
    
    // ? 02.
    int[] brr = {1,4,57,9,76,3,5};
    System.out.println(brr[2]);
    
    // ? 03.
    int[] crr;
    crr=new int[4];
    crr[1] = 24;
    System.out.println(crr[1]);
    
    // add new line
    System.out.println();
    // * iterate an array
    //! call arr 
    for(int i : arr){
    System.out.print(i+" ");
    }
    System.out.println();
  }
}
