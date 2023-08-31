public class Lab01P06_T15 {
  public static void main(String[] args) {
    double initialBalance, firstBalance, secondBalance, thirdBalance;
    initialBalance = 1000.00;
    firstBalance = calcBalance(initialBalance);
    secondBalance = calcBalance(firstBalance);
    thirdBalance = calcBalance(secondBalance);
    
    System.out.printf("The balance after the first year is $%.2f.%n", firstBalance);
    System.out.printf("The balance after the second year is $%.2f.%n", secondBalance);
    System.out.printf("The balance after the third year is $%.2f.%n", thirdBalance);
  }
  
  public static double calcBalance(double myBalance) {
    double currentBalance = myBalance;
    double finalBalance = currentBalance + (currentBalance * (0.05));
    return finalBalance;
  }
}
