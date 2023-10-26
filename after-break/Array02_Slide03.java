// 2D Array
// {row} {column} - [row][column]
// represent the problem into your program
import java.util.Scanner;
public class Array02_Slide03 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    double[][] scores = new double[3][4];
    double[][] sales = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    
    /*
    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 4; col++) {
        System.out.print("Enter a score: ");
        scores[row][col] = kb.nextDouble();
      }
    }
    */
    //printArray(scores);
    printArray(sales);
  }
  
  public static void printArray(double[][] arr) {
    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 4; col++) {
        System.out.print(arr[row][col]);
        System.out.print("   ");
      }
      System.out.println("");
    }
  }
}