import java.util.InputMismatchException;
import java.util.Scanner;

public class Guesser {

      PlayerInfo pi= new PlayerInfo();
    String[] name;

      public int guessGenerator(){
             //generate a random between 0-10 to be guessed
          int  randGuess=(int) (Math.random()*10);

          return randGuess;
      }
    public void guesser() {
        int counter=0;
        boolean flag = false;


            pi.setNumOfPlayer();
            name = pi.playerName();
        String winner = null;
            int ran = guessGenerator();

        while ( flag==false && counter < 2) {
            int[] guessedValue = new int[pi.getNumOfPlayer()];
            guessedValue = acceptGuess();

            for (int i = 0; i < pi.getNumOfPlayer(); i++) {
                if (ran == guessedValue[i]) {
                    flag = true;
                     winner=name[i];
                }
            }

            counter++;
        }
        if (flag) {
            System.out.println( winner+" Congrats! You have won the game! " + ran + " was the secret number");
        } else {
            System.out.println("Sorry you have all lost the game. the secret number was " + ran);
        }
    }
    public int[] acceptGuess(){

        Scanner scanner = new Scanner(System.in);

          int [] guess= new int[pi.getNumOfPlayer()];
      try{
            for(int i=0;i<pi.getNumOfPlayer();i++){

                System.out.println( name[i]+" please place your guess");
             guess[i]=scanner.nextInt();
            }}catch (InputMismatchException im){
          System.out.println("Oh NO! Invalid input. please restart the game");

      }
      return guess;
    }
}