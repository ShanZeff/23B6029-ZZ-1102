public class Activity08_03 {
  public static void main(String[] args) {
    int numberPos = 0;
    int counter01 = 1;
    int counter02 = 2;
    
    while (counter01 <= 10) {
      numberPos = numberPos + 2;
      System.out.print(numberPos);
      System.out.print(" ");
      
      ++counter01;
    } 
    
    System.out.println();
    int numberNeg = numberPos;

    while (counter02 <= 10) {     
      System.out.print(numberNeg);
      System.out.print(" ");
      numberNeg = numberNeg - 2;
      ++counter02;
  }
}
}