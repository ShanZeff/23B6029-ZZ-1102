// Lab 01 Part 06
public class Lab01P06_T15 {
  public static void main(String[] args) {
    double initialBalance, firstBalance, secondBalance, thirdBalance;
    initialBalance = 1000.00;
    // call the calculation method for each year
    firstBalance = calcBalance(initialBalance);
    secondBalance = calcBalance(firstBalance);
    thirdBalance = calcBalance(secondBalance);
    
    // prints out the balance for each year
    System.out.printf("The balance after the first year is $%.2f.%n", firstBalance);
    System.out.printf("The balance after the second year is $%.2f.%n", secondBalance);
    System.out.printf("The balance after the third year is $%.2f.%n", thirdBalance);
  }
  
  // calculate balance for each year
  public static double calcBalance(double myBalance) {
    double currentBalance = myBalance;
    double finalBalance = currentBalance + (currentBalance * (0.05));
    return finalBalance;
  }
}
