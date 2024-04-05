import java.util.*;
public class NumberGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int chance = 10;
        int finals = 0;
        boolean playAgain = true;
        System.out.println("->>Welcome to the number guessing game");
        System.out.println("Hey.. You have about "+chance+" chances to win the game");

        while(playAgain) {
            int rand = getrandN(1,100);
            boolean guess = false;
            for(int i=0; i<chance; i++) {
                System.out.println("Chance"+(i+1)+" Enter your guess:");
                int user = sc.nextInt();
                if(user == rand) {
                    guess = true;
                    finals += 1;
                    System.out.println(" Congratulations! You won it.");
                    break;
                }
                else if(user>rand) {
                    System.out.println("To High! Try again");
                }
                else{
                    System.out.println("Too low! Try again");
                }
            }

            if(guess==false) {
                System.out.println("Sorry..You lost the chance.the number is "+rand);
            }
            System.out.println("Do you want to play Again?(yes/no)");
            String pA = sc.next();
            playAgain=pA.equalsIgnoreCase("Yes");
        }
        System.out.println("that's it, Hope you enjoyed it");
        System.out.println("Here is your Score: "+finals);
    }
    public static int getrandN(int min, int max) {
        return (int)(Math.random()*(max-min+1)+min);
    }
}
