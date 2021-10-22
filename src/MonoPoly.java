import java.util.Scanner;

public class MonoPoly {
	private Game game;

    public static void main(String[] args) {
        //TODO Initialize game
        int players=0;
        boolean validPlayers=false;
        System.out.println("Welcome to the MonoPoly!");
        //TODO load saved game
        Scanner scanner = new Scanner(System.in);
        while(!validPlayers){
                System.out.println("Please enter number of players (2-8):");
                players=scanner.nextInt();
                validPlayers=(players>=2 && players<=8);
        }
        scanner.close();
        Game game= new Game(players);
        game.start();
    }




}
