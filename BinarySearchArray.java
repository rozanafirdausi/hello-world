import java.util.Arrays;

public class BinarySearchArray{
   public static void main(String[] args) {
    int intArray[] = {1,2,4,5};
    
    Arrays.sort(intArray);
    
    //nilai yang dicari
    int searchValue = 2;
    
    int intResult = Arrays.binarySearch(intArray,searchValue);
    System.out.println("Result of binary search of 2 is: " + intResult);
    
    //ganti nilai yg dicari
    searchValue = 3;
    intResult = Arrays.binarySearch(intArray,searchValue);
    System.out.println("Result of binary search of 3 is: " + intResult);
   }
}
