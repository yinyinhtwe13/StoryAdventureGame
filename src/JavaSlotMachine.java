import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaSlotMachine {
    public static void main (String[] args){
        int currentBalance=100;
        int betAmount=0;
        int winningAmount=0;
        char playAgain='N';


        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        String[] symbols={"🍓","🍒","🌽","🍄","🥑" };

        System.out.println("Symbols: 🍓 🍒 🌽 🍄 🥑");
        System.out.println("**************************");


        do {
            System.out.println("Current balance: $"+currentBalance);
            System.out.print("Place your bet amount: ");
            betAmount= scanner.nextInt();
            if (betAmount>currentBalance){
                System.out.println("You do not have enough amount");
                continue;
            } else{
            currentBalance -=betAmount;}

            System.out.println("Spinning...");
            System.out.println("***********");
//            String spinningResult=symbols[random.nextInt(symbols.length)];
//            System.out.println(spinningResult);

           String[]results=new String[3];
           for (int i=0;i<3;i++){
             int randomIndex= random.nextInt(symbols.length);
             results[i]=symbols[randomIndex];
           }
            System.out.println(results[0]+" |"+results[1]+" |"+results[2]);
            System.out.println("***********");

           if (results[0].equals(results[1]) && results[1].equals(results[2])){
               winningAmount=betAmount*3;
               System.out.println("You won $"+winningAmount);
               currentBalance +=winningAmount;
           } else if (results[0].equals(results[1]) || results[1].equals(results[2])) {
               winningAmount=betAmount*2;
               System.out.println("You won $"+winningAmount);
              currentBalance +=winningAmount;
           }else {
               System.out.println("Sorry you lost this round");
           }
           if (currentBalance==0){
               System.out.println("Game over!You're out of money!");
               break;
           }
            System.out.print("Do you want to play again?(Y/N): ");
            playAgain=scanner.next().toUpperCase().charAt(0);

        }while (playAgain=='Y' && currentBalance>0);


        scanner.close();
    }
}
