import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args){
        String rock="rock";
        String paper="paper";
        String scissors="scissors";
        boolean playAgain = false;

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();



        do {
            String[] moves = {rock, paper, scissors};
            System.out.print("Enter your move(rock,paper,scissors): " );
            String playerMove=scanner.next();
            
            String computerChoice = moves[random.nextInt(moves.length)];
            System.out.println("Computer choice: " + computerChoice);


            if (playerMove.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (playerMove.equals(rock) && computerChoice.equals(scissors) || playerMove.equals(paper) && computerChoice.equals(rock) || playerMove.equals(scissors) && computerChoice.equals(paper)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Play again(yes/no): ");
            String playAgainInput = scanner.next();
            playAgain=playAgainInput.equalsIgnoreCase("yes");
        }
            while (playAgain) ;


        System.out.println("Thanks for playing!");
        scanner.close();
    }

}
