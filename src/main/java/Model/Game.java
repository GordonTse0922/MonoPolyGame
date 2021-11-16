package Model;

import Controller.*;
import View.*;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Game {
    private int turns;
    private GameView view;
    private DiceController dice1;
    private DiceController dice2;
    private PlayerController[] players;
    private static final int numOfSquare=20;

    private SquareController[] squareControllers;

    private static int [] propertySquarePos = {2,3,5,7,8,10,12,14,15,17,18,20};
    private static int [] chanceSquarePos = {9,13,19};

    public Game(int totalPlayers){
        turns=0;
        dice1= new DiceController();
        dice2= new DiceController();
        view = new GameView();
        players=new PlayerController[totalPlayers];
        for (int i=0;i<totalPlayers;i++){
            Player player = new Player(0);
            players[i]=new PlayerController(player);
        }
        //TODO add different kind of squares based on the board description
        squareControllers=new SquareController[numOfSquare];
    }

    public void start() {
        createMap ();

        while (turns <= 100) {
            //players[0].setBroke();
            //players[2].setBroke();

            checkBroke();

            if (isEnded()){
                view.printOnePlayerLeft(1);
                break;
            } else {
                for (int i = 0; i < players.length; i++) {
                    boolean playerTurnFinish = false;
                    view.printMap(squareControllers);
                    view.printPlayerStatus(i+1, players[i].getPosition(), players[i].getCapital(), players[i].getPlayerJailStatus(), players[i].getInJailDice());
                    view.printTurnQuestion(turns);

                    while (!playerTurnFinish){
                        Scanner input = new Scanner(System.in);

                        if (players[i].getPosition() == 6 && players[i].getPlayerJailStatus()){
                            int result = ((InJailSquareController) squareControllers[players[i].getPosition()-1]).callAskPayOrDice(players[i].getInJailDice());

                            if (result == 0){
                                players[i].minusInJailDice();
                            } else if (result == 1){
                                players[i].outJail();
                            } else {
                                players[i].outJail();
                                players[i].minusCapital(150);
                            }
                            playerTurnFinish = true;
                        } else {
                            int result = input.nextInt();

                            if (result == 1) {
                                movePlayer(i);
                                view.printPlayerPosition(i+1, players[i].getPosition());
                                int finalI = i;
                                if (IntStream.of(propertySquarePos).anyMatch(x -> x == players[finalI].getPosition())){
                                    int owner = ((PropertySquareController) squareControllers[players[i].getPosition()-1]).getPropertyOwner();
                                    if (owner == 0){
                                        view.printBuyProperty(((PropertySquareController) squareControllers[players[i].getPosition()-1]).getSquareName(), ((PropertySquareController) squareControllers[players[i].getPosition()-1]).getPropertyCost());

                                        boolean playerBuy = false;
                                        while (!playerBuy){
                                            int result2 = input.nextInt();

                                            if (result2 == 1){
                                                players[i].minusCapital(((PropertySquareController) squareControllers[players[i].getPosition()-1]).getPropertyCost());
                                                ((PropertySquareController) squareControllers[players[i].getPosition()-1]).setPropertyOwner(i+1);
                                                playerBuy = true;
                                            } else if (result2 == 2) {
                                                playerBuy = true;
                                            } else {
                                                view.printWrongInput();
                                                continue;
                                            }
                                        }
                                    } else {
                                        view.printPayRent(((PropertySquareController) squareControllers[players[i].getPosition()-1]).getSquareName(), owner, ((PropertySquareController) squareControllers[players[i].getPosition()-1]).getPropertyRent());
                                        players[i].minusCapital(((PropertySquareController) squareControllers[players[i].getPosition()-1]).getPropertyRent());
                                    }
                                } else if (IntStream.of(chanceSquarePos).anyMatch(x -> x == players[finalI].getPosition())){
                                    int amount = ((ChanceSquareController) squareControllers[players[i].getPosition()-1]).callRandomAmount();
                                    players[i].addCapital(amount);
                                } else if (players[finalI].getPosition() == 4){
                                    int amount = ((TaxSquareController) squareControllers[players[i].getPosition()-1]).callPayTax();
                                    players[i].minusCapital(amount);
                                } else if (players[finalI].getPosition() == 11) {
                                    view.printFreeParking();
                                } else if (players[i].getPosition() == 6) {
                                    view.printJustVisit();
                                } else if (players[finalI].getPosition() == 16){
                                    players[i].inJail();
                                } else {
                                    view.printWrongPos();
                                }
                                playerTurnFinish = true;
                            } else {
                                view.printWrongInput();
                                continue;
                            }
                        }
                    }
                }
                nextTurn();
            }
        }

        if (turns >= 100) {
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
        squareControllers[0] = new GoSquareController (new GoSquare ("Go", 1), new GoSquareView());
        squareControllers[1] = new PropertySquareController(new PropertySquare("Central"      , 2 , "SkyBlue")  , new PropertySquareView());
        squareControllers[2] = new PropertySquareController(new PropertySquare("Wan Chai"     , 3 , "SkyBlue")  , new PropertySquareView());
        squareControllers[3] = new TaxSquareController(new TaxSquare ("Tax", 4), new TaxSquareView());
        squareControllers[4] = new PropertySquareController(new PropertySquare("Stanley"      , 5 , "SkyBlue")  , new PropertySquareView());
        squareControllers[5] = new InJailSquareController (new InJailSquare ("InJail", 6), new InJailSquareView());
        squareControllers[6] = new PropertySquareController(new PropertySquare("Shek O"       , 7 , "Red")      , new PropertySquareView());
        squareControllers[7] = new PropertySquareController(new PropertySquare("Mong Kok"     , 8 , "Red")      , new PropertySquareView());
        squareControllers[8] = new ChanceSquareController  (new ChanceSquare  ("Red Chance"   , 9)                       , new ChanceSquareView());
        squareControllers[9] = new PropertySquareController(new PropertySquare("Tsing Yi"     , 10, "Red")      , new PropertySquareView());
        squareControllers[10] = new ParkingSquareController (new ParkingSquare ("FreeParking" , 11), new ParkingSquareView());
        squareControllers[11] = new PropertySquareController(new PropertySquare("Shatin"       , 12, "DarkBlue") , new PropertySquareView());
        squareControllers[12] = new ChanceSquareController  (new ChanceSquare  ("Blue Chance"  , 13)                      , new ChanceSquareView());
        squareControllers[13] = new PropertySquareController(new PropertySquare("Tuen Mum"     , 14, "DarkBlue") , new PropertySquareView());
        squareControllers[14] = new PropertySquareController(new PropertySquare("Tai Po"       , 15, "DarkBlue") , new PropertySquareView());
        squareControllers[15] = new JailSquareController (new JailSquare ("GoToJail", 16), new JailSquareView());
        squareControllers[16] = new PropertySquareController(new PropertySquare("Sai Kung"     , 17, "Yellow")   , new PropertySquareView());
        squareControllers[17] = new PropertySquareController(new PropertySquare("Yuen Long"    , 18, "Yellow")   , new PropertySquareView());
        squareControllers[18] = new ChanceSquareController  (new ChanceSquare  ("Yellow Chance", 19)                      , new ChanceSquareView());
        squareControllers[19] = new PropertySquareController(new PropertySquare("Tai O"        , 20, "Yellow")   , new PropertySquareView());
    }

    public int tossDice(){
        return dice1.toss() + dice2.toss();
    }

    public void movePlayer(int id){
        //TODO move player using the dice result
        int moves=tossDice();

        if (players[id].getPosition() + moves > 20) {
            view.printPassGo();
            int amount = ((GoSquareController) squareControllers[0]).callGainSalary();
            players[id].addCapital(amount);
        }

        players[id].move(moves);
    }

    public void checkBroke(){
        for (int i =0; i < players.length; i++){
            if (players[i].getCapital() < 0) {
                players[i].setBroke();
            }
        }
    }

    public boolean isEnded(){
        //TODO really check with end conditions
        int isNotBroke = 0;
        for (int i = 0; i < players.length; i++){
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
