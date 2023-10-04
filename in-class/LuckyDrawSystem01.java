import java.util.Scanner;
public class LuckyDrawSystem01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Using scanner to include user's input
         int dice1, dice2; //initializing data types for die(two dices)
        
        while (true){
            System.out.println("Enter two dice rolls (or -1 to exit): ");
             System.out.print("Enter a value for the first dice (numbers are from 1-6):");
        dice1 = scanner.nextInt(); 
        
        //checking for exiting condition
        if (dice1==-1){ 
            System.out.println("Exiting the lucky draw system.");
            break;
        }
        
        // int dice1, dice2; //initializing data types for die(two dices)
        System.out.print("Enter a value for the first dice (numbers are from 1-6):");
        dice1 = scanner.nextInt(); 
        System.out.print("Enter a value for the second dice (numbers are from (1-6):");
        dice2 = scanner.nextInt();
        
        //drawDice();
        //int dice1, dice2;
        //result = addition(dice1, dice2);
        int result = addition(dice1, dice2);
        checkResult(result);
        assignPrize(result);
        //printResult();
        
        // Asking user if they want to play again
        /*while (true){
            int repeat;
            System.out.println("Do you wish to exit? press -1 to exit: ");
            repeat  = scanner.nextInt(); 
        
        //checking for exiting condition
        if (dice1==-1){ 
            System.out.println("Exiting the lucky draw system.");
            break;*/
        
    }
    // This Method is used to draw two dice
    /*public static void drawDice(){
        Scanner scanner = new Scanner(System.in); // Using scanner to include user's input
        int dice1, dice2; //initializing data types for die(two dices)
        System.out.print("Enter a value for the first dice (numbers are from 1-6):");
        dice1 = scanner.nextInt(); 
        System.out.print("Enter a value for the second dice (numbers are from (1-6):");
        dice2 = scanner.nextInt();
    }*/
    }
    //This method is to implement to calculate addition of the die(two dice)
    public static int addition(int dice1, int dice2){
        int result;
        result = dice1 + dice2;
        //System.out.println("result: " + result);
        return result;
    }
    
    // This method is to implement a method to check the result of addition
    public static void checkResult(int result){
    //int result;
    if(result==12){
        System.out.println("Yay, you won the first place!");
    } else if(result<=11 && result>=6){
        System.out.println("Yay, you won the second place!");
    } else if(result<=2 && result>=5){
       System.out.println("Yay, you won the third place!");
    } else{
        System.out.println("Unfortunately, luck is not on your side");
    }
    }
    
    //This method is to implemented to assign lucky draw prizes to each catagory
    public static void assignPrize(int result){
        String prize;
        switch(result){
            case 12: prize = "You won $1000";
            break;
            case 11:
            case 10:
            case 9: 
            case 8: 
            case 7: 
            case 6: prize = "You won $500";
            break;
            case 5:
            case 4: 
            case 3: 
            case 2: prize = "You won $250";
            break;
            default: prize = "You can try again later.";
            break;
        }
        System.out.println(prize);
    }
    
    // This method is implemented to print the result of the lucky draw
    /*public static void printResult(){
        //calling the method
        addition(dice1, dice2);
        int result;
        System.out.println("Your result is: " + result);
    }*/
}
