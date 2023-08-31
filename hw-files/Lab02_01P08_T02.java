// Lab 02-1 Part 08
public class Lab02_01P08_T02 {
  public static void main(String[] args) {
    double currentAmount = 1000.0;
    int currentYear = 2013;
    int otherYear01 = 2009;
    int otherYear02 = 2025;
    int otherYear03 = 2040;
    
    System.out.println("The current amount is: $" + currentAmount);
    System.out.println("The current year is: " + currentYear);
    calcAmount(otherYear01, currentYear, currentAmount);
    calcAmount(otherYear02, currentYear, currentAmount);
    calcAmount(otherYear03, currentYear, currentAmount);
  }
  
  // calculates the inflation and other amount
  public static void calcAmount(int myOtherYear, int myCurrentYear, double myCurrentAmount) {
    int inflation = myOtherYear - myCurrentYear;
    double otherAmount = myCurrentAmount * Math.pow(0.97, inflation);
    // appropriate output format of two decimal places
    System.out.printf("The amount for year " + myOtherYear + " is $%.2f%n", otherAmount);
  }
}