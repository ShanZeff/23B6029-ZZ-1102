public class DLab01_15 {
  public static void main(String[] args) {
    double initialBalance, finalBalance;
    initialBalance = 1000;
    finalBalance = initialBalance + (initialBalance * (0.05));
    System.out.println(finalBalance);
    
    initialBalance = finalBalance;
    finalBalance = initialBalance + (initialBalance * (0.05));
    System.out.println(finalBalance);
    
    initialBalance = finalBalance;
    finalBalance = initialBalance + (initialBalance * (0.05));
    System.out.println(finalBalance);
  }
}

// prints balance after 1st, 2nd, 3rd year
// initial balance = $1,000
// interest 5% per year

// initialBalance = 1000
// calcBalance(initialBalance)

// public static void calcBalance(myBalance)
// finalBalance = myBalance + (myBalance * 5%)