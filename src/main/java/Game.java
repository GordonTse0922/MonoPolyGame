import java.util.ArrayList;
import java.util.List;

public class Game {
    private int turns;
    private DiceController dice;
    private PlayerController[] players;
    private Square[] squares;
    private static final int numOfSquare=20;
    public Game(int totalPlayers){
        turns=0;
        dice= new DiceController();
        players=new PlayerController[totalPlayers];
        for (int i=0;i<totalPlayers;i++){
            Player player = new Player(0);
            players[i]=new PlayerController(player);
        }
        //TODO add different kind of squares based on the board description
        squares=new Square[numOfSquare];
    }

    public void start(){
        //TODO Start game:
        /*
         1. Print statements indicating game start
         2. While loop to check game end conditions (one left unbroke || >=100 turns) and run the game
         3. Ask for enter to toss dice
         4. End turn when all players are tossed once and start next turn
         */
    }

    public int tossDice(){
        return dice.toss();
    }

    public void movePlayer(String name){
        //TODO move player using the dice result
        int moves=dice.toss();
    }

    public boolean isEnded(){
        //TODO really check with end conditions
        return false;
    }

    public void end(){
        //TODO end statements
    }

    public void save(){
        //TODO implement save game
    }

    public void load(){
        //TODO implement load game
    }

    public void nextTurn(){
        //TODO next turn
    }


}
