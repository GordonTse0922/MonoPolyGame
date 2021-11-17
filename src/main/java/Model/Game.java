package Model;

import Controller.*;
import View.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
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

    public Game(){
        System.out.println("TEST");
        List<Integer> data=load();
        int totalPlayers=data.get(0);
        int []pos={data.get(15),data.get(16)};
        int [] caps={data.get(17),data.get(18)};
        int [] jails={data.get(19),data.get(20)};
        turns=data.get(1);
        dice1= new DiceController(1);
        dice2= new DiceController(2);
        view = new GameView();
        players=new PlayerController[totalPlayers];
        for (int i=0;i<totalPlayers;i++){
            Player player = new Player(i+1);
            players[i]=new PlayerController(player);
            players[i].load(pos[i],caps[i],jails[i]);
        }
        //TODO add different kind of squares based on the board description
        squareControllers=new SquareController[numOfSquare];
    }
    public Game(int totalPlayers){
        turns=1;
        dice1= new DiceController(1);
        dice2= new DiceController(2);
        view = new GameView();
        players=new PlayerController[totalPlayers];
        for (int i=0;i<totalPlayers;i++){
            Player player = new Player(i+1);
            players[i]=new PlayerController(player);
        }
        //TODO add different kind of squares based on the board description
        squareControllers=new SquareController[numOfSquare];
    }

    public void start() {
        createMap ();

        while (turns <= 100) {
            checkBroke();
<<<<<<< HEAD
            ArrayList<Integer> notBroke = new ArrayList<Integer>();
            notBroke = isEnded();
            if (notBroke.size() == 1){
                view.printOnePlayerLeft(notBroke.get(0));
=======
            if (isEnded()){
                view.printOnePlayerLeft(1);
>>>>>>> origin/main
                break;
            } else {
                for (int i = 0; i < players.length; i++) {
                    if (players[i].getCapital() >= 0) {
                        boolean playerTurnFinish = false;
                        boolean justLeaveJail = false;

                        view.printMap(squareControllers);
                        players[i].printPlayerStatus();

                        while (!playerTurnFinish) {
                            Scanner input = new Scanner(System.in);

                            if (players[i].getPosition() == 6 && players[i].getPlayerJailStatus()) {
                                int dice1Result = dice1.tossWithOutPrint();
                                int dice2Result = dice2.tossWithOutPrint();
                                int result = ((InJailSquareController) squareControllers[players[i].getPosition() - 1]).callAskPayOrDice(players[i].getInJailDice(), dice1Result, dice2Result);

                                if (result == 0) {
                                    players[i].minusInJailDice();
                                    dice1.updateAfterToss(dice1Result);
                                    dice2.updateAfterToss(dice2Result);
                                    playerTurnFinish = true;
                                } else if (result == 1) {
                                    players[i].outJail();
                                    justLeaveJail = true;
                                    dice1.updateAfterToss(dice1Result);
                                    dice2.updateAfterToss(dice2Result);
                                    players[i].move(dice1Result+dice2Result);
                                    view.printTotalMove(dice1Result+dice2Result);
                                } else {
                                    players[i].outJail();
                                    justLeaveJail = true;
                                    players[i].minusCapital(150);
                                    players[i].printCapital();
                                    dice1.updateAfterToss(dice1Result);
                                    dice2.updateAfterToss(dice2Result);
                                    players[i].move(dice1Result+dice2Result);
                                    view.printTotalMove(dice1Result+dice2Result);
                                }
                            } else {
                                int result = 0;

                                if (justLeaveJail != true) {
                                    view.printTurnQuestion(turns);
                                    result = input.nextInt();
                                }

                                if (result == 1 || justLeaveJail == true) {
                                    if (justLeaveJail != true) {
                                        movePlayer(i);
                                    }
                                    players[i].printPlayerPosition();
                                    int finalI = i;
                                    // Property Square
                                    if (IntStream.of(propertySquarePos).anyMatch(x -> x == players[finalI].getPosition())) {
                                        int owner = ((PropertySquareController) squareControllers[players[i].getPosition() - 1]).getPropertyOwner();
                                        if (owner == 0) {
                                            ((PropertySquareController) squareControllers[players[i].getPosition() - 1]).printBuyProperty();

                                            boolean playerBuy = false;
                                            while (!playerBuy) {
                                                int result2 = input.nextInt();

                                                if (result2 == 1) {
                                                    players[i].minusCapital(((PropertySquareController) squareControllers[players[i].getPosition() - 1]).getPropertyCost());
                                                    ((PropertySquareController) squareControllers[players[i].getPosition() - 1]).setPropertyOwner(i + 1);
                                                    players[i].buyProperty((PropertySquareController) squareControllers[players[i].getPosition() - 1]);
                                                    playerBuy = true;
                                                    players[i].printCapital();
                                                } else if (result2 == 2) {
                                                    playerBuy = true;
                                                } else {
                                                    view.printWrongInput();
                                                    continue;
                                                }
                                            }
                                        } else {
                                            if (((PropertySquareController) squareControllers[players[i].getPosition() - 1]).getPropertyOwner() != i + 1) {
                                                ((PropertySquareController) squareControllers[players[i].getPosition() - 1]).printPayRent();
                                                players[i].minusCapital(((PropertySquareController) squareControllers[players[i].getPosition() - 1]).getPropertyRent());
                                                players[((PropertySquareController) squareControllers[players[i].getPosition() - 1]).getPropertyOwner()-1].addCapital(((PropertySquareController) squareControllers[players[i].getPosition() - 1]).getPropertyRent());

                                                players[i].printCapital();
                                                players[((PropertySquareController) squareControllers[players[i].getPosition() - 1]).getPropertyOwner()-1].printCapital();
                                            } else {
                                                ((PropertySquareController) squareControllers[players[i].getPosition() - 1]).printYourProperty();
                                            }
                                        }
                                    // Chance Square
                                    } else if (IntStream.of(chanceSquarePos).anyMatch(x -> x == players[finalI].getPosition())) {
                                        int amount = ((ChanceSquareController) squareControllers[players[i].getPosition() - 1]).callRandomAmount();
                                        players[i].addCapital(amount);
                                        players[i].printCapital();
                                    // Tax Square
                                    } else if (players[finalI].getPosition() == 4) {
                                        int amount = ((TaxSquareController) squareControllers[players[i].getPosition() - 1]).callPayTax(players[i].getCapital());
                                        players[i].addCapital(-amount);

                                        players[i].printCapital();
                                    // Parking Square
                                    } else if (players[finalI].getPosition() == 11) {
                                        ((ParkingSquareController) squareControllers[players[i].getPosition() - 1]).printFreeParking();
                                    // In Jail Square
                                    } else if (players[i].getPosition() == 6) {
                                        ((InJailSquareController) squareControllers[players[i].getPosition() - 1]).printJustVisit();
                                    // Jail Square
                                    } else if (players[finalI].getPosition() == 16) {
                                        ((JailSquareController) squareControllers[players[i].getPosition() - 1]).printInJailed();
                                        players[i].inJail();
                                    // Go Square
                                    } else if (players[finalI].getPosition() == 1){

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
                    } else {
                        players[i].printYouBroke();
                    }
                }
                nextTurn();
            }
        }

        if (turns >= 100) {
            view.printTurnsLimit();

            ArrayList<Integer> notBroke = new ArrayList<Integer>();
            notBroke = isEnded();

            view.printTie(notBroke);
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

        view.printTotalMove(moves);

        int previousPos = players[id].getPosition();
        players[id].move(moves);

        if (players[id].getPosition() < previousPos + moves) {
            if (players[id].getPosition() != 1) {
                ((GoSquareController) squareControllers[0]).printPassGo();
            } else {
                ((GoSquareController) squareControllers[0]).printInGo();
            }

            int amount = ((GoSquareController) squareControllers[0]).callGainSalary();
            players[id].addCapital(amount);
            players[id].printCapital();
        }
    }

    public void checkBroke(){
        for (int i =0; i < players.length; i++){
            if (players[i].getCapital() < 0 && !players[i].getBroke()) {

                players[i].setBroke();
                List<PropertySquareController> ownedProperty = players[i].getProperties();

                for (int j = 0; j < ownedProperty.size(); j++){
                    ((PropertySquareController) squareControllers[ownedProperty.get(j).getSquareIndex()-1]).setPropertyOwner(0);
                }

                players[i].clearProperty();
            }
        }
    }

    public ArrayList<Integer> isEnded(){
        ArrayList<Integer> notBroke = new ArrayList<Integer>();
        //TODO really check with end conditions
        int isNotBroke = 0;
        for (int i = 0; i < players.length; i++){
            if(!players[i].getBroke()){
                notBroke.add(players[i].getName());
            }
        }

        return notBroke;
    }

    public void end(){
        //TODO end statements
    }

    public void save(){
        //TODO implement save game
    }

    public List load() {
        //TODO implement load game
        System.out.println("Welcome back");
        List<Integer> savedData= new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("saveFile.txt"));

            int totalPlayers = Integer.parseInt(br.readLine());
            int round = Integer.parseInt(br.readLine());
            savedData.add(totalPlayers);
            savedData.add(round);
            for (int i = 0; i < 12; i++) { // 0 = no owners
                int temp = Integer.parseInt(br.readLine());
                savedData.add(temp);
            }
            System.out.println(savedData.size());

             savedData.add(Integer.parseInt(br.readLine()));

            for (int j = 0; j < totalPlayers; j++) {
                int temp = Integer.parseInt(br.readLine());
                savedData.add(temp);
            }

            for (int k = 0; k < totalPlayers; k++) {
                int temp = Integer.parseInt(br.readLine());
                savedData.add(temp);
            }
            savedData.add(Integer.parseInt(br.readLine()));

            br.close();

        } catch (FileNotFoundException e) {
//            e.printStackTrace();
        } catch (IOException e) {
//            e.printStackTrace();
        }
        return savedData;
    }

        public void nextTurn(){
        //TODO next turn
        turns ++;
    }

    public PlayerController[] getPlayers(){
        return players;
    }

}
