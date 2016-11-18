public class FindFloorValue {
 
  public static void main(String[] args) {
   
    /*
     * To find a floor value, use
     * static double floor(double d) method of Math class.
     *
     * It returns a largest integer which is not grater than the argument value.
     */
   
    //Returns the same value
    System.out.println(Math.floor(70));
   
    //returns largest integer which is not less than 30.1, i.e. 30
    System.out.println(Math.floor(30.1));
   
    //returns largest integer which is not less than 15.5, i.e. 15
    System.out.println(Math.floor(15.5));
   
    //in this case it would be -40
    System.out.println(Math.floor(-40));
   
    //it returns -43.
    System.out.println(Math.floor(-42.4));
   
    //returns 0
    System.out.println(Math.floor(0));
   
  }
}