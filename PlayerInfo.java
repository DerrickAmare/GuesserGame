import java.util.Scanner;

public class PlayerInfo {

    private  int numOfPlayer;
     private Scanner scanner;

    public int getNumOfPlayer() {

        return numOfPlayer;
    }

    public  void setNumOfPlayer() {

        // specifies number of participants
        scanner = new Scanner(System.in);
        System.out.println("how many players will participate?");
        numOfPlayer =scanner.nextInt();

    }

     //accepts name of player from user and return it
    public String[] playerName(){



         String[] name= new String[numOfPlayer];

            //accepts specified number of player's name
            for(int i=0;i<numOfPlayer;i++) {
                System.out.println("please input player name "+ i);
                 name[i]= scanner.next();
            }
            return name;
    }

}
