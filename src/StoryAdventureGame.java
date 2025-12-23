import java.util.Random;
import java.util.Scanner;

public class StoryAdventureGame {
    public static void main(String[] args) {
        String name;
        int chose;
        int randomNumber;
        int chose1;
        int randomNumber1;
        int randomNumber2;
        int remainingStrength;
        int randomNumber3;

        System.out.println("Welcome to the Forest Adventure!");

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name, traveler?: ");
        name = input.nextLine();
        System.out.println();
        System.out.printf("Hello %s! Your journey begins now...\n", name);

        System.out.println("You enter a dark forest and reach a split in the path.");
        System.out.println("DO you: ");
        System.out.println("1 - Go left");
        System.out.println("2 - Go right");

        System.out.print("Chose 1 or 2: ");
        chose = input.nextInt();

        if (chose == 1) {
            System.out.println("You walk along the left path and find a glowing cave.\n");
        } else {
            System.out.println("You are walking down a dark right path.\n");
        }
        System.out.println("Suddenly, a wild creature appears!");

        Random random = new Random();
        randomNumber = random.nextInt(1, 11);
        System.out.print("The creature has a strength of : " + randomNumber);

        do {
            System.out.println("\nWhat will you do?");
            System.out.println("1 - Attack");
            System.out.println("2 - Run");

            System.out.print("Chose 1 or 2: ");
            chose1 = input.nextInt();

           if (chose1==1) {
               randomNumber1 = random.nextInt(1, 11);
               remainingStrength = randomNumber - randomNumber1;
               System.out.println("You strike the creature for " + randomNumber1 + " damage!");
               if (remainingStrength <= 0) {
                   System.out.println("The creature has been defeated!\n");
                   System.out.printf("Congratulation %s! You survived the adventure!\n",name);
                   System.out.println("You leave the forest stronger and wiser.");
                   chose1=0;
               } else {
                   System.out.println("The creature's remaining strength: "+remainingStrength);
                   System.out.println("Player fail! Please try again!");

               }
           }else if (chose1==2) {
               randomNumber3 = random.nextInt(1, 101);
                if (randomNumber3>=50){
                    System.out.println("You escape successfully!");
                    System.out.println("You run out of the forest to safety.");
                       chose1=0;
                 }
                 else {
                  System.out.println("Player fail! Please try again!");

           }

            }
        }while (chose1 !=0);

        input.close();
    }
}
