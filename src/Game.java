public class Game {
    int turns;
    DieController dice;
    public Game(int totalPlayers){
        dice= new DieController();
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


}
