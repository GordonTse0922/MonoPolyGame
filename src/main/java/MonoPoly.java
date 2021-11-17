import Model.Game;

import java.util.Scanner;

public class MonoPoly {
	private Game game;

    public static void main(String[] args) {
        //TODO Initialize game
        int players=0;
        boolean validPlayers=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the MonoPoly!");
        //TODO load saved game
        System.out.println("Save Game Detected, do you want to load a saved game or start a new one?");
        int load =scanner.nextInt();
        if(load==1){
            Game game=new Game();
            game.start();
        }
        else {

            while (!validPlayers) {
                System.out.println("Please enter number of players (2-6):");
                players = scanner.nextInt();
                validPlayers = (players >= 2 && players <= 6);
            }
            Game game = new Game(players);
            game.start();
        }
    }






}
