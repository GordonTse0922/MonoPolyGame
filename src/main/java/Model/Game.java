package Model;

import Controller.*;
import Model.Square;
import View.*;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

import static java.util.Map.entry;

public class Game {
    private int turns;
    private DiceController dice1;
    private DiceController dice2;
    private PlayerController[] players;
    private SquareController[] squaresController;
    private static final int numOfSquare=20;

    private static final Map<Integer, Integer> propertyMap = Map.ofEntries(
            entry(2, 800),
            entry(3,700),
            entry(5,600),
            entry(7,400),
            entry(8,500),
            entry(10,400),
            entry(12,700),
            entry(14,400),
            entry(15,500),
            entry(17,400),
            entry(18,400),
            entry(20,600)
    );

    public Game(int totalPlayers){
        turns=0;
        dice1= new DiceController();
        dice2= new DiceController();
        players=new PlayerController[totalPlayers];
        for (int i=0;i<totalPlayers;i++){
            Player player = new Player(0);
            players[i]=new PlayerController(player);
        }
        //TODO add different kind of squares based on the board description
        squaresController=new SquareController[numOfSquare];
    }

    public void start() {
        GameView view = new GameView();
        createMap ();

        while (turns <= 100) {
            //players[0].setBroke();
            //players[2].setBroke();
            if (isEnded()){
                view.printOnePlayerLeft(1);
                break;
            } else {
                for (int i = 0; i < players.length; i++) {
                    boolean playerTurnFinish = false;
                    view.printMap();
                    view.printTurnQuestion(turns);

                    view.printPlayerPosition(i+1, players[i].getPosition());

                    while (!playerTurnFinish){
                        Scanner input = new Scanner(System.in);

                        int result = input.nextInt();

                        if (result == 1) {
                            movePlayer(i);
                            if (propertyMap.containsKey(players[i].getPosition())){
                                if (squaresController[players[i].getPosition()].getPropertyOwner()){
                                }
                            }
                            playerTurnFinish = true;
                        } else {
                            view.printWrongInput();
                            continue;
                        }
                    }
                }
                nextTurn();
            }
        }

        if (turns >= 100){
            view.printTurnsLimit();
        }

        //TODO Start game:
        /*
         1. Print statements indicating game start
         2. While loop to check game end conditions (one left unbroke || >=100 turns) and run the game
         3. Ask for enter to toss dice
         4. End turn when all players are tossed once and start next turn
         */
    }

    public void createMap (){
        squaresController[0]  = new GoSquareController      (new GoSquare      ("Go"           , 1)                                           , new GoSquareView());
        squaresController[1]  = new PropertySquareController(new PropertySquare("Central"      , 2 , propertyMap.get(2), "SkyBlue")  , new PropertySquareView());
        squaresController[2]  = new PropertySquareController(new PropertySquare("Wan Chai"     , 3 , propertyMap.get(3), "SkyBlue")  , new PropertySquareView());
        squaresController[3]  = new TaxSquareController     (new TaxSquare     ("Tax"          , 4)                                           , new TaxSquareView());
        squaresController[4]  = new PropertySquareController(new PropertySquare("Stanley"      , 5 , propertyMap.get(5), "SkyBlue")  , new PropertySquareView());
        squaresController[5]  = new InJailSquareController  (new InJailSquare  ("InJail"       , 6)                                           , new InJailSquareView());
        squaresController[6]  = new PropertySquareController(new PropertySquare("Shek O"       , 7 , propertyMap.get(7), "Red")      , new PropertySquareView());
        squaresController[7]  = new PropertySquareController(new PropertySquare("Mong Kok"     , 8 , propertyMap.get(8), "Red")      , new PropertySquareView());
        squaresController[8]  = new ChanceSquareController  (new ChanceSquare  ("Red Chance"   , 9)                                           , new ChanceSquareView());
        squaresController[9]  = new PropertySquareController(new PropertySquare("Tsing Yi"     , 10, propertyMap.get(10), "Red")     , new PropertySquareView());
        squaresController[10] = new ParkingSquareController (new ParkingSquare ("FreeParking"  , 11)                                          , new ParkingSquareView());
        squaresController[11] = new PropertySquareController(new PropertySquare("Shatin"       , 12, propertyMap.get(12), "DarkBlue"), new PropertySquareView());
        squaresController[12] = new ChanceSquareController  (new ChanceSquare  ("Blue Chance"  , 13)                                          , new ChanceSquareView());
        squaresController[13] = new PropertySquareController(new PropertySquare("Tuen Mum"     , 14, propertyMap.get(14), "DarkBlue"), new PropertySquareView());
        squaresController[14] = new PropertySquareController(new PropertySquare("Tai Po"       , 15, propertyMap.get(15), "DarkBlue"), new PropertySquareView());
        squaresController[15] = new JailSquareController    (new JailSquare    ("GoToJail"     , 16)                                          , new JailSquareView());
        squaresController[16] = new PropertySquareController(new PropertySquare("Sai Kung"     , 17, propertyMap.get(17), "Yellow")  , new PropertySquareView());
        squaresController[17] = new PropertySquareController(new PropertySquare("Yuen Long"    , 18, propertyMap.get(18), "Yellow")  , new PropertySquareView());
        squaresController[18] = new ChanceSquareController  (new ChanceSquare  ("Yellow Chance", 19)                                          , new ChanceSquareView());
        squaresController[19] = new PropertySquareController(new PropertySquare("Tai O"        , 20, propertyMap.get(20), "Yellow")  , new PropertySquareView());
    }

    public int tossDice(){
        return dice1.toss() + dice2.toss();
    }

    public void movePlayer(int id){
        //TODO move player using the dice result
        int moves=tossDice();
        players[id].move(moves);
    }

    public boolean isEnded(){
        //TODO really check with end conditions
        int isNotBroke = 0;
        for (int i = 0; i < players.length-1; i++){
            if(!players[i].getBroke()){
                isNotBroke++;
            }
        }

        if (isNotBroke == 1){
            return true;
        } else {
            return false;
        }
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
        turns ++;
    }

    public PlayerController[] getPlayers(){
        return players;
    }

}
