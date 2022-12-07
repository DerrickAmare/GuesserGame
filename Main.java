import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char reply='N';

         do {
             Guesser guess = new Guesser();
             guess.guesser();

             System.out.println("Do you want to play again? 'Y' for yes. Press any key to exit.");
             reply = scanner.next().charAt(0);
         }while( reply=='Y' || reply=='y');

    }
}