import java.util.Random;
import java.util.Scanner;

public class DiceRollSimulator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean rollingDice = true;
        
        while (rollingDice) {
            int numberOfTimes = 0;
            int totalofRandomGeneratedNumber = 0;
            try{
                System.out.println("Enter the number of times to roll the dice ?");
                numberOfTimes = scanner.nextInt();
                System.out.println("About to roll "+numberOfTimes+" dice");

                Random rand = new Random();
                //additional one is added here by adding the dice numbers 
        
                for(int i = 0;i < numberOfTimes;i++){
                        int generatedNumber = rand.nextInt(6) + 1;
                        System.out.println(display(generatedNumber));
                        totalofRandomGeneratedNumber += generatedNumber;
                }
            }
            catch(Exception e){
                System.out.println("That was not a valid number !");
                scanner.next();
            }
            System.out.println("Total of dice numbers that you have rolled till now : "+ totalofRandomGeneratedNumber);
            System.out.println("Do you want to roll the dice again? (yes/no)");
            String userAnswer = scanner.next().trim().toLowerCase();

            if (!userAnswer.equals("yes")) {
                rollingDice = false; // Stop the loop if the user doesn't want to roll again
            }
        }
        System.out.println("Thank You for Playing!");
    }
       
    static String display(int value){
        switch (value) {
            case 1:
                return "----------\n|         |\n|    o    |\n|         |\n----------";
                
            case 2:

                return "----------\n| o       |\n|         |\n|       o |\n----------";
            case 3:

                return "----------\n| o      |\n|   o    |\n|      o |\n----------";
            case 4:

                return "----------\n| o     o |\n|         |\n| o     o |\n----------";
            case 5:

                return "----------\n| o     o |\n|    o    |\n| o     o |\n----------";
            case 6:

                return "----------\n| o     o |\n| o     o |\n| o     o |\n----------";
        
            default:
                return "not a valid dice value!";
        }

    }
}