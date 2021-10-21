public class Game {
    int turns;
    DieController dice;
    public Game(int totalPlayers){
        dice= new DieController();
    }

    public void start(){
        //TODO start the game
    }

    public int tossDice(){
        return dice.toss();
    }

    public void movePlayer(String name){
        //TODO move player using the dice result
        int moves=dice.toss();
    }
}
