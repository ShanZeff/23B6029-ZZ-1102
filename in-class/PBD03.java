public class PBD03 {
  public static void main(String[] args) {
    String myName, myEyes, myTeeth, myHair;
    int myAge, myHeight, myWeight;
    
    myName = "Cillian Murphy";
    myAge = 47;
    myHeight = 69;     // inches
    myWeight = 155;  // lbs
    myEyes = "Pale blue";
    myTeeth = "White";
    myHair = "Dark brown";
    
    double myHeightCM = myHeight * 2.54;
    double myWeightKG = myWeight * 0.45359237;
    
    System.out.println("Let's talk about " + myName + ".");
    System.out.println("He's " + myHeight + " inches (or " + myHeightCM + " cm) tall.");
    System.out.println("He's pocket sized!");
    System.out.printf("He's " + myWeight + " pounds (or %.1f kg) heavy.%n", myWeightKG);
    System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
    System.out.println("His teeth are usually " + myTeeth + " depending on the coffee.");
    
    int mySum = myAge + myHeight + myWeight;
    System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight + ": I get " + mySum + ".");
  }
}