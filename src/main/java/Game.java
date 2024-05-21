import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void playGame(Player inGamePlayer) {

        //create new scanner and random instance
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //declaring variables
        boolean availableAnswer = false;
        String[] answers = {"rock", "paper", "scissors"};
        int playerPoints = 0;
        int computerPoints =0;
        int numberOfTurns = 0;

        do {
            System.out.println("Please enter your  move... (rock, paper, scissors");
            String playerInput = scanner.nextLine();

            for (String answer : answers) {
                if (answer.equalsIgnoreCase(playerInput)) {
                    availableAnswer = true;
                    break;
                }
            }
            String computerAnswer = answers[random.nextInt(answers.length)];

            if (playerInput.equalsIgnoreCase(computerAnswer)) {
                numberOfTurns++;
                System.out.println("Both Players have chose " + playerInput + ". No Points");
                System.out.println("Player    :    Computer");
                System.out.println("-----------------------");
                System.out.println(playerPoints + "         |         " + computerPoints);

            } else if (playerInput.equalsIgnoreCase("rock") && computerAnswer.equalsIgnoreCase("scissors")) {
                numberOfTurns++;
                playerPoints++;
                System.out.println(inGamePlayer.getName() + " Wins!");
                System.out.println("Player    :    Computer");
                System.out.println("-----------------------");
                System.out.println(playerPoints + "         |         " + computerPoints);

            } else if (playerInput.equalsIgnoreCase("paper") && computerAnswer.equalsIgnoreCase("rock")) {
                numberOfTurns++;
                playerPoints++;
                System.out.println(inGamePlayer.getName() + " Wins!");
                System.out.println("Player    :    Computer");
                System.out.println("-----------------------");
                System.out.println(playerPoints + "         |         " + computerPoints);

            } else if (playerInput.equalsIgnoreCase("scissors") && computerAnswer.equalsIgnoreCase("paper")) {
                numberOfTurns++;
                playerPoints++;
                System.out.println(inGamePlayer.getName() + " Wins!");
                System.out.println("Player    :    Computer");
                System.out.println("-----------------------");
                System.out.println(playerPoints + "         |         " + computerPoints);

            }else if (computerAnswer.equalsIgnoreCase("rock") && playerInput.equalsIgnoreCase("scissors")) {
                numberOfTurns++;
                computerPoints++;
                System.out.println(inGamePlayer.getName() + " Wins!");
                System.out.println("Player    :    Computer");
                System.out.println("-----------------------");
                System.out.println(playerPoints + "         |         " + computerPoints);

            } else if (computerAnswer.equalsIgnoreCase("paper") && playerInput.equalsIgnoreCase("rock")) {
                numberOfTurns++;
                computerPoints++;
                System.out.println(inGamePlayer.getName() + " Wins!");
                System.out.println("Player    :    Computer");
                System.out.println("-----------------------");
                System.out.println(playerPoints + "         |         " + computerPoints);

            } else if (computerAnswer.equalsIgnoreCase("scissors") && playerInput.equalsIgnoreCase("paper")) {
                numberOfTurns++;
                computerPoints++;
                System.out.println(inGamePlayer.getName() + " Wins!");
                System.out.println("Player    :    Computer");
                System.out.println("-----------------------");
                System.out.println(playerPoints + "         |         " + computerPoints);

            }else {
                System.out.println("Invalid entry, please try again...");
            }
        }while(inGamePlayer.getCounter() != numberOfTurns);

        if (playerPoints > computerPoints){
            System.out.println(inGamePlayer.getName() + " Wins! Well done");
        } else if (playerPoints < computerPoints) {
            System.out.println("Computer Wins! Better luck next time");
        }else {
            System.out.println("The Game is a draw! Everybody Wins!");
        }

        System.out.println("Game Over");
    }


}
