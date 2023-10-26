public class Array02_Slide08 {
  public static void main(String[] args) {
    int[][] scores = new int[5][4];
    
    one(scores);
    System.out.println("");
    two(scores);
  }
  
  public static void one(int[][] scores) {
    for (int row = 0; row < 5; row++) {
      for (int col = 0; col < 4; col++) {
        scores[row][col] = col;
      }
    }
    printArray(scores);
  }
  
  public static void two(int[][] scores) {
    for (int row = 0; row < 5; row++) {
      for (int col = 0; col < 4; col++) {
        scores[row][col] = row;
      }
    }
    printArray(scores);
  }
  
  public static void printArray(int[][] arr) {
    for (int row = 0; row < 5; row++) {
      for (int col = 0; col < 4; col++) {
        System.out.print(arr[row][col]);
        System.out.print("   ");
      }
      System.out.println("");
    }
}
}
  