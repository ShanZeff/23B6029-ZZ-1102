// Lab 02-1 Part 08
import java.util.Scanner;
public class Lab02_01P08_T05 {
  public static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    double numberOfUnits, unitWeight, pricePerKg;
    double salesTax, resultPrice;
    
    System.out.print("Please enter the number of bags: ");
    numberOfUnits = scanner.nextDouble();
    System.out.print("Please enter the weight per bag (in Kg): ");
    unitWeight = scanner.nextDouble();
    pricePerKg = 5.99;
    salesTax = 0.0725;
    
    resultPrice = calcTotalPrice(numberOfUnits, unitWeight, pricePerKg, salesTax);
    scanner.close();
  }
  
  // calculates the total price
  public static double calcTotalPrice(double myNumOfUnits, double myUnitWeight, double myPricePerKg, double mySalesTax) {
    double totalPrice = myNumOfUnits * myUnitWeight * myPricePerKg;
    double totalPriceWithTax = totalPrice + (totalPrice * mySalesTax);
    printPrice(myPricePerKg, mySalesTax, totalPriceWithTax);
    return totalPriceWithTax;
  }
  
  // prints out the price along with other info
  // appropriate output format of two decimal places
  public static void printPrice(double myPricePerKg, double mySalesTax, double myTotalPriceWithTax) {
    System.out.println("Price per Kg: $" + myPricePerKg);
    System.out.printf("Sales tax: %.2f", (mySalesTax * 100));
    System.out.println("%");
    System.out.printf("The total price is: $%.2f%n", myTotalPriceWithTax);
  }
}