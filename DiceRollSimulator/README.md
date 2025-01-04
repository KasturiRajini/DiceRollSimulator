# DiceRollSimulator - Java Program

## Description

The `DiceRollSimulator` is a simple Java program that simulates the rolling of a dice. The user can input how many times they wish to roll the dice, and the program will display the outcome of each roll along with a visual representation of the dice face. After each set of rolls, the program asks the user whether they would like to roll again. The program also calculates the total sum of all rolled dice.

## Features

- **Dice Rolling**: Simulates rolling a six-sided dice.
- **User Input**: Allows the user to specify the number of dice rolls.
- **Dice Display**: The dice face for each roll is displayed using ASCII art.
- **Error Handling**: If the user inputs an invalid number, the program will prompt them again.
- **Total Sum**: Keeps track of and displays the total sum of all dice rolls.
- **Replay Option**: Asks the user if they want to roll the dice again after completing a round.

## Requirements

- Java 8 or higher.
  
## Usage

### Running the Program

1. Compile and run the Java program:
   ```bash
   javac DiceRollSimulator.java
   java DiceRollSimulator
2. The program will ask you how many times you want to roll the dice.

3. Enter the number of dice rolls you would like (e.g., 3).

4. The program will show you the dice face for each roll and the total sum of all rolls.

5. After the dice are rolled, the program will ask if you want to roll again. Type yes to roll again, or no to exit the program.
   Example Output :
   Enter the number of times to roll the dice ?
3
About to roll 3 dice
----------
| o     o |
|         |
| o     o |
----------
----------
| o       |
|         |
|       o |
----------
----------
| o      |
|   o    |
|      o |
----------
Total of dice numbers that you have rolled till now : 12
Do you want to roll the dice again? (yes/no)
yes
Enter the number of times to roll the dice ?
2
About to roll 2 dice
----------
| o     o |
|         |
| o     o |
----------
----------
| o       |
|         |
|       o |
----------
Total of dice numbers that you have rolled till now : 17
Do you want to roll the dice again? (yes/no)
no
Thank You for Playing!
Functions :
main()
The main method serves as the entry point of the program. It runs a loop to continually prompt the user for input and simulates rolling the dice.
It uses Scanner for user input and Random for generating random dice rolls.
After each set of rolls, the total sum of dice rolls is displayed, and the user is prompted whether to continue or exit.
Error Handling :
The program includes basic error handling for invalid user input (non-numeric input).
If a non-numeric value is entered when specifying the number of rolls, the program will notify the user and prompt them to try again.
Acknowledgments :
This project was created as part of a simple learning exercise to simulate dice rolls in Java.
