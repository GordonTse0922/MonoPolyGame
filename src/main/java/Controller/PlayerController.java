package Controller;

import Model.Player;
import View.PlayerView;

public class PlayerController {
    private Player player;
    private PlayerView view;

    public PlayerController(Player model){
        this.player=model;
        view=new PlayerView();
    }

    public void move(int pos){
        player.move(pos);
    }

    public void setBroke(){
        player.setBroke(true);
    }

    public void addCapital(int amount){
        player.addCapital(amount);
    }

    public void minusCapital(int amount){
        player.minusCapital(amount);
    }

    public void buyProperty(PropertySquareController square){
        player.addProperty(square);
    }

    public boolean getBroke(){
        return player.getBroke();
    }

    public int getCapital(){
        return player.getCapital();
    }

    public int getName(){
        return player.getId();
    }

    public int getPosition(){
        return player.getPosition();
    }

    public void inJail(){
        player.setInJail();
    }

    public void outJail(){
        player.setOutJail();
    }

    public void minusInJailDice(){
        player.minusInJailDice();
    }

    public int getInJailDice() {
        return player.getInJailDice();
    }

    public boolean getPlayerJailStatus(){
        return player.getJailStatus();
    }

    public void printPlayerPosition(){
        int playerNum = getName();
        int pos = getPosition();
        view.printPlayerPosition(playerNum, pos);
    }

    public void printPlayerStatus() {
        int playerNum = getName();
        int pos = getPosition();
        int capital = getCapital();
        boolean jail = getPlayerJailStatus();
        int jailDice = getInJailDice();
        view.printPlayerStatus(playerNum, pos, capital, jail, jailDice);
    }

    public void printYouBroke(){
        int playerNum = getName();
        view.printYouBroke(playerNum);
    }

    public void printCapital(){
        int playerNum = getName();
        int amount = getCapital();
        view.printCapital(playerNum, amount);
    }

}
