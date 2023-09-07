public class Slide09_14 {
  public static void main(String[] args) {
    // Keeps adding the numbers 1, 2, 3, ... until the sum becomes larger than 1,000,000
    int sum = 0, number = 1, limit = 1000000;
    
    while (sum <= limit) {
      sum += number;
      ++number;
    }
    System.out.println("Sum: " + sum + "   Number: " + number);
    
    // Computes the product of the first 20 odd integers.
    int product = 1, count = 20, lastNumber;
    number = 1;
    lastNumber = 2 * count -1;
    System.out.println(lastNumber);
    
    while (number <= lastNumber) {
      product = product * number;
      number += 2;
    }
    System.out.println(product);
  }
}
